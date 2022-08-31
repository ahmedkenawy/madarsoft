package com.a7medkenawy.madarsoft.data.repository

import com.a7medkenawy.madarsoft.data.database.dao.UserDao
import com.a7medkenawy.madarsoft.data.database.database.UserDatabase
import com.a7medkenawy.madarsoft.domain.model.User
import com.a7medkenawy.madarsoft.domain.repository.UserRepository
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userDatabase: UserDatabase
) : UserRepository {
    override suspend fun saveUser(user: User) {
        userDatabase.userDao().saveUser(user)
    }

    override fun showAllUsers(): Flow<List<User>> {
        return userDatabase.userDao().showAllUsers()
    }
}
