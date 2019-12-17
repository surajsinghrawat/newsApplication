package com.suraj.newsapplication.Activity

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.suraj.newsapplication.R

class WebPage : AppCompatActivity() {
    private lateinit var webView : WebView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)
        showWebPage()
        Log.d("data",intent.getStringExtra("webPage"))

    }

    private fun showWebPage(){
        progressBar=findViewById(R.id.progressBar)
        webView=findViewById(R.id.webView)
        webView.visibility= View.INVISIBLE

        webView.settings.javaScriptEnabled=true
        webView.settings.javaScriptCanOpenWindowsAutomatically=true

        webView.webViewClient= object : WebViewClient(){
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                progressBar.visibility=View.INVISIBLE
//                webView.visibility=View.VISIBLE
//
//                return true
//            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                progressBar.visibility=View.INVISIBLE
                webView.visibility=View.VISIBLE
            }


            override fun onPageFinished(view: WebView?, url: String?){
              super.onPageFinished(view, url)


            }
        }
        webView.loadUrl(intent.getStringExtra("webPage"))

    }
}
