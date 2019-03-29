package com.feranstirman.pokemonfilter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.feranstirman.pokemonfilter.Models.Pokemon
import com.feranstirman.pokemonfilter.Models.PokemonInfo
import kotlinx.android.synthetic.main.pokemon_row.view.*

class MainAdapter(val pokemonList: List<PokemonInfo>): RecyclerView.Adapter<CustomViewHolder>(){

    override fun getItemCount(): Int {
        return pokemonList.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.pokemon_row,parent,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val pokemon = pokemonList.get(position)
        holder.itemView.tv_pokemon_name.text = pokemon.pokemon.name

    }

}

class CustomViewHolder(v:View): RecyclerView.ViewHolder(v){

}