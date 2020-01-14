/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysjava;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class ArraysJava {
        
    private int[] maximos(int[] lista){
        int l=lista.length;
        int maximo=lista[0];
        int maximo2=lista[1];
            for(int i = 0; i<l; i++){
                if(maximo<lista[i] ){
                    maximo2=maximo;
                    maximo=lista[i];    
                }else   if(maximo2<lista[i] && lista[i]!=maximo ){
                   
                    maximo2=lista[i];     
                }
                
             
 
            }
        int[]max = {maximo,maximo2};
         return  max;   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArraysJava ejercicios=new ArraysJava();
        int [] listaNumeros ={99, 31, 24, 2, 5, 50};
        
        System.out.print(Arrays.toString(ejercicios.maximos(listaNumeros)));
        // TODO code application logic here
    }
    
}
