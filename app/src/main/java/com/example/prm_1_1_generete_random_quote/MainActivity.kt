package com.example.prm_1_1_generete_random_quote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowRandomQuotation(view: View) {
        val quotations = listOf(
                "Dwa projekty. Do piątku do północy.",
                "Nie chce słyszeć:\nNie wiem",
                "Praca ładna i wychuchana",
                "Late delivery - na 50% punktów",
                "Nawet jak się nie uda wszystkiego\nto i tak spróbować oddać",
                "Na następne zajęcia każdy w domu\nzainstaluje android studio",
                "Ważne są śmieszne obrazki",
                "50% sumy punktów potrzebna\n do zaliczenia.",
                "Proszę nie przeginać",
                "Nie zabijać emulatora za każdym razem.")

        val quotation : TextView = findViewById(R.id.quotation)
        val randomQuotation = quotations[Random.nextInt(0, quotations.size -1)]
        quotation.text = randomQuotation
    }
}
