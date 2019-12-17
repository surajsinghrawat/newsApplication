package com.suraj.newsapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.Volley
import com.suraj.newsapplication.Adapter.ListAdapter
import com.suraj.newsapplication.ModelClass.Data
import com.suraj.newsapplication.ModelClass.RequestClass
import com.suraj.newsapplication.R
import org.json.JSONObject

class EntertenmentFragment :Fragment(){
    private lateinit var recyclerView: RecyclerView
    // private var URL ="https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=72daddecba9840dd8e1ab24b7e88df6f"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var view = inflater.inflate(R.layout.bussines_fragment, container, false)
        recyclerView = view.findViewById(R.id.itemList)
        recyclerView.layoutManager = LinearLayoutManager(this.requireActivity())

        val req= RequestClass(
            Request.Method.GET,
            RequestClass.ENTERTENMENT,
            JSONObject(),
            Response.Listener { response ->
                val data = Data.parseResponse(response.toString())
                val adapter =
                    ListAdapter(this.requireActivity(), data)
                recyclerView.adapter = adapter
            },
            Response.ErrorListener {
                Toast.makeText(this.requireActivity(), "error", Toast.LENGTH_LONG).show()
            },
            this.requireContext()
        )
        val queue: RequestQueue = Volley.newRequestQueue(this.requireActivity())
        queue.add(req)
        return view
    }
}