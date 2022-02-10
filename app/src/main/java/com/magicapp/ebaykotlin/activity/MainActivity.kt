package com.magicapp.ebaykotlin.activity

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.ebaykotlin.R
import com.magicapp.ebaykotlin.adapter.FavoriteAdapter
import com.magicapp.ebaykotlin.model.Favorite

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(manager)

        refreshAdapter(getFavortes())
    }
    fun refreshAdapter(items: ArrayList<Favorite>){
        val adapter = FavoriteAdapter(this, items)
        recyclerView!!.adapter = adapter
    }

    fun getFavortes(): ArrayList<Favorite> {
        val items: ArrayList<Favorite> = ArrayList()
        items.add(Favorite("Apple Watch", R.drawable.apple_watch))
        items.add(Favorite("Apple Watch1", R.drawable.apple_watch_1))
        items.add(Favorite("Apple Watch2", R.drawable.apple_watch_2))
        items.add(Favorite("Apple Watch3", R.drawable.apple_watch_3))
        items.add(Favorite("Apple Watch4", R.drawable.apple_watch_4))
        items.add(Favorite("Apple Phone1", R.drawable.apple_phone_1))
        items.add(Favorite("Apple Phone2", R.drawable.apple_phone_2))
        items.add(Favorite("Apple Phone3", R.drawable.apple_phone_3))
        items.add(Favorite("Apple Phone4", R.drawable.apple_phone_4))
        return items
    }
}