package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

private val TAG = "prakash"
class MainActivity : AppCompatActivity() {

    var loginButton : Button? = null
    var openWebsiteButton : Button? = null
    var emailField : EditText? = null
    var passwordField : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(TAG, "a1 onCreate Called")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.login)
        openWebsiteButton = findViewById(R.id.openWebsite)
        emailField = findViewById(R.id.email)
        passwordField = findViewById(R.id.password)

        loginButton?.setOnClickListener{

            val myIntent: Intent = Intent(this,SecondActivity::class.java)
//val bundle = Bundle()
//            bundle.putInt("value", 1);
           // myIntent.putExtras(bundle)
            myIntent.putExtra("email", emailField?.text.toString())
            myIntent.putExtra("password", passwordField?.text.toString())
            startActivity(myIntent)
//            Intent(this, SecondActivity::class.java).also {
//
//                Log.d(TAG, "0")
//
//                it.putExtra("email", emailField?.text.toString())
//                it.putExtra("password", passwordField?.text.toString())
//
//                Log.d(TAG, "1")
//
//                startActivity(it)
//
//                Log.d(TAG, "2")
//            }
        }

        openWebsiteButton?.setOnClickListener{
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/Prakash5bisht")).also {
                startActivity(it)
            }
        }

        val thirdBtn = findViewById<Button>(R.id.thirdScreen)

        thirdBtn.setOnClickListener {
            val thirdIntent: Intent = Intent(this, ThirdActivity::class.java)

            thirdIntent.putExtra("txt", "success!")
            startActivity(thirdIntent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, " a1 onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "a1 onStop Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "a1 onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "a1 onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "a1 onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "a1 onDestroy Called")
    }

}