package com.a7medkenawy.madarsoft.presentaion.fragments.adduser

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.a7medkenawy.madarsoft.R
import com.a7medkenawy.madarsoft.databinding.FragmentAddUserBinding
import com.a7medkenawy.madarsoft.domain.model.User
import com.a7medkenawy.madarsoft.presentaion.fragments.adduser.viewmodel.AddUserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddUser : Fragment() {
    private val viewModel by viewModels<AddUserViewModel>()
    lateinit var binding: FragmentAddUserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAddUserBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.saveBtn.setOnClickListener {
            viewModel.saveUser(saveUser())
        }

        return binding.root
    }

    private fun saveUser(): User {
        var name = binding.nameEd.text.toString()
        var age = (binding.ageEd.text.toString()).toInt()
        var jopTitle = binding.jopTitleEd.text.toString()
        var gender = binding.genderEd.text.toString()
        return User(0, name, age, jopTitle, gender)
    }


}