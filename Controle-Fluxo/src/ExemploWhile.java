import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    // o bloco só é executado se a sentença for verdadeira. 
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce valor: " + valorDoce + " Adicinonado no carrinho de compras");
            mesada = mesada - valorDoce;
          
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces!");
           
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2 , 8);
    }

}
