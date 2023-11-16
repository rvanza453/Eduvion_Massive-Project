package com.example.eduvion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)

            Handler().postDelayed({
                // Arahkan ke activity utama setelah delay selesai
                val intent = Intent(this@SplashScreen, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }, 2000) // Delay dalam milidetik (misalnya, 3000ms atau 3 detik)
        }
    }
