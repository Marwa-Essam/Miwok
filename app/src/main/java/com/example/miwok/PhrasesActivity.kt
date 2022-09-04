package com.example.miwok

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class PhrasesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)

        // Create a list of words
        val words = ArrayList<Word?>()
        words.add(Word("Where are you going?", "minto wuksus"))
        words.add(Word("What is your name?", "tinnә oyaase'nә"))
        words.add(Word("My name is...", "oyaaset..."))
        words.add(Word("How are you feeling?", "michәksәs?"))
        words.add(Word("I’m feeling good.", "kuchi achit"))
        words.add(Word("Are you coming?", "әәnәs'aa?"))
        words.add(Word("Yes, I’m coming.", "hәә’ әәnәm"))
        words.add(Word("I’m coming.", "әәnәm"))
        words.add(Word("Let’s go.", "yoowutis"))
        words.add(Word("Come here.", "әnni'nem"))

        val adapter = WordAdapter(this, words)

        val listView = findViewById<View>(R.id.list) as ListView

        listView.adapter = adapter
    }
}