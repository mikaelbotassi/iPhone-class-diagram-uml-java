package reprodutorMusical;

public interface ReprodutorMusical{
    public void reproduzir(String nome);
    public void pausar();
    public void avancar();
    public void retroceder();
    public void adicionarMusica(String nome, String duracao, String cantor);
    public void removerMusica(String nome);
    public Musica buscarMusica(String nome);
}