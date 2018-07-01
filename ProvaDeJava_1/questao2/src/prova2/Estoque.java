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
public class Estoque {
    public static void main(String[] args) {
        Produto p1 = new Produto("café");  //estanciando a classe pruduto construtor 1
        Produto p2 = new Produto("banana",2.00); //estanciando a classe pruduto construtor 2
        
        System.out.println("valor: "+p2.valor);
        
    }
}
