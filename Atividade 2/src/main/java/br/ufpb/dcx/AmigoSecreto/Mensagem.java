package br.ufpb.dcx.AmigoSecreto;

public abstract class Mensagem {
    //Atributos
    private String texto;
    private String emailRemetente;
    private boolean anonima;

    //costrutor
    public Mensagem(String texto, String emailRemetente, boolean anonima) {
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }

    //getter and Setter
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract String getTextoCompletoAExibir();

    public String getEmailRemetente() {
        return this.emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }

    public boolean ehAnonima(){
        return this.anonima;
    }
}

