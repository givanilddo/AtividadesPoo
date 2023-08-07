package br.ufpb.dcx.AmigoSecreto;

import java.util.Objects;

public class Amigo implements Comparable<Amigo> {
    //Atributos
    private String nome;
    private String email;
    private String emailAmigoSorteado;

    //Construtor
    public Amigo(String nome, String email)
    {
        this.nome = nome;
        this.email = email;
        this.emailAmigoSorteado = emailAmigoSorteado;
    }
    //getter and Setter
    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmailAmigoSorteado()
    {
        return this.emailAmigoSorteado;
    }

    public void setEmailAmigoSorteado(String emailAmigoSorteado)
    {
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    //ToString
    @Override
    public String toString() {
        return "Amigo de"+ nome + '\'' +
                ", email:"+ email + '\'' +
                ", emailAmigoSorteado: "+ emailAmigoSorteado + '\'';
    }

    //equals & hashCode
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amigo amigo = (Amigo) o;

        return Objects.equals(email, amigo.email);
    }

    @Override
    public int hashCode()
    {
        return email != null ? email.hashCode() : 0;
    }

    //CompareTo
    @Override
    public int compareTo(Amigo o)
    {
        return this.nome.compareTo(o.getNome());
    }

}
