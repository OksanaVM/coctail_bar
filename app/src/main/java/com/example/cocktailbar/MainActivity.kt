package com.example.cocktailbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_cocktails_layout)

        // Находим кнопку Next
        val nextButton = findViewById<Button>(R.id.addCocktailButton)

        // Добавляем слушатель нажатия на кнопку
        nextButton.setOnClickListener {
            // Создаем Intent для перехода на новую активность (страницу)
            val intent = Intent(this@MainActivity, NextActivity::class.java)
            startActivity(intent) // Запускаем активность
        }
    }
}