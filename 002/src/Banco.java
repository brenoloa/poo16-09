public class Banco {
    private Cliente cliente;
    private Funcionario funcio;
    public Banco(Cliente cliente, Funcionario funcio) {
        this.cliente = cliente;
        this.funcio = funcio;
    }

    
    public void depositar(double deposito){
        cliente.setSaldo(cliente.getSaldo() + deposito);
        System.out.println("FOI DEPOSITADO: " + deposito + "NA CONTA DO " + cliente.getNome() + " AUTORIZADO PELO FUNCIONARIO: " + funcio.getNome());
    }
    public void saque(double saque){
        cliente.setSaldo(cliente.getSaldo() - saque);
        System.out.println("FOI SACADO: " + saque + "NA CONTA DO " + cliente.getNome() + " AUTORIZADO PELO FUNCIONARIO: " + funcio.getNome());
        
    }

    

}
