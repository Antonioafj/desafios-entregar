import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        
        for(double i = 0; i <= limiteDiario;){

            double valorSaque = scanner.nextDouble();

            i= valorSaque;
            if(valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                 
            }else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                
                } else{
                    limiteDiario -= valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                }
          
        }

        scanner.close(); 
 }
}