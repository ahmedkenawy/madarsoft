package com.a7medkenawy.madarsoft.presentaion.fragments.showusers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.a7medkenawy.madarsoft.R
import com.a7medkenawy.madarsoft.databinding.FragmentShowUsersBinding
import com.a7medkenawy.madarsoft.presentaion.fragments.showusers.adapter.UserAdapter
import com.a7medkenawy.madarsoft.presentaion.fragments.showusers.viewmodel.ShowAllUsersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowUsers : Fragment() {
    private val viewModel by viewModels<ShowAllUsersViewModel>()
    lateinit var binding: FragmentShowUsersBinding
    lateinit var userAdapter: UserAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentShowUsersBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        userAdapter = UserAdapter()

        binding.usersRv.layoutManager = LinearLayoutManager(requireContext())
        viewModel.showAllUsers.observe(viewLifecycleOwner) { users ->
            if (users.isNotEmpty()) {
                userAdapter.setData(users)
                binding.usersRv.adapter = userAdapter
            } else
                Toast.makeText(requireContext(), "No Users yet", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }


}