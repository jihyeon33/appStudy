package com.example.myapplication2

import android.view.View
import android.view.ViewGroup
import io.realm.OrderedRealmCollection
import io.realm.RealmBaseAdapter


class OrderListAdapter(realmResult: OrderedRealmCollection<Order>): RealmBaseAdapter<Order>(realmResult){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}