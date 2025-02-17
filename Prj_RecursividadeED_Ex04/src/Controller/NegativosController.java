/*
    Ponto de parada: subtrair o tamanho do vetor até chegar a zero.
    A função é chamada e verifica se a posição da vez contém um número negativo, se sim, ela incrementa um na soma,
    se não, ela vai para a próxima posição.
 
 */

package Controller;

public class NegativosController {
    
    public NegativosController(){
        super();
        
    }
    
    public int contaNegativos (int[] vet, int tamanho){        
        
        if(tamanho == 0){
            
            return 0;
            
        } else if (vet[tamanho] > 0){
            
            return 0 + contaNegativos(vet, (tamanho - 1));
            
        } else {                        
            
            return 1 + contaNegativos(vet, (tamanho - 1));
        }
    }
}
