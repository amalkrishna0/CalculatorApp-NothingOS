package com.example.nothingcalculator

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var textArea: EditText
    var toggleOptions: Boolean = false

    lateinit var buttons: List<Button>
    private val calculatorHelper = CalculatorDisplay()

    private var isLongPress = false
    private val handler = Handler(Looper.getMainLooper())

    lateinit var clickAnimation: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn_1)
        textArea = findViewById(R.id.text_area)

        buttons = listOf(
            findViewById(R.id.btn_2),
            findViewById(R.id.btn_3),
            findViewById(R.id.btn_4),
            findViewById(R.id.btn_5),
            findViewById(R.id.btn_6),
            findViewById(R.id.btn_7),
            findViewById(R.id.btn_8),
            findViewById(R.id.btn_9),
            findViewById(R.id.btn_10),
            findViewById(R.id.btn_11),
            findViewById(R.id.btn_12),
            findViewById(R.id.btn_13),
            findViewById(R.id.btn_14),
            findViewById(R.id.btn_15),
            findViewById(R.id.btn_16),
            findViewById(R.id.btn_17),
            findViewById(R.id.btn_18),
            findViewById(R.id.btn_19),
            findViewById(R.id.btn_20)
        )

        clickAnimation = AnimationUtils.loadAnimation(this, R.anim.click_anim)

        calculatorHelper.setBasicMode(buttons, textArea,clickAnimation)

        btn1.setOnClickListener {
            it.startAnimation(clickAnimation)
            if (!toggleOptions) {
                calculatorHelper.setAdvancedMode(buttons, textArea,clickAnimation) {
                    switchToBasicMode()
                }
                toggleOptions = true
            } else {
                switchToBasicMode()
                toggleOptions = false
            }
        }




        buttons[18].setOnClickListener {
            it.startAnimation(clickAnimation)
        }
    }

    private fun switchToBasicMode() {
        calculatorHelper.setBasicMode(buttons, textArea, clickAnimation)
        toggleOptions = false
    }
}
