package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm

class MenuActivity : AppCompatActivity() {
    val realm = Realm.getDefaultInstance() /**/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    /**/
    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    /**/
    private fun insertOrder(){

    }
}