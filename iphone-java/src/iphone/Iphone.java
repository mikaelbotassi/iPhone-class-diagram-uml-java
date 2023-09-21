package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String modelo;
    private String numeroSerie;
    private Integer volume;
    private Integer luminosidade;

    

    public Iphone(String modelo, String numeroSerie, Integer volume, Integer luminosidade) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.volume = volume;
        this.luminosidade = luminosidade;
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

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getLuminosidade() {
        return luminosidade;
    }
    public void setLuminosidade(Integer luminosidade) {
        this.luminosidade = luminosidade;
    }

}
