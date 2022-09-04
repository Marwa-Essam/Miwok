package com.example.miwok

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class FamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word?>()
        words.add(Word("father", "әpә"))
        words.add(Word("mother", "әṭa"))
        words.add(Word("son", "angsi"))
        words.add(Word("daughter", "tune"))
        words.add(Word("older brother", "taachi"))
        words.add(Word("younger brother", "chalitti"))
        words.add(Word("older sister", "teṭe"))
        words.add(Word("younger sister", "kolliti"))
        words.add(Word("grandmother ", "ama"))
        words.add(Word("grandfather", "paapa"))


        val adapter = WordAdapter(this, words)


        val listView = findViewById<View>(R.id.list) as ListView


        listView.adapter = adapter
    }
}
