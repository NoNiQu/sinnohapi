package com.azarquiel.s2daw.sinnohapi.dao;

import com.azarquiel.s2daw.sinnohapi.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepo extends JpaRepository<Pokemon, Integer> {

    @Query("SELECT p FROM Pokemon p WHERE p.nombre LIKE CONCAT('%', :nombre, '%')")
    List<Pokemon> findPokemonByNombreLike(@Param("nombre") String nombre);

}
