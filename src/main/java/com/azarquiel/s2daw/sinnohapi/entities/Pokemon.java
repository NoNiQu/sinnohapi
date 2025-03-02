package com.azarquiel.s2daw.sinnohapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "tipo", nullable = false, length = 100)
    private String tipo;

    @Column(name = "tipo_pokemon", nullable = false, length = 100)
    private String tipoPokemon;

    @Column(name = "legendario", nullable = false)
    private Boolean legendario = false;

    @Column(name = "fase_evolutiva", nullable = false)
    private Integer faseEvolutiva;

    @Column(name = "altura", nullable = false, length = 10)
    private String altura;

    @Column(name = "peso", nullable = false, length = 10)
    private String peso;

    @Lob
    @Column(name = "descripcion_diamante_perla", nullable = false)
    private String descripcionDiamantePerla;

    @Lob
    @Column(name = "descripcion_platino", nullable = false)
    private String descripcionPlatino;

    @Column(name = "sprite_diamante_perla")
    private String spriteDiamantePerla;

    @Column(name = "sprite_platino")
    private String spritePlatino;

    @Column(name = "sprite_miniatura")
    private String spriteMiniatura;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public Boolean getLegendario() {
        return legendario;
    }

    public void setLegendario(Boolean legendario) {
        this.legendario = legendario;
    }

    public Integer getFaseEvolutiva() {
        return faseEvolutiva;
    }

    public void setFaseEvolutiva(Integer faseEvolutiva) {
        this.faseEvolutiva = faseEvolutiva;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDescripcionDiamantePerla() {
        return descripcionDiamantePerla;
    }

    public void setDescripcionDiamantePerla(String descripcionDiamantePerla) {
        this.descripcionDiamantePerla = descripcionDiamantePerla;
    }

    public String getDescripcionPlatino() {
        return descripcionPlatino;
    }

    public void setDescripcionPlatino(String descripcionPlatino) {
        this.descripcionPlatino = descripcionPlatino;
    }

    public String getSpriteDiamantePerla() {
        return spriteDiamantePerla;
    }

    public void setSpriteDiamantePerla(String spriteDiamantePerla) {
        this.spriteDiamantePerla = spriteDiamantePerla;
    }

    public String getSpritePlatino() {
        return spritePlatino;
    }

    public void setSpritePlatino(String spritePlatino) {
        this.spritePlatino = spritePlatino;
    }

    public String getSpriteMiniatura() {
        return spriteMiniatura;
    }

    public void setSpriteMiniatura(String spriteMiniatura) {
        this.spriteMiniatura = spriteMiniatura;
    }

}