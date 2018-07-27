package com.akshay.mvpincomeapp.view

import android.content.ContentValues
import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import com.akshay.mvpincomeapp.R
import com.akshay.mvpincomeapp.beans.IncExpBean
import com.akshay.mvpincomeapp.model.IncExpModel
import com.akshay.mvpincomeapp.presenter.IncExpPresenterAPI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),IncExpView {
    override fun addResponse(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }

    override fun readResponse(c: Cursor) {
        var mya = SimpleCursorAdapter(this@MainActivity,R.layout.iview,c, arrayOf("date_","money","desc_","type"), intArrayOf(R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4),0)
        lview.adapter = mya
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{
            var api = IncExpModel(this@MainActivity)
            var bean = IncExpBean(et1.text.toString().toInt(),et2.text.toString(),et3.text.toString(),sp1.selectedItem.toString())
            api.addInput(bean)
        }

        read.setOnClickListener {
            var api = IncExpModel(this@MainActivity)
            api.readInput(sp1.selectedItem.toString())
        }

    }
}
