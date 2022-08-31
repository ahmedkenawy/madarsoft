package com.a7medkenawy.madarsoft.di

import android.content.Context
import androidx.room.Room
import com.a7medkenawy.madarsoft.data.database.database.UserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            UserDatabase::class.java,
            "users_database"
        ).build()

    @Singleton
    @Provides
    fun provideDao(database: UserDatabase) = database.userDao()
}