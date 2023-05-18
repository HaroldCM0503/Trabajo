/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoengrupo_sierpinski;
import java.util.Scanner;
/**
 *
 * @author harol
 */
public class TrabajoEnGrupo_Sierpinski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean respuesta = true;
        while (respuesta){
            System.out.println(" ");
            System.out.println("1.)Anillo");
            System.out.println("2.)Fractal");
            System.out.println("3.)Salir");
            int opcion = 0;
            opcion = leer.nextInt();
            
            switch (opcion){
            
                case 1:
                    for (int i=0;i<3;i++){
                        for (int j=0;j<3-i;j++){
                        System.out.print(" ");
                        }//fin for 2
                        for (int k=0;k<=i;k++){
                            System.out.print("\033[36m*"); 
                        }//fin for 3
                        for (int l=0;l<i;l++){
                           System.out.print("*");  
                       }//fin for 3
                        for (int j=0;j<3-i;j++){
                            System.out.print("0");
                       }//fin for 2
                        for (int j=0;j<3-i;j++){
                         System.out.print("0");
                       }//fin for 2
                       for (int k=0;k<=i;k++){
                            System.out.print("*"); 
                       }//fin for 3
                       for (int l=0;l<i;l++){
                            System.out.print("*");  
                       }//fin for 3
                       for (int j=0;j<3-i;j++){
                           System.out.print("0");
                          }//fin for 2
                       for (int j=0;j<3-i;j++){
                           System.out.print("0");
                       }//fin for 2
                       for (int k=0;k<=i;k++){
                            System.out.print("*"); 
                       }//fin for 3
                       for (int l=0;l<i;l++){
                           System.out.print("*");  
                       }//fin for 3
                    System.out.println(" ");      
                    }//fin for 1  
                    
                    for (int i=0;i<3;i++){
                        for (int l=0;l<i;l++){
                            System.out.print(" ");  
                        }//fin for 3
                        for (int j=0;j<10-i;j++){
                            System.out.print("\033[36m0");
                        }//fin for 2
                        for (int j=0;j<10-i;j++){
                            System.out.print("0");
                        }//fin for 2
                          
                    System.out.println(" ");
                    }//fin for 1
                
                    double radius = 6; // radio del círculo
        
                    for (double i = -radius; i <= radius; i++) {
                        for (double j = -radius-3; j <= radius; j++) {
                            double distance = Math.sqrt(i * i + j * j);
                            if (distance > radius - 1 && distance < radius + 1) {
                                System.out.print("\033[33m*");
                                }   
                            else {
                                System.out.print(" ");
                            }   
                        }
                        System.out.println();
                    }   
                    break;
                
                case 2:
                    System.out.println("Ingrese la cantidad de filas a imprimir: ");
                    int filas = leer.nextInt();
                    long numero = 0;
                    long factJ = 1;
                    long factI = 1;
                    long factR = 1;
        
                    for (int i = 0; i < filas; i++){
                        for (int s = i; s < filas; s++){
                        System.out.print(" ");
                        }
            
                        for (int j = 0; j <= i; j++){
                            for (int n = 1; n<= j; n++){
                                factJ *= n;
                                }
                            for (int n = 1; n<= i; n++){
                                factI *= n;
                                }
                            for (int n = 1; n<= (i-j); n++){
                                factR *= n;
                                }
                            numero = factI/(factJ * factR);
                            if (numero%2 != 0){
                                System.out.print("\033[33m* ");
                                }
                            else{
                                System.out.print("  ");
                                }
                            factJ = 1;
                            factI = 1;
                            factR = 1;
                            }
                        System.out.println("");
                        }
                    break;
                
                case 3:
                    respuesta = false;
                    break;
                
                default:
                    System.out.println("Elija una opcion valida");
   }
  }
 }
}    