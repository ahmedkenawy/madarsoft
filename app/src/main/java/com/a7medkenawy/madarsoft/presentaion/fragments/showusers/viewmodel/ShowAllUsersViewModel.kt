package com.a7medkenawy.madarsoft.presentaion.fragments.showusers.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.a7medkenawy.madarsoft.domain.usecase.add_user_use_case.AddUserUseCase
import com.a7medkenawy.madarsoft.domain.usecase.show_users_use_case.ShowAllUsersUseCase
import javax.inject.Inject

class ShowAllUsersViewModel @Inject constructor(
    private val showAllUsersUseCase: ShowAllUsersUseCase,
) : ViewModel() {

    val showAllUsers = showAllUsersUseCase.showAllUsers().asLiveData()
}