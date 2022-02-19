package com.example.imo_appclone_lesson_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))


        refreshAdapter(recyclerView, getAllChats())
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 1))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 0))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 3))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 10))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 4))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 1))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 1))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 1))
        chats.add(Chat(R.drawable.me, "Mirzayev Shaxzod", 1))
        return chats
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }
}