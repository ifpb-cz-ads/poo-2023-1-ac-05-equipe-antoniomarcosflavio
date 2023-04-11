import java.util.Scanner;

/**
 * BMExercicio06
 */
public class BMExercicio06 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int numero = 100;
    
    
    while (numero != 0) {
      System.out.println("Informe um numero entre 1 e 7, 0 para encerrar: ");
      numero = leitor.nextInt();
      switch(numero) {
        case 1:
          System.out.println("Domingo");
          break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta-feira");
            break;
        case 5:
            System.out.println("Quinta-feira");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Número informado incompatível.");
            break;

      }
    }
    leitor.close();
  }
}