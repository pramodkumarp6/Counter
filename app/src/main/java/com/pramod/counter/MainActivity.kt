package com.pramod.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.pramod.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var mbinding: ActivityMainBinding
     private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(mbinding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
       mbinding.count.text=mainViewModel.count.toString()


    }



    fun tab(view:View) {
       mainViewModel.increment()

        mbinding.count.text=mainViewModel.count.toString()


    }





}