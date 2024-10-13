package com.example.nothingcalculator

import android.widget.Button
import android.widget.EditText

class CalculatorDisplay {

    fun setBasicMode(buttons: List<Button>, textArea: EditText) {
        buttons[0].text = "("
        buttons[1].text = ")"
        buttons[2].text = "%"
        buttons[3].text = "7"
        buttons[4].text = "8"
        buttons[5].text = "9"
        buttons[6].text = "x"
        buttons[7].text = "4"
        buttons[8].text = "5"
        buttons[9].text = "6"
        buttons[10].text = "-"
        buttons[11].text = "1"
        buttons[12].text = "2"
        buttons[13].text = "3"
        buttons[14].text = "+"
        buttons[15].text = "0"
        buttons[16].text = "."
        buttons[17].text = "C"
        buttons[18].text = "="

        // Set listeners for basic mode
        buttons[0].setOnClickListener { textArea.append("(") }
        buttons[1].setOnClickListener { textArea.append(")") }
        buttons[2].setOnClickListener { textArea.append("%") }
        buttons[3].setOnClickListener { textArea.append("7") }
        buttons[4].setOnClickListener { textArea.append("8") }
        buttons[5].setOnClickListener { textArea.append("9") }
        buttons[6].setOnClickListener { textArea.append("x") }
        buttons[7].setOnClickListener { textArea.append("4") }
        buttons[8].setOnClickListener { textArea.append("5") }
        buttons[9].setOnClickListener { textArea.append("6") }
        buttons[10].setOnClickListener { textArea.append("-") }
        buttons[11].setOnClickListener { textArea.append("1") }
        buttons[12].setOnClickListener { textArea.append("2") }
        buttons[13].setOnClickListener { textArea.append("3") }
        buttons[14].setOnClickListener { textArea.append("+") }
        buttons[15].setOnClickListener { textArea.append("0") }
        buttons[16].setOnClickListener { textArea.append(".") }
    }

    fun setAdvancedMode(buttons: List<Button>, textArea: EditText, callback: () -> Unit) {
        buttons[0].text = "√"
        buttons[1].text = "∛"
        buttons[2].text = "x²"
        buttons[3].text = "sin"
        buttons[4].text = "cos"
        buttons[5].text = "tan"
        buttons[6].text = "x³"
        buttons[7].text = "e"
        buttons[8].text = "log"
        buttons[9].text = "ln"
        buttons[10].text = "!"
        buttons[11].text = ""
        buttons[12].text = ""
        buttons[13].text = ""
        buttons[14].text = ""
        buttons[15].text = ""
        buttons[16].text = ""
        buttons[17].text = ""
        buttons[18].text = ""

        buttons[0].setOnClickListener { appendAndReturnToBasic("√", textArea, callback) }
        buttons[1].setOnClickListener { appendAndReturnToBasic("∛", textArea, callback) }
        buttons[2].setOnClickListener { appendAndReturnToBasic("x²", textArea, callback) }
        buttons[3].setOnClickListener { appendAndReturnToBasic("sin", textArea, callback) }
        buttons[4].setOnClickListener { appendAndReturnToBasic("cos", textArea, callback) }
        buttons[5].setOnClickListener { appendAndReturnToBasic("tan", textArea, callback) }
        buttons[6].setOnClickListener { appendAndReturnToBasic("x³", textArea, callback) }
        buttons[7].setOnClickListener { appendAndReturnToBasic("e", textArea, callback) }
        buttons[8].setOnClickListener { appendAndReturnToBasic("log", textArea, callback) }
        buttons[9].setOnClickListener { appendAndReturnToBasic("ln", textArea, callback) }
        buttons[10].setOnClickListener { appendAndReturnToBasic("!", textArea, callback) }
    }

    private fun appendAndReturnToBasic(value: String, textArea: EditText, callback: () -> Unit) {
        textArea.append(value)
        callback()
    }
}
