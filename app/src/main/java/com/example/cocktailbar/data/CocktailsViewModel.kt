package com.example.cocktailbar.data

import androidx.lifecycle.ViewModel
import com.example.cocktailbar.data.Cocktail
import com.example.cocktailbar.data.CocktailRepository

class CocktailsViewModel(private val cocktailRepository: CocktailRepository) : ViewModel() {

    suspend fun addCocktail(cocktail: Cocktail) {
        cocktailRepository.insertCocktail(cocktail)
    }

    suspend fun updateCocktail(cocktail: Cocktail) {
        cocktailRepository.updateCocktail(cocktail)
    }

    suspend fun deleteCocktail(cocktail: Cocktail) {
        cocktailRepository.deleteCocktail(cocktail)
    }

    suspend fun getCocktailById(cocktailId: Long): Cocktail? {
        return cocktailRepository.getCocktailById(cocktailId)
    }

    suspend fun getAllCocktails(): List<Cocktail> {
        return cocktailRepository.getAllCocktails()
    }
}