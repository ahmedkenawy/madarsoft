package com.a7medkenawy.madarsoft.presentaion.fragments.showusers.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.a7medkenawy.madarsoft.databinding.UserRowLayoutBinding
import com.a7medkenawy.madarsoft.domain.model.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var users = emptyList<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            UserRowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var currentRecipe = users[position]
        holder.binding.user = currentRecipe
        holder.binding.executePendingBindings()
    }

    override fun getItemCount(): Int = users.size


    fun setData(newUsers: List<User>) {
        var recipesDiffUtil = UsersDiffUtil(users, newUsers)
        var diffResult = DiffUtil.calculateDiff(recipesDiffUtil)
        users = newUsers
        diffResult.dispatchUpdatesTo(this)
    }

    class UserViewHolder(val binding: UserRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {}
}