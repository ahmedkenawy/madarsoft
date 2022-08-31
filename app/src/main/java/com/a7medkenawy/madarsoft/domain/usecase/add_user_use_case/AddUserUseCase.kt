package com.a7medkenawy.madarsoft.domain.usecase.add_user_use_case

import com.a7medkenawy.madarsoft.domain.model.User
import com.a7medkenawy.madarsoft.domain.repository.UserRepository
import javax.inject.Inject

class AddUserUseCase @Inject constructor(private val repository: UserRepository) {
    suspend fun saveUser(user: User) {
        repository.saveUser(user)
    }
}