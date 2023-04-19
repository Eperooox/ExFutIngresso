package br.com.newtonpaiva.dominio;
import javax.swing.JOptionPane;
public class LojaJogos
{
    public static void main(String[] args)
    {
        Cliente cl = new Cliente();
        Ingresso in = new Ingresso();
        Pedido pe = new Pedido();

        String nomeCliente = JOptionPane.showInputDialog("Insira seu nome: ");
        String nomeJogo = JOptionPane.showInputDialog("Insira o Jogo desejado: ");
        Double valorJogo = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do Ingresso: "));
        Integer NumIngresso = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de ingressos desejados: "));
        cl.setNome(nomeCliente);
        in.setNomeJogo(nomeJogo);
        in.setValor(valorJogo);
        in.setNumeroIngresso(NumIngresso);
        pe.setValorPedido(ValorPedido);

        JOptionPane.showMessageDialog(null, "Pedido feito para " + cl.getNome()
                + "\n" + in.getValor() + ": " + in.getNomeJogo() + "\n Valor: " + pe.);

    }
}
