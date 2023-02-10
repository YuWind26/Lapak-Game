package com.riyagung.lapakgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.riyagung.lapakgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var rvGame : RecyclerView
    private lateinit var gameArrayList : ArrayList<ItemsGameModel>
    lateinit var imgGame : ArrayList<Int>
    lateinit var titleGame : ArrayList<String>
    lateinit var dateGame : ArrayList<String>
    lateinit var ratingGame : ArrayList<String>
    lateinit var genreGame : ArrayList<ArrayList<String>>
    lateinit var descGame : ArrayList<String>
    lateinit var developerGame : ArrayList<String>
    lateinit var publisherGame : ArrayList<String>
    lateinit var imgGameplayGame : ArrayList<ArrayList<Int>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.btnToFav.setOnClickListener {
            Toast.makeText(this, "To Screen Favorit", Toast.LENGTH_SHORT).show()
        }

        imgGame = arrayListOf(
            R.drawable.game1,
            R.drawable.game2,
            R.drawable.game3,
            R.drawable.game4,
            R.drawable.game5,
            R.drawable.game6,
            R.drawable.game7,
            R.drawable.game8,
            R.drawable.game9,
            R.drawable.game10,
        )

        titleGame = arrayListOf(
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
            "The Witcher 3 : Wild Hunt",
        )

        dateGame = arrayListOf(
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
            "2022-7-1",
        )

        ratingGame = arrayListOf(
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
            "4.0",
        )

        genreGame = arrayListOf(
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
            arrayListOf("Action","Fantasy"),
        )

        descGame = arrayListOf(
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
            "The Witcher 3: Wild Hunt mengisahkan Geralt of Rivia, yang mencari anak angkatnya, Ciri, yang sedang diburu oleh musuh lama Geralt, Wild Hunt. Ciri rupanya memiliki kemampuan khusus yang bisa membuat Wild Hunt mengadilkan dunia. Geralt telah menganggap Ciri sebagai anaknya sendiri, sehingga ia memutuskan untuk mengejarnya sebelum Wild Hunt berhasil menemukan Ciri.",
        )

        developerGame = arrayListOf(
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
            "CD Projekt Red",
        )

        publisherGame = arrayListOf(
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
            "CD Projekt",
        )

        imgGameplayGame = arrayListOf(
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
            arrayListOf(R.drawable.game2, R.drawable.game3, R.drawable.game4),
        )

        rvGame = binding.rvListGame;
        rvGame.layoutManager = LinearLayoutManager(this)

        gameArrayList = arrayListOf<ItemsGameModel>()
        getListGame()

    }

    private fun getListGame() {
        for (i in imgGame.indices){
            val games = ItemsGameModel(imgGame[i],titleGame[i],dateGame[i],ratingGame[i],genreGame[i],descGame[i],developerGame[i],publisherGame[i],imgGameplayGame[i])
            gameArrayList.add(games)
        }

        var adapter = RecyclerViewGameAdapter(gameArrayList)
        rvGame.adapter = adapter

        adapter.setOnItemClickListener(object : RecyclerViewGameAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
//                Toast.makeText(this@MainActivity,"Berhasil pindah",Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity,DetailItem::class.java)
                intent.putExtra("imgGame",gameArrayList[position].imgGame)
                intent.putExtra("titleGame",gameArrayList[position].titleGame)
                intent.putExtra("dateGame",gameArrayList[position].dateGame)
                intent.putExtra("ratingGame",gameArrayList[position].ratingGame)
                intent.putExtra("genreGame",(gameArrayList[position].genreGame))
                intent.putExtra("descGame",gameArrayList[position].descGame)
                intent.putExtra("developerGame",gameArrayList[position].developerGame)
                intent.putExtra("publisherGame",gameArrayList[position].publisherGame)
                intent.putExtra("imgGameplayGame",gameArrayList[position].imgGameplayGame)
                startActivity(intent)
            }
        })
    }
}