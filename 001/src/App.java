
public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("FABRICIA", "123.123.123-12", 2000);
        //c1.setAtivo(true);
        
        
        c1.depositar(10000);
        c1.status();
    }
}
