package org.pondar.linearlayoutdemokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//the interesting thing about this app is in the layout xml file
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("UI", "App ready!")
    }
}
