package br.inatel.felipesss.RedesSociais;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;

    public Set<RedeSocial> redesSet = new HashSet<>();

    public Usuario(RedeSocial[] redesSociais) {

        for (RedeSocial redeSocial : redesSociais) {
            this.redesSet.add(redeSocial);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}