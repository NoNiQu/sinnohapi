package com.azarquiel.s2daw.sinnohapi.service;

import com.azarquiel.s2daw.sinnohapi.dao.PokemonRepo;
import com.azarquiel.s2daw.sinnohapi.entities.Pokemon;
import com.azarquiel.s2daw.sinnohapi.exception.PokeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPokeImp implements ServicioPoke{

    private final PokemonRepo pokemonRepo;

    @Autowired
    public ServicioPokeImp(PokemonRepo pokemonRepo) {
        this.pokemonRepo = pokemonRepo;
    }

    @Override
    public List<Pokemon> findAll() {
        return pokemonRepo.findAll();
    }

    @Override
    public Pokemon findById(int id) {
        Optional<Pokemon> pokemon = pokemonRepo.findById(id);
        return pokemon.orElseThrow(() -> new PokeException("Pokemon not found with id " + id));
    }

}
