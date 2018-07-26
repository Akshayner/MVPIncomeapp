package com.akshay.mvpincomeapp.model

import com.akshay.mvpincomeapp.beans.IncExpBean
import com.akshay.mvpincomeapp.presenter.IncExpPresenterAPI
import com.akshay.mvpincomeapp.view.IncExpView

class IncExpModel: IncExpPresenterAPI {
    constructor(view: IncExpView){

    }
    override fun addInput(bean: IncExpBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readInput(type: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}