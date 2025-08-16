package com.mycompany.lista01pp;

public class Roupa extends Produto {
    public Roupa(String codigo, String nome, double preco){
        super(codigo, nome, preco);
    }
    
    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }
}
