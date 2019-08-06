package com.example.gradle_custom_properties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_credentials.text = BuildConfig.API_ID + "\n" + BuildConfig.API_PASSWORD
    }

}
