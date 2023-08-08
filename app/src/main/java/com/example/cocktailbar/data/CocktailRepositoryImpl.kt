package com.example.cocktailbar.data

import com.example.cocktailbar.data.Cocktail
import com.example.cocktailbar.data.CocktailDao
import com.example.cocktailbar.data.CocktailRepository

class CocktailRepositoryImpl(private val cocktailDao: CocktailDao) : CocktailRepository {

    override suspend fun insertCocktail(cocktail: Cocktail) {
        cocktailDao.insertCocktail(cocktail)
    }

    override suspend fun updateCocktail(cocktail: Cocktail) {
        cocktailDao.updateCocktail(cocktail)
    }

    override suspend fun deleteCocktail(cocktail: Cocktail) {
        cocktailDao.deleteCocktail(cocktail)
    }

    override suspend fun getCocktailById(cocktailId: Long): Cocktail? {
        return cocktailDao.getCocktailById(cocktailId)
    }

    override suspend fun getAllCocktails(): List<Cocktail> {
        return cocktailDao.getAllCocktails()
    }
}