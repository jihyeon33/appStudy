package com.example.myapplication2

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Order (
    @PrimaryKey var id : Long=0,
    var menu: String ="",
    var price: Long=0):RealmObject(){
}
//더 받아올 정보있으면 기입