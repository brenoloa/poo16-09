public class Funcionario extends Pessoa{
    private int codigo;

    
    
    public Funcionario(String nome, int codigo) {
        super(nome);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
