package com.suraj.newsapplication.ModelClass

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Source {
    @SerializedName("id")
    @Expose
    lateinit var id:String
    @SerializedName("name")
    @Expose
    lateinit var name:String
}