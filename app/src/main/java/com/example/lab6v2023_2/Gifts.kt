package com.example.lab6v2023_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast
import java.util.*

class Gifts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //WebView - widget displays html
        val page = WebView(this)

        //turn on JS
        page.settings.javaScriptEnabled=true

        //add interface between frontend (js) and backend (kotlin)
        page.addJavascriptInterface(this, "activity")

        //load content of WebView
        page.loadUrl("file:///android_asset/Gifts.html")

        //set WebView on whole activity fronted
        setContentView(page)
    }

    @JavascriptInterface
    fun sayHello(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    fun getDate(): String {
        return Date().toString()
    }
}