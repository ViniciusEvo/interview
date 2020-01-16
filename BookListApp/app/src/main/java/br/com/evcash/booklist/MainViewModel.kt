package br.com.evcash.booklist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repo = MainRepo()

    val items = MutableLiveData<ArrayList<Book>>()

    fun fetchBooks() {
        viewModelScope.launch {
            items.value = repo.getBooks()
        }
    }
}