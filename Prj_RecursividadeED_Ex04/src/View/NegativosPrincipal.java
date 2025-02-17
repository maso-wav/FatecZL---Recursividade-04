package View;

import Controller.NegativosController;

public class NegativosPrincipal {
    
    public static void main (String args[]){
        
        NegativosController nc = new NegativosController();
        
        int[] vetor = {3,-4,9,-1,-14,2};
        int tamanho = vetor.length;
        
        int negativos = nc.contaNegativos(vetor, tamanho - 1);
        
        System.out.println("HÁ " + negativos + " NÚMEROS NEGATIVOS NO VETOR.");
    }
    
}
