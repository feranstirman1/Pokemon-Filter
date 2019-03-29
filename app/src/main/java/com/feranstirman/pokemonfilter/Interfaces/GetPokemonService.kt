package com.feranstirman.pokemonfilter.Interfaces

import com.feranstirman.pokemonfilter.Models.PokemonList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GetPokemonService {

    @GET("{tipo}")
    fun getAllPokemon(@Path("tipo") tipoPokemon:String): Call<PokemonList>
}