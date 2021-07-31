package com.example.testapp
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private var mNoButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mYesButton = findViewById<View>(R.id.button_yes) as Button
        mYesButton.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                R.string.correct_answer,
                Toast.LENGTH_LONG
            ).show()
        }
        mNoButton = findViewById<View>(R.id.button_no) as Button
        mNoButton!!.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                R.string.incorrect_answer,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
