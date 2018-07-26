package com.akshay.mvpincomeapp.view

import android.database.Cursor

interface IncExpView {
    fun addResponse(msg: String)
    fun readResponse(c: Cursor)
}