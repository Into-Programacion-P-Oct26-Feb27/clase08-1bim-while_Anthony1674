
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
public class ejemplo063 {
    
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "";
        while(bandera == true){
            System.out.println("Ingrese un pais");//estoy en el ciclo
            pais = entrada.nextLine();
            
            System.out.println("Ingrese una capital");//estoy en el ciclo
            capital = entrada.nextLine();
            
            reporte = String.format("%s%S\t%S\n", reporte , pais , capital);
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si .");
            salir = entrada.nextLine();
            if (salir .equals("si")){
                bandera = false;
            }
        }
        System.out.printf("%s\n" , reporte);
     }
    
}
/*
cuando esta en 100 permanece en el ciclo, cuando ingresa -100 sale del ciclo 
*/

