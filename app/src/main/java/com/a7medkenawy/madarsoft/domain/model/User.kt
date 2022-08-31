package com.a7medkenawy.madarsoft.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val name: String?,
    val age: Int?,
    val jopTitle: String?,
    val gender: String?,
)