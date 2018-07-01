/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova3;

/**
 *
 * @author gustavo
 */
public class Preferencial extends Atendimento{
    public static void main(String[] args) {
        Preferencial p = new Preferencial();
        p.TipoAte();
    }
    
    @Override
    public void TipoAte(){
        System.out.println("Garcia");
    }
}
