/**
 * @author Thyago Monnerat
 * @since 2024
 * Projeto para o bootcamp java backend na plataforma DIO. Seguindo o desafio de controle de fluxo, ministrado pelo Gleyson Sampaio.
 */

import java.util.Scanner;
/**Classe onde tem a definição dos números de entrada e a chamada para a função de contar */
public class Contador{
    public static void main(String[] args) {
        /**Pegando os valores através do terminal, utilizando a classe Scanner */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int param1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int param2 = scanner.nextInt();
        scanner.close();
        /**Validando se os valores são aceitos.
         * Nesse caso, a condição para a exceção é o primeiro parâmetro ser maior que o segundo parâmetro
         * Caso seja, 'contar' lança a exceção personalizada ParametrosInvalidosException, onde, então, tem a entrada do Catch para imprimir a exceção.
         */
        try{
            contar(param1, param2);
        }catch(Exception ParametrosInvalidosException){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        /**Condição do método. 
         * Caso o primeiro parametro seja maior que o segundo, é lançado o erro de volta para chamou este método.
         */
       if(param1 > param2){
        throw new ParametrosInvalidosException();
       }else{
        /**Subtração dos parâmetros, caso estejam de acordo com a condição */
       int contagem = param2 - param1;
       /**Um laço de repetição de tamanho relacionado à subtração dos parâmetros e imprimindo os números de forma incremental */
       for(int i=0;i<contagem;i++){
        System.out.println("Imprimindo o número " + (i+1));
       }
       }
    }
}
