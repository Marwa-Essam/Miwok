package com.example.miwok

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class ColorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word?>()
        words.add(Word("red", "weṭeṭṭi"))
        words.add(Word("mustard yellow", "chiwiiṭә"))
        words.add(Word("dusty yellow", "ṭopiisә"))
        words.add(Word("green", "chokokki"))
        words.add(Word("brown", "ṭakaakki"))
        words.add(Word("gray", "ṭopoppi"))
        words.add(Word("black", "kululli"))
        words.add(Word("white", "kelelli"))


        val adapter = WordAdapter(this, words)

        val listView = findViewById<View>(R.id.list) as ListView

        listView.adapter = adapter
    }
}