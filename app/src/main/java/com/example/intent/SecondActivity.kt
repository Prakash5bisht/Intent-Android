package com.example.intent

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private val TAG = "prakash"
class SecondActivity: AppCompatActivity() {

    var emailField : TextView? = null
    var passwordField : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d(TAG, "a2 onCreate called")

        val button : Button = findViewById(R.id.secondButton)

        emailField = findViewById(R.id.emailTxt)
        passwordField = findViewById(R.id.passwordTxt)


        emailField?.text = intent.getStringExtra("email")
        passwordField?.text = intent.getStringExtra("password")

        button.setOnClickListener{
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, " a2 onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "a2 onStop Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "a2 onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "a2 onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "a2 onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "a2 onDestroy Called")
    }

}