package com.suraj.newsapplication.ModelClass

import com.google.gson.GsonBuilder
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("status")
    @Expose
    lateinit var status:String
    @SerializedName("totalResults")
    @Expose
    var totalResults:Int = 0
    @SerializedName("articles")
    @Expose
    lateinit var articles: List<Article>
    companion object {
        fun parseResponse(responseJson:String):Data {
            val gson = GsonBuilder().create()
            val response = gson.fromJson(responseJson, Data::class.java)
            return response
        }
    }
}