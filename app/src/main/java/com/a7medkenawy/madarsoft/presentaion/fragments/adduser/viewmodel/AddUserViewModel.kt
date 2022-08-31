package com.a7medkenawy.madarsoft.presentaion.fragments.adduser.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a7medkenawy.madarsoft.domain.model.User
import com.a7medkenawy.madarsoft.domain.usecase.add_user_use_case.AddUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddUserViewModel @Inject constructor(
    private val addUserUseCase: AddUserUseCase,
) : ViewModel() {

    fun saveUser(user: User) = viewModelScope.launch(Dispatchers.IO) {
        addUserUseCase.saveUser(user)
    }
}