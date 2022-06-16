package dev.angara.calculatorassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: TextInputEditText
    lateinit var etSecondNUmber: TextInputEditText
    lateinit var tvResults: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNUmber = findViewById(R.id.etSecondNumber)
        tvResults = findViewById(R.id.tvResults)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivide = findViewById(R.id.btnDivide)

        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNUmber.text.toString()
            addition(num1.toInt(), num2.toInt())

        }
        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNUmber.text.toString()
            subtraction(num1.toInt(), num2.toInt())
        }
        btnModulus.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNUmber.text.toString()
            modulus(num1.toInt(), num2.toInt())
        }
        btnDivide.setOnClickListener {
            val num1 = etFirstNumber.text.toString()
            val num2 = etSecondNUmber.text.toString()
            divide(num1.toInt(), num2.toInt())
        }
    }

    fun addition(num1: Int, num2: Int) {
        val result = num1 + num2
        tvResults.text = result.toString()
    }

    fun subtraction(num1: Int, num2: Int) {
        val result = num1 - num2
        tvResults.text = result.toString()
    }

    fun modulus(num1: Int, num2: Int) {
        val result = num1 % num2
        tvResults.text = result.toString()
    }

    fun divide(num1: Int, num2: Int) {
        val result = num1 / num2
        tvResults.text = result.toString()
    }
}

