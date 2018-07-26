package com.akshay.mvpincomeapp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.akshay.mvpincomeapp.R

class MainActivity : AppCompatActivity(),IncExpView {
    override fun addResponse() {

    }

    override fun readResponse() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
