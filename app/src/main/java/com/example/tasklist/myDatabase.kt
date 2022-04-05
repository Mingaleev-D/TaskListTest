package com.example.tasklist

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tasklist.DAO
import com.example.tasklist.Entity

@Database(entities = [Entity::class],version=1)
abstract class myDatabase : RoomDatabase() {
    abstract fun dao(): DAO
}