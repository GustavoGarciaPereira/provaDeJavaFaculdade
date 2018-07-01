/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author gustavo
 */
public class Produto {
    public String nome;
    public double valor;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }    
}
