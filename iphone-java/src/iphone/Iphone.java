package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private final String modelo;
    private final String numeroSerie;
    private Integer volume;
    private Integer luminosidade;

    

    public Iphone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void reproduzir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reproduzir'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    @Override
    public void avancar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'avancar'");
    }

    @Override
    public void retroceder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retroceder'");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void fecharPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fecharPagina'");
    }

    @Override
    public void realizarBusca(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarBusca'");
    }

    @Override
    public void adicionarNovaAba(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void fecharAba(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fecharAba'");
    }
    @Override
    public void atualizarPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void fazerChamada(String tel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerChamada'");
    }

    @Override
    public void receberChamada(String tel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberChamada'");
    }

    @Override
    public void encerrarChamada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encerrarChamada'");
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarMensagem'");
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberMensagem'");
    }

    @Override
    public void enviarCorreioVoz(String tel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enviarCorreioVoz'");
    }

    @Override
    public void escutarCorreioVoz(String tel) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'escutarCorreioVoz'");
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        if(volume > 10 || volume < 0)
            throw new IllegalArgumentException("O Volume não deve ser menor que 0 nem maior que 10");
        this.volume = volume;
    }

    public Integer getLuminosidade() {
        return luminosidade;
    }
    public void setLuminosidade(Integer luminosidade) {
        if(luminosidade > 10 || luminosidade < 0)
            throw new IllegalArgumentException("A luminosidade não deve ser menor que 0 nem maior que 10");
        this.luminosidade = luminosidade;
    }

}
