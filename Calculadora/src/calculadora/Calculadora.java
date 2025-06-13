package calculadora;
import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculos calculos = new Calculos();
        String opcaoEscolhida;
        
        do{
            System.out.print("Digite o X");
            System.out.println("Calculadora: ");
            System.out.print("|1, 2 ,3| +");
            System.out.println("|4, 5 ,6| -");
            System.out.println("|7, 8 ,9| *");
            System.out.println("|   0   | /");

            System.out.println("\n\nDigite os numeros para fazer a operacao: ");
            double numeroUm = scan.nextDouble(); scan.nextLine(); System.out.print(" | ");  double numeroDois = scan.nextDouble(); scan.nextLine();
            System.out.print("\nDigite a operacao: ");
            opcaoEscolhida = scan.nextLine();

            switch (opcaoEscolhida) {
                    case "+":
                        System.out.print(calculos.fazerSoma(numeroUm, numeroDois));
                        break;
                    case "-":
                        System.out.print(calculos.fazerSubtracao(numeroUm, numeroDois));
                        break;
                    case "*":
                        System.out.print(calculos.fazerMultiplicacao(numeroUm, numeroDois));
                        break;
                    case "/":
                        System.out.print(calculos.fazerDivisao(numeroUm, numeroDois));
                        break;
                    case "X":
                        System.out.println("Obrigado por usar o sistema!");
                        break;
                    default:
                        System.out.println("Digite uma opcao valida");
                        break;
            }
        }while(opcaoEscolhida != "X");
    }
    
}
