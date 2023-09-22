package aparelhoTelefonico;

public class Contato {
    private String tel;
    private String nome;

    public Contato(String tel, String nome) {
        this.tel = tel;
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Contato [tel=" + tel + ", nome=" + nome + "]";
    }

}
