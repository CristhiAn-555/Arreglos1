

package ec.edu.espoch.arreglo;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Arreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] notas = new int[10];
         int conRegular=0;
         int conBueno=0;
         int conExcelente=0;
        /*numeros[0]=10;
        numeros[1]=3;
        numeros[2]=5;
        numeros[3]=8;
        numeros[4]=7;*/
        
        System.out.println("Ingrese las notas de los estudiantes...");
        for (int i = 0; i < 10; i++) {
            
            notas[i]=sc.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            if (notas[i] >0 && notas[i] <=6) {
                conRegular= conRegular + 1;
                 
            }else if (notas[i]> 6 && notas[i]<=8){
                conBueno++;
            }else if(notas[i]> 8 && notas[i]<=10){
                conExcelente++;
            }
            
            
            System.out.println("Existe " + conRegular + "estudiantes con notas regulares : ");
            System.out.println("Existe " + conBueno + "estudiantes con notas bueno : ");
            System.out.println("Existe " + conExcelente + "estudiantes con notas Excelente : ");
           
            
        }
        
        
        
        
    }
}
