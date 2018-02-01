package com.example.oso.findagekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yearCurrent = Calendar.getInstance().get(Calendar.YEAR)

        button.setOnClickListener {
            resultAge.text = "${yearCurrent - userYear.text.toString().toInt()}"
            result.visibility = View.VISIBLE
        }
    }
}
