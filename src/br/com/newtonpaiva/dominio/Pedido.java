package br.com.newtonpaiva.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Ingresso
{
    public String Cliente;
    public List <Ingresso> ListaIngressos = new ArrayList<Ingresso>();

    public double ValorPedido()
    {return getValor()*getNumeroIngresso();}

}
