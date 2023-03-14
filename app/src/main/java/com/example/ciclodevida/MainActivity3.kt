package com.example.ciclodevida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ciclodevida.model.fakeEmail
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        recycler_main_1.adapter = EmailAdapter(fakeEmail())
        recycler_main_1.layoutManager = LinearLayoutManager(this)
    }

}