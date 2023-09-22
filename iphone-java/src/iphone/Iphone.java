package iphone;

import java.util.ArrayList;
import java.util.List;

import aparelhoTelefonico.AparelhoTelefonico;
import aparelhoTelefonico.Contato;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.Musica;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private final String modelo;
    private final String numeroSerie;
    private Integer volume;
    private Integer luminosidade;
    private ArrayList<Musica> musicas;
    private ArrayList<Contato> agenda;

    public Iphone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.musicas = new ArrayList<Musica>();
        this.agenda = new ArrayList<Contato>();
    }

    private boolean existeMusica(List<Musica> list, String nome) {
        return list.stream().anyMatch(musica -> musica.getNome().equals(nome));
    }

    @Override
    public void adicionarMusica(String nome, String duracao, String cantor) {
        this.musicas.add(new Musica(nome, duracao, cantor));
    }

    @Override
    public void removerMusica(String nome) {

        System.out.println("DELETANDO MÚSICA");

        if(!existeMusica(this.musicas, nome))
            return;

        this.musicas.removeIf(musica -> musica.getNome().equalsIgnoreCase(nome));

    }

    @Override
    public Musica buscarMusica(String nome) {

        System.out.println("BUSCANDO MÚSICA");

        if(!existeMusica(this.musicas, nome)){
            Musica newMusica = new Musica(nome, "3:40", "Exemplo");
            System.out.println("Não achamos a música que está procurando, aqui está uma que pode gostar:" + newMusica.toString());
            return newMusica;
        }

        Musica musicaEncontrada = this.musicas.stream().filter(musica -> musica.getNome().equalsIgnoreCase(nome)).findFirst().get();

        System.out.println(musicaEncontrada.toString());

        return musicaEncontrada;

    }

    @Override
    public void reproduzir(String nome) {
        System.out.println("VAMOS REPRODUZIR A MÚSICA " + nome);
        Musica musica = this.buscarMusica(nome);
        System.out.println("REPRODUZIDO A MÚSICA " + musica.getNome());
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO AS MÚSICAS");
    }

    @Override
    public void avancar() {
        System.out.println("PULANDO PARA A PROXIMA MÚSICA");
    }

    @Override
    public void retroceder() {
        System.out.println("RETORNANDO PARA A MÚSICA ANTERIOR");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a página Web: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando a página Web: ");
    }

    @Override
    public void realizarBusca(String url) {
        System.out.println("Buscando pela página web:" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechando aba");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    private boolean existeContato(List<Contato> list, String telefone) {
        return list.stream().anyMatch(contato -> contato.getTel().equals(telefone));
    }

    @Override
    public void adicionarContato(String telefone, String nome) {
        this.agenda.add(new Contato(telefone, nome));
    }

    @Override
    public void removerContato(String telefone) {

        System.out.println("DELETANDO CONTATO");

        if(!existeContato(this.agenda, telefone))
            return;

        this.agenda.removeIf(contato -> contato.getTel().equalsIgnoreCase(telefone));

    }

    @Override
    public void fazerChamada(String tel) {
        System.out.println("Realizando chamada para: " + tel);
    }

    @Override
    public void receberChamada(String tel) {
        System.out.println("Recebendo chamada para: " + tel);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada");
    }

    @Override
    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Enviando mensagem '" + mensagem + "' para: " + destinatario);
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        System.out.println("Recebendo mensagem '" + mensagem + "' para: " + remetente);
    }

    @Override
    public void enviarCorreioVoz(String tel) {
        System.out.println("Enviando correio de voz para: " + tel);
    }

    @Override
    public void escutarCorreioVoz(String tel) {
        System.out.println("Escutando correio de voz de: " + tel);
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

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }


}
