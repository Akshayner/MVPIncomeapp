package com.akshay.mvpincomeapp.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.akshay.mvpincomeapp.beans.IncExpBean
import com.akshay.mvpincomeapp.presenter.IncExpPresenterAPI
import com.akshay.mvpincomeapp.view.IncExpView
import com.akshay.mvpincomeapp.view.MainActivity

class IncExpModel: IncExpPresenterAPI {
    var api : MainActivity? = null
    var db : SQLiteDatabase? = null
    constructor(view: IncExpView){
        api = view as MainActivity
        db = api!!.openOrCreateDatabase("incexp",Context.MODE_PRIVATE,null)
        db!!.execSQL("create table if not exists incexp(_id integer primary key autoincrement, date_ varchar(50), money number,desc_ varchar(500), type varchar(50))")

    }
    override fun addInput(bean: IncExpBean) {
        var cv = ContentValues()
        cv.put("date_",bean.date)
        cv.put("money",bean.money)
        cv.put("desc_",bean.desc)
        cv.put("type",bean.type)

        var status = db!!.insert("incexp",null,cv)
        if(status==-1.toLong()) {
            api!!.addResponse("Failed")
        }
        else{
            api!!.addResponse("Successfull")
        }
    }

    override fun readInput(type: String) {
        var cursor = db!!.query("incexp",null,"type =?", arrayOf(type),null,null,null)
        api!!.readResponse(cursor)
    }
}