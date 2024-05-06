import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
           /* System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar ");*/
            
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean fim = true;

        // Loop infinito para manter o programa em execução até que o usuário decida sair

        while (fim) { 
            
            int opcao = scanner.nextInt(); 

        // TODO: Implemente as condições necessárias para avalia a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.

        switch (opcao) {
            case 1:{
                //System.out.println(" Digite O valor de deposito: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Saldo atual: " + saldo);
                break;
            }
            case 2:{
                //System.out.println(" Digite o valor que deseja sacar ");
                double valorSacado = scanner.nextDouble();
                if(valorSacado > saldo){
                  System.out.println("Saldo insuficiente. ");
                } else {
                  saldo -= valorSacado;
                  System.out.println("Saldo atual: " + saldo);
                }
                break;
            }
            case 3:{
                System.out.println("Saldo atual: " + saldo );
                break;
            }
            case 4:{
                 if (fim = false) {
                break;
                 }
                 
             }
             case 0:{
                if (fim = false) {
               break;
                }
                
            }
             default:
                System.out.println("Programa encerrado.");
                break;

        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                  //System.out.println("Opção inválida. Tente novamente.");
                    //System.out.println("Opção inválida. Tente novamente."); 

            }
        }
    }
}