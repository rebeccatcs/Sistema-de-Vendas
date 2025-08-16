package com.mycompany.lista01pp;

public class Eletronico extends Produto {
    public Eletronico(String codigo, String nome, double preco){
        super(codigo, nome, preco);
    }
    
    @Override
    public double calcularDesconto() {
        return preco * 0.10;
    }
}
