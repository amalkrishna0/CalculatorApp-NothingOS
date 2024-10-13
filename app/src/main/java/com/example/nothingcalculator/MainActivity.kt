package com.example.nothingcalculator

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn10: Button
    lateinit var btn11: Button
    lateinit var btn12: Button
    lateinit var btn13: Button
    lateinit var btn14: Button
    lateinit var btn15: Button
    lateinit var btn16: Button
    lateinit var btn17: Button
    lateinit var btn18: Button
    lateinit var btn19: Button
    lateinit var btn20: Button
    lateinit var textArea: EditText
    private var isLongPress = false
    private val handler = Handler(Looper.getMainLooper())

    var toggleOptions: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)
        btn5 = findViewById(R.id.btn_5)
        btn6 = findViewById(R.id.btn_6)
        btn7 = findViewById(R.id.btn_7)
        btn8 = findViewById(R.id.btn_8)
        btn9 = findViewById(R.id.btn_9)
        btn10 = findViewById(R.id.btn_10)
        btn11 = findViewById(R.id.btn_11)
        btn12 = findViewById(R.id.btn_12)
        btn13 = findViewById(R.id.btn_13)
        btn14 = findViewById(R.id.btn_14)
        btn15 = findViewById(R.id.btn_15)
        btn16 = findViewById(R.id.btn_16)
        btn17 = findViewById(R.id.btn_17)
        btn18 = findViewById(R.id.btn_18)
        btn19 = findViewById(R.id.btn_19)
        btn20 = findViewById(R.id.btn_20)
        textArea = findViewById(R.id.text_area)

        setBasicMode()

        btn1.setOnClickListener {
            if (!toggleOptions) {
                btn1.postDelayed({
                    setAdvancedMode()
                    toggleOptions = true
                }, 100)
            } else {
                btn1.postDelayed({
                    setBasicMode()
                    toggleOptions = false
                }, 100)
            }
        }

        btn19.setOnClickListener {
            if(!toggleOptions)
            {
                val currentText = textArea.text.toString()
                if (currentText.isNotEmpty()) {
                    textArea.setText(currentText.substring(0, currentText.length - 1))
                    textArea.setSelection(textArea.text.length)
                }
            }
        }
        btn19.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    isLongPress = false
                    handler.postDelayed({
                        isLongPress = true
                        textArea.setText("")
                    }, 500)
                }

                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    handler.removeCallbacksAndMessages(null)
                    if (!isLongPress) {
                        val currentText = textArea.text.toString()
                        if (currentText.isNotEmpty()) {
                            textArea.setText(currentText.substring(0, currentText.length - 1))
                            textArea.setSelection(textArea.text.length)
                        }
                    }
                }
            }
            true
        }


        btn20.setOnClickListener {
            textArea.append("")
        }
    }

    private fun setBasicMode() {
        btn2.text = "("
        btn3.text = ")"
        btn4.text = "%"
        btn5.text = "7"
        btn6.text = "8"
        btn7.text = "9"
        btn8.text = "x"
        btn9.text = "4"
        btn10.text = "5"
        btn11.text = "6"
        btn12.text = "-"
        btn13.text = "1"
        btn14.text = "2"
        btn15.text = "3"
        btn16.text = "+"
        btn17.text = "0"
        btn18.text = "."
        btn19.text = "C"
        btn20.text = "="

        btn2.setOnClickListener { textArea.append("(") }
        btn3.setOnClickListener { textArea.append(")") }
        btn4.setOnClickListener { textArea.append("%") }
        btn5.setOnClickListener { textArea.append("7") }
        btn6.setOnClickListener { textArea.append("8") }
        btn7.setOnClickListener { textArea.append("9") }
        btn8.setOnClickListener { textArea.append("x") }
        btn9.setOnClickListener { textArea.append("4") }
        btn10.setOnClickListener { textArea.append("5") }
        btn11.setOnClickListener { textArea.append("6") }
        btn12.setOnClickListener { textArea.append("-") }
        btn13.setOnClickListener { textArea.append("1") }
        btn14.setOnClickListener { textArea.append("2") }
        btn15.setOnClickListener { textArea.append("3") }
        btn16.setOnClickListener { textArea.append("+") }
        btn17.setOnClickListener { textArea.append("0") }
        btn18.setOnClickListener { textArea.append(".") }
    }

    private fun setAdvancedMode() {
        btn2.text = "√"
        btn3.text = "∛"
        btn4.text = "x²"
        btn5.text = "sin"
        btn6.text = "cos"
        btn7.text = "tan"
        btn8.text = "x³"
        btn9.text = "e"
        btn10.text = "log"
        btn11.text = "ln"
        btn12.text = "!"
        btn13.text = ""
        btn14.text = ""
        btn15.text = ""
        btn16.text = ""
        btn17.text = ""
        btn18.text = ""
        btn19.text = ""
        btn20.text = ""

        btn2.setOnClickListener { textArea.append("√") }
        btn3.setOnClickListener { textArea.append("∛") }
        btn4.setOnClickListener { textArea.append("x²") }
        btn5.setOnClickListener { textArea.append("sin") }
        btn6.setOnClickListener { textArea.append("cos") }
        btn7.setOnClickListener { textArea.append("tan") }
        btn8.setOnClickListener { textArea.append("x³") }
        btn9.setOnClickListener { textArea.append("e") }
        btn10.setOnClickListener { textArea.append("log") }
        btn11.setOnClickListener { textArea.append("ln") }
        btn12.setOnClickListener { textArea.append("!") }
    }
}
