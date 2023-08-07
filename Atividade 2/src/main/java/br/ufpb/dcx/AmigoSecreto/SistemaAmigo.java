package br.ufpb.dcx.AmigoSecreto;

import java.util.LinkedList;
import java.util.List;
public class SistemaAmigo {
    private List<Amigo> amigos;

    private List<Mensagem> mensagens;

    //Pesquisa amigo secreto de
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {

        boolean achei = false;

        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailDaPessoa)) {
                String emailAmigoSorteado = a.getEmailAmigoSorteado();

                if (emailAmigoSorteado == null) {
                    throw new AmigoNaoSorteadoException("Não foi sorteado o amigo de " + emailDaPessoa);
                } else {
                    return emailAmigoSorteado;
                }

            }
        }
        throw new AmigoInexistenteException("Não foi encontrado ninguem com o email " + emailDaPessoa);
    }

    //Envia Mensagem Para Todos
    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {

        Mensagem m = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        this.mensagens.add(m);
    }

    //Cadastra Amigo
    public void cadastraAmigo(String nomeAmigo, String emailAmigo) {
        Amigo amigo = new Amigo(nomeAmigo, emailAmigo);
        if (!this.amigos.contains(amigo)) {
            this.amigos.add(amigo);
        }
    }

    //Pesquisa Amigo
    public Amigo pesquisaAmigo(String emailAmigo) {
        Amigo amigo;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                amigo = a;
                return amigo;
            }
        }
        return null;
    }

    //Envia mensagem para alguem
    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        Mensagem mensagem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        this.mensagens.add(mensagem);
    }

    //Pesquisa mensagens anonimas
    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> mensagensAnonimas = new LinkedList<>();
        for (Mensagem m : this.mensagens) {
            if (m.ehAnonima()) {
                mensagensAnonimas.add(m);
            }
        }
        return mensagensAnonimas;
    }

    //Pesquisa todas as mensagens
    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }

    //Configura amigo secreto de
    public void configuraAmigoSecretoDe(String emailAmigoSorteado, String emailDaPessoa) throws AmigoInexistenteException {
        Amigo amigo = null;
        for (Amigo a : this.amigos) {
            if (a.getEmail().equals(emailDaPessoa)) {
                a.setEmailAmigoSorteado(emailAmigoSorteado);
                amigo = a;
            }
        }
        if (amigo == null) {
            throw new AmigoInexistenteException("Email do amigo: " + emailDaPessoa + " não encontrado");
        }
    }


}

