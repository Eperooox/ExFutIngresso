package br.com.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido
{
    public String Cliente;
    public List <Ingresso> ListaIngressos = new ArrayList<Ingresso>();

    public double ValorPedido()
    {
        double valorPedido = 0;
        for (int i = 0; i < ListaIngressos.size();i++)
        {
            Integer ing = (Ingresso) ListaIngressos.get(i);


        }
    }
}
