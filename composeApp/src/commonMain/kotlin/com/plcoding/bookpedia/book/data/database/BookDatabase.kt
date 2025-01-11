package com.plcoding.bookpedia.book.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [BookEntity::class],
    version = 1
)
@TypeConverters(
    StringListTypeConverter::class
)
abstract class BookDatabase: RoomDatabase() {

    abstract val booksDao: FavouriteBookDao

    companion object {
        const val DB_NAME = "book_db"
    }

}