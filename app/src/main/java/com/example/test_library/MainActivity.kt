package com.example.test_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toast.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.s(this,"tets")
    }
}