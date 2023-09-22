package reprodutorMusical;

public class Musica {
    private String nome;
    private String duracao;
    private String cantor;

    public Musica(String nome, String duracao, String cantor) {
        this.nome = nome;
        this.duracao = duracao;
        this.cantor = cantor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public String toString() {
        return "Musica [nome=" + nome + ", duracao=" + duracao + ", cantor=" + cantor + "]";
    }

    
    

}
