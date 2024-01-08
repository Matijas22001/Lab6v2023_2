package com.example.lab6v2023_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val page = WebView(this)


        page.settings.javaScriptEnabled=true

        //page.addJavascriptInterface(this, "activity") //uncomment to use JS


        page.loadUrl("file:///android_asset/Card.html")


        setContentView(page)

    }
}