import java.util.Random;


public class ExemploDoWhile {
    //Chamado de faça enquanto - O Bloco será executado pelo menos uma vez
    public static void main(String[] args) {
      
       System.out.println("Discando...");
        
       do{
        //executando repetidas vezes até alguém atender
        System.out.println("Telefone Tocando");
       }while(tocando());

       System.out.println("Alô !!!");



    }
    //metodo
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
