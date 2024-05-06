public class VerificarNumeroConta {

    public static void main(String[] args) {
        
    }

    public static String verificarNumero(String numeroConta) {

        if(numeroConta.length() != 8) 
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    
        }
}
