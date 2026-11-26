
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALASC
 */
public class ejemplo062 {
    
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        
        while(bandera == true){
            System.out.println("Estoy en el ciclo");//estoy en el ciclo
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si .");
            salir = entrada.nextLine();
            if (salir .equals("si")){
                bandera = false;
            }
        }
     }
    
}
/*
cuando esta en 100 permanece en el ciclo, cuando ingresa -100 sale del ciclo 
*/

