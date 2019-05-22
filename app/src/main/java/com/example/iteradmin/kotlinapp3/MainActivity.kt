package com.example.iteradmin.kotlinapp3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login=findViewById<Button>(R.id.buttonid1)
        val forgot=findViewById<Button>(R.id.buttonid2)

        login.setOnClickListener(this)
        forgot.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        when(v.id)
        {
            R.id.buttonid1 ->{ Toast.makeText(applicationContext,"login",Toast.LENGTH_LONG).show()}
            R.id.buttonid2 ->{Toast.makeText(applicationContext,"forgot",Toast.LENGTH_LONG).show()}

        }

    }
}
