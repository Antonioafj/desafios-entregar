import java.util.Scanner; 

public class SimulacaoBancaria { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try{
             
             String numeroConta = scanner.next();

             VerificarNumero(numeroConta);

             System.out.println("Numero de conta valido." );
        
        }catch(IllegalArgumentException e){

            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }
}