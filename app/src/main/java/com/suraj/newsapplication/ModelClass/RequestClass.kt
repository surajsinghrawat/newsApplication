package com.suraj.newsapplication.ModelClass

import android.content.Context
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject

class RequestClass(method: Int,
                   endpoint: String?,
                   jsonRequest: JSONObject?,
                   listener: Response.Listener<JSONObject>?,
                   errorListener: Response.ErrorListener?,mContext:Context
) : JsonObjectRequest(method, server +endpoint+ key, jsonRequest, listener, errorListener) {

 private var context : Context
     get() {
         TODO()
     }
    init {
        this.context=mContext
    }
companion object {
    private var server : String="https://newsapi.org/v2/top-headlines?country=us&category="
    private var key:String="&apiKey=72daddecba9840dd8e1ab24b7e88df6f"

    var BUSSINES:String="business"
    var POLITICS:String="politics"
    var SPORT:String="Sports"
    var ENTERTENMENT:String="entertainment"
}


}