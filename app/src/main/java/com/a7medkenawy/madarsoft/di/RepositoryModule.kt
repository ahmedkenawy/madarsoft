package com.a7medkenawy.madarsoft.di

import com.a7medkenawy.madarsoft.data.database.dao.UserDao
import com.a7medkenawy.madarsoft.data.database.database.UserDatabase
import com.a7medkenawy.madarsoft.data.repository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesUserRepository(userDatabase: UserDatabase): UserRepositoryImpl {
        return UserRepositoryImpl(userDatabase)
    }
}