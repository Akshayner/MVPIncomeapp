package com.akshay.mvpincomeapp.presenter

import com.akshay.mvpincomeapp.beans.IncExpBean

interface IncExpPresenterAPI {
    fun addInput(bean: IncExpBean)
    fun readInput(type:String)
}