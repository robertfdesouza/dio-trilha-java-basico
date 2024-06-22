public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("7339010");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // Mensagem de tratamento de erro para o usuário
            System.out.println("O Cep informado está fora da regra de negócio!");
        }
        
    }
    
    //metodo para formatar cep
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "73.421-128";
    }

    
}
