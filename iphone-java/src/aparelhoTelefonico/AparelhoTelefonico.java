package aparelhoTelefonico;

public interface AparelhoTelefonico{
    public void fazerChamada(String tel);
    public void receberChamada(String tel);
    public void encerrarChamada();
    public void enviarMensagem(String destinatario, String mensagem);
    public void receberMensagem(String remetente, String mensagem);
    public void enviarCorreioVoz(String tel);
    public void escutarCorreioVoz(String tel);
}