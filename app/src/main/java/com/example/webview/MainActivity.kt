package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.webkit.WebSettings
import android.webkit.WebView




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webSetting = webView.settings
        webSetting.javaScriptEnabled = true
        webSetting.displayZoomControls = true
        webSetting.domStorageEnabled = true
        webView.loadUrl("https://dev.inconium.com/?token=6ZAQdTO1BiM9Oxc8y8azfTOX9Goo")

    }
}
