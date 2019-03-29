package com.feranstirman.pokemonfilter.Interfaces

import com.feranstirman.pokemonfilter.Models.PokemonList
import retrofit2.Call
import retrofit2.http.GET

interface GetPokemonService {

    @GET("water")
    fun getAllPokemon(): Call<PokemonList>
}