package br.com.evcash.booklist

sealed class Genre(val id: Long, val name: String) {

    companion object {
        fun getNameById(genreId: Long): String {
            return ""
        }
    }
}