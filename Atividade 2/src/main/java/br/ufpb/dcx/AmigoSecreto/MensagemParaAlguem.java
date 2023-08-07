package br.ufpb.dcx.AmigoSecreto;

public class MensagemParaAlguem extends Mensagem {

    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima) {

        super(texto, emailRemetente, anonima);
        this.emailDestinatario = this.emailDestinatario;
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (super.ehAnonima()) {
            return "Mensagem para: " + this.emailDestinatario + ". Texto: " + super.getTexto();
        } else {
            return "Mensagem para: " + super.getEmailRemetente()+" para " + this.emailDestinatario+". Texto: " + super.getTexto();
    }
    }
    }
