package br.com.evcash.booklist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel = MainViewModel()
    private val bookAdapter by lazy { BookRecyclerAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        viewModel.items.observe(this, Observer { books ->
            bookAdapter.updateBooks(books)
        })

        viewModel.fetchBooks()

        books_list.adapter = bookAdapter
    }
}