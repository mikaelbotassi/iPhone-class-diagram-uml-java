import iphone.Iphone;

public class Client {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone("Iphone 1", "ZX45ER");
        
        iphone.adicionarMusica("Calm Down", "3:40", "Selena Gomez");
        iphone.adicionarMusica("Flowers", "3:40", "Miley Cyrus");
        iphone.adicionarMusica("Dance The Night", "3:40", "Dua Lipa");

        iphone.reproduzir("Calm Down");
        iphone.removerMusica("Calm Down");

        iphone.adicionarContato("999999999", "Exemplo");
        iphone.adicionarContato("888888888", "Exemplo 2");

        System.out.println(iphone.getAgenda());
        
        iphone.removerContato("888888888");
        System.out.println(iphone.getAgenda());
        
        iphone.fazerChamada("888888888");
    
    }
}
