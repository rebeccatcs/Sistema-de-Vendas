package com.mycompany.lista01pp;

public class Livro extends Produto {
    public Livro(String codigo, String nome, double preco){
        super(codigo, nome, preco);
    }
    
    @Override
    public double calcularDesconto(){
        return preco * 0.05;
    }
}
