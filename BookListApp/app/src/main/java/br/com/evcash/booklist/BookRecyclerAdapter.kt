package br.com.evcash.booklist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class BookRecyclerAdapter : RecyclerView.Adapter<BookRecyclerAdapter.ViewHolder>() {

    private val books = ArrayList<Book>()
    var currentFavorite: Book? = null

    fun updateBooks(newBooks: ArrayList<Book>) {
        books.clear()
        books.addAll(newBooks)
        notifyDataSetChanged()
    }

    fun updateFavoriteBook(isbn: Long) {
        currentFavorite = books.first { book ->
            book.isbn == isbn
        }
        notifyDataSetChanged()
    }

    override fun getItemCount() = books.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.book_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        holder.run {
            bookName.text = book.name

            val isFavorite = book.isbn == currentFavorite?.isbn

            if (isFavorite) {
                favoriteToggle.setImageDrawable(
                    ContextCompat.getDrawable(
                        favoriteToggle.context,
                        R.drawable.baseline_star_black_24
                    )
                )
            }

            favoriteToggle.setOnClickListener {
                updateFavoriteBook(book.isbn)
            }

            bookGenre.text = Genre.getNameById(book.genre)
            bookIsbn.text = book.isbn.toString()
            bookAuthors.text = book.authors.joinToString()
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        //Alterar essas inicializações para utilizar as view criadas no layout
        val bookName: TextView = TextView(view.context)
        val favoriteToggle: ImageView = ImageView(view.context)
        val bookGenre: TextView = TextView(view.context)
        val bookIsbn: TextView = TextView(view.context)
        val bookAuthors: TextView = TextView(view.context)
    }
}