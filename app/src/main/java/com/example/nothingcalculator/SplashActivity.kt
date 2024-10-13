package com.example.nothingcalculator

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val textNothing = findViewById<TextView>(R.id.splash_text_nothing)
        val textCalculator = findViewById<TextView>(R.id.splash_text_calculator)

        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)


        textCalculator.visibility = TextView.INVISIBLE

        Handler(Looper.getMainLooper()).postDelayed({
            textCalculator.visibility = TextView.VISIBLE
            textCalculator.startAnimation(fadeInAnimation)
        }, 1000)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
