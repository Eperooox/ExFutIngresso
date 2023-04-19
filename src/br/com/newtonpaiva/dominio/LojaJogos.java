package br.com.newtonpaiva.dominio;
import javax.swing.JOptionPane;
public class LojaJogos
{
    public static void main(String[] args)
    {
        Cliente Cl = new Cliente();
        Ingresso In = new Ingresso();

        String nomeCliente = JOptionPane.showInputDialog("Insira seu nome: ");
        String nomeJogo = JOptionPane.showInputDialog("Insira o Jogo desejado: ");
        Double valorJogo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Ingresso: "));
        Integer NumIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de ingressos desejados: "));
        Cl.setNome(nomeCliente);
        In.setNomeJogo(nomeJogo);
        In.setValor(valorJogo);
        In.setNumeroIngresso(NumIngresso);

        JOptionPane.showMessageDialog(null, "Pedido feito para " + Cliente.Nome
                + "\n" + In.getValor() + ": " + In.getNomeJogo() + "\n Valor: " + );

    }
}
