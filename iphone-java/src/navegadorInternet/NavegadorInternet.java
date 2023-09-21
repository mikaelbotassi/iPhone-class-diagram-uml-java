package navegadorInternet;

public interface NavegadorInternet {
    public void exibirPagina(String url);
    public void fecharPagina(String url);
    public void realizarBusca(String url);
    public void adicionarNovaAba(String url);
    public void fecharAba(String url);
    public void atualizarPagina(String url);
}
