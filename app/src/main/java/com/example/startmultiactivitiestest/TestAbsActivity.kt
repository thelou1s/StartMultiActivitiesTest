package com.example.startmultiactivitiestest

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.startmultiactivitiestest.databinding.ActivityTest1Binding

open class TestAbsActivity : AppCompatActivity() {

    open fun getTag(): String {
        return ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(getTag(), "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(getTag(), "onDestroy")
    }

}