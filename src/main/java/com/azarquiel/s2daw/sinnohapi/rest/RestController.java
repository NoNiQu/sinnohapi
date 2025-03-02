package com.azarquiel.s2daw.sinnohapi.rest;

import com.azarquiel.s2daw.sinnohapi.entities.Pokemon;
import com.azarquiel.s2daw.sinnohapi.service.ServicioPoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private final ServicioPoke servicioPoke;

    @Autowired
    public RestController(ServicioPoke servicioPoke) {
        this.servicioPoke = servicioPoke;
    }

    @GetMapping(value = "/", produces = "text/html")
    public String giget() {
        return "    <style>"
                + "        table { width: 60%; margin: 0px auto; font-family: Arial, sans-serif; background-color: #FEF9E7; }"
                + "        caption { background-color: #85C1E9; color: #154360; font-size: 30px; padding: 10px;}"
                + "        th, td { padding: 12px; text-align: left; border-bottom: 1px solid #ddd; }"
                + "        th { background-color: #82E0AA; color: #1E5631; }"
                + "        tr:nth-child(even) { background-color: #FDEBD0; }"
                + "        tr:hover { background-color: #F9E79F; }"
                + "    </style>"
                + "    <table>"
                + "        <caption>Welcome to Pokedex Sinnoh API</caption>"
                + "        <tr>"
                + "            <th>Method</th>"
                + "            <th>Url</th>"
                + "            <th>Description</th>"
                + "        </tr>"
                + "        <tr>"
                + "            <td>GET</td>"
                + "            <td>/pokedex_sinnoh</td>"
                + "            <td>Lista de Pokémon de Sinnoh</td>"
                + "        </tr>"
                + "        <tr>"
                + "            <td>GET</td>"
                + "            <td>/pokedex_sinnoh/{id}</td>"
                + "            <td>Información de Pokémon por ID</td>"
                + "        </tr>"
                + "    </table>"
                + "    <p style='text-align:center; font-family: Arial, sans-serif; margin-top: 20px;'>Created by Marcos Alarcón</p>";
    }


    @GetMapping("/pokedex_sinnoh")
    public List<Pokemon> pokedex() {
        return servicioPoke.findAll();
    }

    @GetMapping("/pokedex_sinnoh/{id}")
    public Pokemon pokedex(@PathVariable int id) {
        return servicioPoke.findById(id);
    }

}
