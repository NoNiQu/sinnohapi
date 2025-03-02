package com.azarquiel.s2daw.sinnohapi.service;

import com.azarquiel.s2daw.sinnohapi.entities.Pokemon;

import java.util.List;

public interface ServicioPoke {
    List<Pokemon> findAll();
    Pokemon findById(int id);
}
