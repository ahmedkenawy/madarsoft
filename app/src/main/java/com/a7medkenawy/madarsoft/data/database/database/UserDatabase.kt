package com.a7medkenawy.madarsoft.data.database.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.a7medkenawy.madarsoft.data.database.dao.UserDao
import com.a7medkenawy.madarsoft.domain.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}