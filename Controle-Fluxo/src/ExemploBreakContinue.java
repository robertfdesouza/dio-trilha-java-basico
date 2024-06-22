public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            continue; // o continuie não para a interação somente não imprime o número 03
                      // Já o break interrompe a interação no número 03 imprimindo somente os números 1 e 2.

            System.out.println(numero);
        }
    }
}
