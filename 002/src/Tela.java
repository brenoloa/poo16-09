import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela {

    Cliente c1 = new Cliente("FABRICIA", "123.123.123-52", 2000);
    Funcionario f1 = new Funcionario("JOSE AUGUSTO", 001);    
    Banco b1 = new Banco(c1, f1);
    public Tela() {

        JFrame tela = new JFrame("BANCO");
        tela.setSize(900, 900);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        
        tela.setLayout(null);
        
        JButton botao1 = new JButton("SACAR");
        botao1.setBounds(10, 10, 200, 200);
        JButton botao2 = new JButton("DEPOSITAR");
        botao2.setBounds(10, 200, 200, 200);
        botao2.setBackground(new Color(11, 158, 30));
        botao2.setForeground(new Color(255, 255, 255));
        botao2.setFont(new Font("Arial", Font.BOLD, 20));
        tela.add(botao1);
        tela.add(botao2);
        tela.setVisible(true);

        JTextField texto = new JTextField();
        texto.setBounds(10, 400, 200, 100);
        tela.add(texto);
        botao1.addActionListener(this::sacar);
        botao2.addActionListener(this::despoitar);
    }

    private void sacar(ActionEvent actionevent1) {
        b1.saque(50);
    }

    private void despoitar(ActionEvent e) {
        b1.depositar(500);
    }
    
}
