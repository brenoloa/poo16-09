public class Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private boolean ativo;

    
    public void depositar(double depositar){
        if (this.getAtivo() == true){

            this.saldo += depositar;
        }
        else {
            System.out.println("CONTA DESATIVADA, NAO É POSSIVEL DEPOSITAR.");
        }
    }
    
    public void sacar(double sacar){
        if (this.getAtivo() == true){

            this.saldo = this.saldo - sacar;
        }
        else {
            System.out.println("VOCÊ NAO PODE SACAR DE UMA CONTA DESATIVADA.");
        }
    }
    
    public Conta(String nome, String cpf, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.cpf = cpf;
        this.ativo = false;
    }
    
    public void status(){
        System.out.println("SITUAÇÃO DA CONTA : " + this.ativo);
        System.out.println("NOME TITULAR: " + this.nome);
        System.out.println("CPF DO TITULAR: " + this.cpf);
        System.out.println("SALDO: R$" + this.saldo);
    }
    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getAtivo(){
        return this.ativo;
    }
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
}
