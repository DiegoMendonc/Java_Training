public class ExemploBreakContinue{
    public static void main(String[] args) {
        for (int numero = 0; numero <= 5; numero ++){
            if (numero == 3){
                System.out.println("O número " + numero + (" foi pulado!"));
                continue;
            }
            System.out.println(numero);
        }
    }
}