package com.example.miwok

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class NumbersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word?>()
        words.add(Word("one", "lutti"))
        words.add(Word("two", "otiiko"))
        words.add(Word("three", "tolookosu"))
        words.add(Word("four", "oyyisa"))
        words.add(Word("five", "massokka"))
        words.add(Word("six", "temmokka"))
        words.add(Word("seven", "kenekaku"))
        words.add(Word("eight", "kawinta"))
        words.add(Word("nine", "wo’e"))
        words.add(Word("ten", "na’aacha"))

        val adapter = WordAdapter(this, words)

        val listView = findViewById<View>(R.id.list) as ListView
        listView.adapter = adapter
    }
}
