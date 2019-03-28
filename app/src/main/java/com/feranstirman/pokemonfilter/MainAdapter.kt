package com.feranstirman.pokemonfilter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.pokemon_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){

    val pokemonNames = listOf<String>("charmander","squirtle","bulbasaur")

    override fun getItemCount(): Int {
        return pokemonNames.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val cellForRow = layoutInflater.inflate(R.layout.pokemon_row,p0,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val pokemonName = pokemonNames.get(p1)
        p0.itemView.tv_pokemon_name.text = pokemonName

    }

}

class CustomViewHolder(v:View): RecyclerView.ViewHolder(v){

}