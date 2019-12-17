package com.suraj.newsapplication.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.suraj.newsapplication.Activity.WebPage
import com.suraj.newsapplication.ModelClass.Article
import com.suraj.newsapplication.ModelClass.Data
import com.suraj.newsapplication.R

class ListAdapter(var mContext: Context, var data: Data) : RecyclerView.Adapter<ListAdapter.ImageViewHolder>() {



     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
         val view=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
         return ImageViewHolder(view)
     }

     override fun getItemCount(): Int {
        return data.articles.size
     }

     override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val data1: Data =data
         val first : List<Article> =data1.articles
         holder.author.text= first[position].author
         holder.heading.text= first[position].title
         holder.description.text= first[position].description
         Glide.with(holder.imageView.context).load(first[position].urlToImage).into(holder.imageView)
         holder.itemView.setOnClickListener(View.OnClickListener {
             val webPageIntent= Intent(mContext, WebPage::class.java)
             webPageIntent.putExtra("webPage",first[position].url)
             mContext.startActivity(webPageIntent)
         })


     }




    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val heading=itemView.findViewById(R.id.heading) as TextView
         val description=itemView.findViewById(R.id.description) as TextView
         val author=itemView.findViewById(R.id.author) as TextView
         val imageView=itemView.findViewById(R.id.imageView) as ImageView

        


//        init {
//            itemView.setOnClickListener(this)
//        }


//
//         override fun onClick(v: View?) {
//
//             val context=imageView.context
//             val webPageIntent=Intent(context,WebPage::class.java)
//             webPageIntent.putExtra("WebPage",)
//
//         }


     }

}