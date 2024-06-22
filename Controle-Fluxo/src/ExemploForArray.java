public class ExemploForArray {
    public static void main(String[] args) {

        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS", "ROBERT", "ISABELLA"};
        // INDICE DE ARRAY SEMPRE COMEÇA COM ZERO
        for (int x = 0; x<alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        
    }
}
