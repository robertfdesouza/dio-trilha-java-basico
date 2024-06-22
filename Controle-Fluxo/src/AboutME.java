import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutME {
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite o seu idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu altura: ");
        Double altura = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobreNome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha Altura é " + altura + "cm ");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Favor informar nos campos IDADE e Altura valores númericos!");

        } 
    }
    
}
