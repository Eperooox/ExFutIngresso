package br.com.newtonpaiva.dominio;

public class Ingresso
{
    public String nomeJogo;
    public Double valor;

    public Double getValor()
    {return valor;}

    public void setValor(Double valor)
    {this.valor = valor;}

    public Integer numeroIngresso;

    public Integer getNumeroIngresso()
    {return numeroIngresso;}

    public void setNumeroIngresso(Integer numeroIngresso)
    {this.numeroIngresso = numeroIngresso;}

    public String getNomeJogo()
    {return nomeJogo;}

    public void setNomeJogo(String nomeJogo)
    {this.nomeJogo = nomeJogo;}
}
