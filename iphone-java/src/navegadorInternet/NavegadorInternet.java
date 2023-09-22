package navegadorInternet;

public interface NavegadorInternet {
    public void exibirPagina(String url);
    public void fecharPagina();
    public void realizarBusca(String url);
    public void adicionarNovaAba();
    public void fecharAba();
    public void atualizarPagina();
}
