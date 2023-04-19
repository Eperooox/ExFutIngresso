package br.com.newtonpaiva.dominio;

public class Ingresso
{
    public String nomeJogo;
    public Double valor;

    public Double getValor()
    {
        return valor;
    }

    public void setValor(Double valor)
    {
        this.valor = valor;
    }
    public Integer NumeroIngresso;

    public Integer getNumeroIngresso() {
        return NumeroIngresso;
    }

    public void setNumeroIngresso(Integer numeroIngresso) {
        this.NumeroIngresso = numeroIngresso;
    }


    public String getNomeJogo() {        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }
}
