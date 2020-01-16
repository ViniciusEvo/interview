package br.com.evcash.booklist

data class Book(
    val name: String,
    val authors: List<String>,
    val genre: Long,
    val isbn: Long
)