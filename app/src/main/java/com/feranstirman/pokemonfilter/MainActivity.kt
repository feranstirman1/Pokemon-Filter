package com.feranstirman.pokemonfilter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log.d
import com.feranstirman.pokemonfilter.Interfaces.GetPokemonService
import com.feranstirman.pokemonfilter.Models.Pokemon
import com.feranstirman.pokemonfilter.Models.PokemonList
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/type/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = retrofit.create(GetPokemonService::class.java)

        //va a buscar los pokemon del tipo que sale en el edittext
        btn_buscar.setOnClickListener {
            val tipoPokemon = et_tipo_pokemon.text.toString().toLowerCase().trim()

            api.getAllPokemon(tipoPokemon).enqueue(object: Callback<PokemonList>{
                override fun onResponse(call: Call<PokemonList>, response: Response<PokemonList>) {
                    val body = response.body()
                    val pokemonInfo = body?.pokemon

                    rv_main.adapter = MainAdapter(pokemonInfo!!,tipoPokemon)

                }

                override fun onFailure(call: Call<PokemonList>, t: Throwable) {
                    d("anstirman","something went wrong AAAAAAAA")
                }

            })

        }



        rv_main.layoutManager = LinearLayoutManager(this)


    }

}
