package com.a7medkenawy.madarsoft.domain.repository

import com.a7medkenawy.madarsoft.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun saveUser(user: User)
    fun showAllUsers():Flow<List<User>>
}