package com.suraj.newsapplication.Activity

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.suraj.newsapplication.Adapter.PageViewAdapter
import com.suraj.newsapplication.ModelClass.RequestClass
import com.suraj.newsapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var bussines : TextView
    private lateinit var politics : TextView
    private lateinit var sport : TextView
    private lateinit var entertainment : TextView
    private lateinit var viewPager: ViewPager


    private var URL="https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=72daddecba9840dd8e1ab24b7e88df6f"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bussines=findViewById(R.id.business)
        politics=findViewById(R.id.politics)
        sport=findViewById(R.id.sports)
        entertainment=findViewById(R.id.entertainment)
        viewPager=findViewById(R.id.viewPager)
        val adapter= PageViewAdapter(supportFragmentManager)
        viewPager.adapter=adapter
        bussines.textSize= 20F
        bussines.setTextColor(resources.getColor(R.color.white))
        pageChangeEvent()
        pageclik()

 //        recyclerView = findViewById(R.id.itemList)
//        linearLayoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = linearLayoutManager
//
//        val request = StringRequest(URL, Response.Listener { response ->
//
//            val data = Data.parseResponse(response.toString())
//            val adapter= ListAdapter(applicationContext,data)
//            recyclerView.adapter=adapter
//            }, Response.ErrorListener {
//            Toast.makeText(this,"error",Toast.LENGTH_LONG).show()
//        })
//        val queue : RequestQueue= Volley . newRequestQueue (this)
//        queue.add(request)

    }



    private fun pageChangeEvent(){
        viewPager.addOnPageChangeListener( object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int,positionOffset: Float,positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                onTabChange(position)
            }

        })

    }

  fun onTabChange(i:Int){

    when (i) {
        0 -> {
            bussines.textSize= 20F
            bussines.setTextColor(resources.getColor(R.color.white))

            politics.textSize= 15F
            politics.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            sport.textSize= 15F
            sport.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            entertainment.textSize= 15F
            entertainment.setTextColor(resources.getColor(R.color.colorPrimaryDark))
            val endpoint:String= RequestClass.POLITICS
        }
        1 -> {
            politics.textSize= 20F
            politics.setTextColor(resources.getColor(R.color.white))

            bussines.textSize= 15F
            bussines.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            sport.textSize= 15F
            sport.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            entertainment.textSize= 15F
            entertainment.setTextColor(resources.getColor(R.color.colorPrimaryDark))
        }
        2 -> {
            sport.textSize= 20F
            sport.setTextColor(resources.getColor(R.color.white))

            politics.textSize= 15F
            politics.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            bussines.textSize= 15F
            bussines.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            entertainment.textSize= 15F
            entertainment.setTextColor(resources.getColor(R.color.colorPrimaryDark))
        }
        3 -> {
            entertainment.textSize= 20F
            entertainment.setTextColor(resources.getColor(R.color.white))

            politics.textSize= 15F
            politics.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            sport.textSize= 15F
            sport.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            bussines.textSize= 15F
            bussines.setTextColor(resources.getColor(R.color.colorPrimaryDark))
        }
    }
}
     fun pageclik(){
        bussines.setOnClickListener(View.OnClickListener {
            viewPager.currentItem=0

        })

        politics.setOnClickListener(View.OnClickListener {
            viewPager.currentItem=1
        })
        sport.setOnClickListener(View.OnClickListener {
            viewPager.currentItem=2
        })
        entertainment.setOnClickListener(View.OnClickListener {
            viewPager.currentItem=3
        })
    }


}


