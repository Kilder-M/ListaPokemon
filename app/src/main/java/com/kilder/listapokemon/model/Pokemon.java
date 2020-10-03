package com.kilder.listapokemon.model;


import android.widget.ImageView;


public class Pokemon {

    private String nome;
    private int numero;
    private String tipo;
    private ImageView foto;

    public Pokemon() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ImageView getFoto() {
        return foto;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", foto=" + foto +
                '}';
    }
}
