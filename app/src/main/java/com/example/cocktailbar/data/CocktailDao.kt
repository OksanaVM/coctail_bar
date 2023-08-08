package com.example.cocktailbar.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CocktailDao {
    @Insert
    suspend fun insertCocktail(cocktail: Cocktail)

    @Update
    suspend fun updateCocktail(cocktail: Cocktail)
    @Query("SELECT * FROM Ingredients WHERE cocktailId = :cocktailID")
    suspend fun getIngredients(cocktailID: Int): List<Ingredient>
    @Query("SELECT * FROM cocktails")
    suspend fun getAllCocktails(): List<Cocktail>

    @Query("SELECT * FROM cocktails WHERE id = :cocktailId")
    suspend fun getCocktailById(cocktailId: Long): Cocktail?
    @Update
    suspend fun updateIngredient(ingredient: Ingredient)
    @Delete
    suspend fun deleteCocktail(cocktail: Cocktail)
    @Delete
    suspend fun deleteIngredient(ingredient: Ingredient)

}