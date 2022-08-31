package com.a7medkenawy.madarsoft.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.a7medkenawy.madarsoft.domain.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUser(user: User)

    @Query("select * from users_table ")
    fun showAllUsers(): Flow<List<User>>
}