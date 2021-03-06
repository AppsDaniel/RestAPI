package com.example.macbookair.kotlinyoutube

/**
 * Created by macbookair on 2018-02-12.
 */
class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String,
            val numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)
