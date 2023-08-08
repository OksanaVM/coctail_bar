package com.example.cocktailbar.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Ingredients")
data class Ingredient(
    @PrimaryKey(autoGenerate = true) var id : Int,
    @ColumnInfo(name = "cocktailId") var cocktailID : Int,
    @ColumnInfo(name = "name")  var name : String,
    @ColumnInfo(name = "attributes")  var attributes: String
)