package br.ufpb.dcx.AmigoSecreto;

public class MensagemParaTodos extends MensagemParaAlguem {

    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, emailRemetente, anonima);
    }

    @Override
    public String getTextoCompletoAExibir() {
        if (super.ehAnonima()) {
            return "Mensagem para todos. Texto: "+ super.getTexto();

        }else{
            return "Mensagem de "+super.getEmailRemetente()+"para todos. Texto: "+
                    super.getTexto();
        }
    }
}
