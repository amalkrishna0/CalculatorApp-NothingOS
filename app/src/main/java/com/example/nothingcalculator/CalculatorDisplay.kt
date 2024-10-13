package com.example.nothingcalculator

import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText

class CalculatorDisplay {

    fun setBasicMode(buttons: List<Button>, textArea: EditText,clickAnimation: Animation) {
        buttons[0].text = "("
        buttons[1].text = ")"
        buttons[2].text = "x"
        buttons[3].text = "7"
        buttons[4].text = "8"
        buttons[5].text = "9"
        buttons[6].text = "-"
        buttons[7].text = "4"
        buttons[8].text = "5"
        buttons[9].text = "6"
        buttons[10].text = "+"
        buttons[11].text = "1"
        buttons[12].text = "2"
        buttons[13].text = "3"
        buttons[14].text = "AC"
        buttons[15].text = "0"
        buttons[16].text = "."
        buttons[17].text = "C"
        buttons[18].text = "="

        buttons[0].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("(")
        }
        buttons[1].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append(")") }
        buttons[2].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("x") }
        buttons[3].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("7") }
        buttons[4].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("8") }
        buttons[5].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("9") }
        buttons[6].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("-") }
        buttons[7].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("4") }
        buttons[8].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("5") }
        buttons[9].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("6") }
        buttons[10].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("+") }
        buttons[11].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("1") }
        buttons[12].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("2") }
        buttons[13].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("3") }
        buttons[14].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.setText("") }
        buttons[15].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append("0") }
        buttons[16].setOnClickListener {
            it.startAnimation(clickAnimation)
            textArea.append(".") }
        buttons[17].setOnClickListener {
            it.startAnimation(clickAnimation)
            val currentText = textArea.text.toString()
            if (currentText.isNotEmpty()) {
                textArea.setText(currentText.substring(0, currentText.length - 1))
                textArea.setSelection(textArea.text.length)
            }
        }
    }

    fun setAdvancedMode(buttons: List<Button>, textArea: EditText, clickAnimation: Animation,callback: () -> Unit) {
        buttons[0].text = "√"
        buttons[1].text = "∛"
        buttons[2].text = "x²"
        buttons[3].text = "sin"
        buttons[4].text = "cos"
        buttons[5].text = "tan"
        buttons[6].text = "%"
        buttons[7].text = "e"
        buttons[8].text = "log"
        buttons[9].text = "ln"
        buttons[10].text = "!"
        buttons[11].text = "sin⁻¹"
        buttons[12].text = "cos⁻¹"
        buttons[13].text = "tan⁻¹"
        buttons[14].text = "ᴺCᵖ"
        buttons[15].text = "AND"
        buttons[16].text = "OR"
        buttons[17].text = "NOT"
        buttons[18].text = "ᴺPᵖ"

        buttons[0].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("√", textArea, callback) }
        buttons[1].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("∛", textArea, callback) }
        buttons[2].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("x²", textArea, callback) }
        buttons[3].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("sin", textArea, callback) }
        buttons[4].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("cos", textArea, callback) }
        buttons[5].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("tan", textArea, callback) }
        buttons[6].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("%", textArea, callback) }
        buttons[7].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("e", textArea, callback) }
        buttons[8].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("log", textArea, callback) }
        buttons[9].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("ln", textArea, callback) }
        buttons[10].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("!", textArea, callback) }
        buttons[11].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("sin⁻¹", textArea, callback) }
        buttons[12].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("cos⁻¹", textArea, callback) }
        buttons[13].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("tan⁻¹", textArea, callback) }
        buttons[14].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("C", textArea, callback) }
        buttons[15].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("AND", textArea, callback) }
        buttons[16].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("OR", textArea, callback) }
        buttons[17].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("NOT", textArea, callback) }
        buttons[18].setOnClickListener {
            it.startAnimation(clickAnimation)
            appendAndReturnToBasic("P", textArea, callback) }

    }

    private fun appendAndReturnToBasic(value: String, textArea: EditText, callback: () -> Unit) {
        textArea.append(value)
        callback()
    }
}
