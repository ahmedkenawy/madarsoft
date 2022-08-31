package com.a7medkenawy.madarsoft.presentaion.fragments.showusers.adapter

import androidx.recyclerview.widget.DiffUtil
import com.a7medkenawy.madarsoft.domain.model.User

class UsersDiffUtil(val oldList: List<User>, val newList: List<User>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] === newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }
}