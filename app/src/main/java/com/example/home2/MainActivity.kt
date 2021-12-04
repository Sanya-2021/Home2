package com.example.home2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate(Bundle?) called")
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Белеет парус одинокой")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "В тумане моря голубом!")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Что ищет он в стране далекой?")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Что кинул он в краю родном?")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Играют волны — ветер свищет")
    }
}