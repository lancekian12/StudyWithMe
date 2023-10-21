package com.example.myapplication

object FilipinoVideoRepository {
    fun getVideo() : ArrayList<DataClassVideo>{
        val videoList = ArrayList<DataClassVideo>()
        val vid1 = DataClassVideo("Uri ng Pangungusap",
        "URI NG PANGUNGUSAP",
        "https://www.youtube.com/watch?v=XJ73KsDlMlU",
        "Description")
        videoList.add(vid1)
        return videoList
    }
}
