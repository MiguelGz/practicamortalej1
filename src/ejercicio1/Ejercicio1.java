/*Desarrolle  una  aplicación  que  permita  ingresar  un 
número en base decimal  y muestre su representación en base binaria.
En este caso podemos emplear la herramienta recursividad la cual se emplea 
para llamarse a uno mismo
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author MiguelGz
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Creamos un Scanner con identificador decimal
        Scanner decimal= new Scanner(System.in);
        
        //Pedimos al usuario que ingrece un numero decimal
        System.out.print("INTRODUSCA UN NUMERO DECIMAL :   ");
        
        int numero=decimal.nextInt();
        
        // PLANTEAMOS LOS CASOS DE CONVERSION DEPENDIENSO SI..
       
        if (numero>=0)
            {
                
            System.out.println();
            System.out.print("NUMERO BINARIO EQUIVALENTE :    ");
            conversion(numero);
            
            }
       
        else
            {
                
            /*
            Usamos esta operacion ya que los numeros negativos 
            tambien tienen equivalente binario.
            */
                
            numero=numero/-1;
            System.out.print("NUMERO BINARIO EQUIVALENTE :    ");
            conversion(numero);
            
            }  
        
    }
    
             /*
             Creamos otro metodo denominado conversion el cual nos permitira convertir 
             de esta misma clase a otra o a ella misma
             */
    
    public static void conversion(int numero)
            {
            if(numero<2)
                {
                    
                System.out.print(numero);
                
                }
            
            else
                {
                    
                conversion(numero/2);
                System.out.print(numero%2);
                
                }
        
        }
    
}