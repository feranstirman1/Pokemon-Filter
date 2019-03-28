package com.feranstirman.pokemonfilter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        return 10
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.pokemon_row,p0,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {

    }

}

class CustomViewHolder(v:View): RecyclerView.ViewHolder(v){

}