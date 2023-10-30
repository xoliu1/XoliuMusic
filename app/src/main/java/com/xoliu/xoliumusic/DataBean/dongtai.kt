package com.xoliu.xoliumusic.DataBean

import java.util.Random

class dongtai {
    var userImg:Int
    var userName:String
    var userAction:String
    var content: String
    var songPic:Int
    var songName:String
    var songSinger:String
    var random = Random()
    var pinglunNum:Int = random.nextInt(901) + 107
    var dianzanNum:Int = random.nextInt(9003) + 1006

    constructor(
        userImg: Int,
        userName: String,
        userAction: String,
        content: String,
        songPic: Int,
        songName: String,
        songSinger: String,
    ) {
        this.userImg = userImg
        this.userName = userName
        this.userAction = userAction
        this.content = content
        this.songPic = songPic
        this.songName = songName
        this.songSinger = songSinger
    }
}