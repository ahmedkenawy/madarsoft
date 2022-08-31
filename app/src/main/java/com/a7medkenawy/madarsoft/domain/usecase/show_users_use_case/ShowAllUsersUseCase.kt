package com.a7medkenawy.madarsoft.domain.usecase.show_users_use_case

import com.a7medkenawy.madarsoft.domain.model.User
import com.a7medkenawy.madarsoft.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ShowAllUsersUseCase @Inject constructor(private val repository: UserRepository) {
    fun showAllUsers(): Flow<List<User>> {
        return repository.showAllUsers()
    }
}