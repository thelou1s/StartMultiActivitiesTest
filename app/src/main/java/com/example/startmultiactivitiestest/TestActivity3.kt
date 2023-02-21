package com.example.startmultiactivitiestest

import android.annotation.SuppressLint
import android.os.Bundle
import com.example.startmultiactivitiestest.databinding.ActivityTest1Binding

class TestActivity3 : TestAbsActivity() {

    override fun getTag(): String {
        return "TestActivity3"
    }

    private lateinit var binding: ActivityTest1Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.centerText.text = getTag()

    }

}