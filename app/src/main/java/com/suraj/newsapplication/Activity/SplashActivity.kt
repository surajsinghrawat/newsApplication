package com.suraj.newsapplication.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.suraj.newsapplication.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var myHandler = Handler()
        myHandler.postDelayed({

            gotoMainActivity()
        },2500)
    }

    private fun gotoMainActivity(){
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}


