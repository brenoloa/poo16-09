public class Cliente extends Pessoa{
    private String cpf;
    private double saldo;
    public Cliente(String nome, String cpf, double saldo) {
        super(nome);
        this.cpf = cpf;
        this.saldo = saldo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
