package com.egloos.neuezeal.dimofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton.setOnClickListener(View.OnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.contentFrame, FirstFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        })

        secondButton.setOnClickListener(View.OnClickListener {
            val transction = supportFragmentManager.beginTransaction()
            transction.replace(R.id.contentFrame, SecondFragment())
            transction.addToBackStack(null)
            transction.commit()
        })
    }
}
