package com.example.cocktailbar.data

interface CocktailRepository {
    suspend fun insertCocktail(cocktail: Cocktail)
    suspend fun updateCocktail(cocktail: Cocktail)
    suspend fun deleteCocktail(cocktail: Cocktail)
    suspend fun getCocktailById(cocktailId: Long): Cocktail?
    suspend fun getAllCocktails(): List<Cocktail>
}