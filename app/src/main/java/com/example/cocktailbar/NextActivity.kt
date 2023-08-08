package com.example.cocktailbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        // Находим кнопку Next
        val nextButton = findViewById<Button>(R.id.cocktailButton1)

        // Добавляем слушатель нажатия на кнопку
        nextButton.setOnClickListener {
            // Создаем Intent для перехода на новую активность (страницу)
            val intent = Intent(this@NextActivity, Next2Activity::class.java)
            startActivity(intent) // Запускаем активность
        }
    }
}