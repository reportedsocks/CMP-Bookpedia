package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favouriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test",
        authors = listOf("Daniil Antsyferov"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 3.5777,
        ratingCount = 10,
        numPages = null,
        numEditions = 1
    )
}
