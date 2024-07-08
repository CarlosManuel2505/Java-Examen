
package Pregunta3;
import java.util.Scanner;
public class Pregunta3 {
      public static void main(String [] args){
      Scanner scan=new Scanner(System.in);
      int i=0;
      while(true){
          System.out.println("Inserta un número positivo o negativo");
          int num=scan.nextInt();
          if(num==-1){
              break;
          }
      i++;
      }
      System.out.println("El total de intentos fue:"+i);
      scan.close();
      }
}