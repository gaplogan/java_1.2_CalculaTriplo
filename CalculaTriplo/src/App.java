import java.util.Scanner; // Biblioteca para utilizar a entrada de dados

public class App {
    public static void main(String[] args) throws Exception { //comando de início do programa

        Scanner entrada = new Scanner(System.in);
        double Num, Triplo; //declaração das variáveis do programa
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //comando "LimpaTela" limpa a tela do monitor de vídeo
        //{Entrada dos dados} 
        System.out.println("Digite um número: "); //mensagem para que o usuário saiba o que deve fazer
        Num = entrada.nextDouble(); //leitura do número para a memória
        //{Processamento}
        Triplo = Num * 3; //calcula o triplo e armazena o resultado na variável Triplo
        //{Saída da informação}
        System.out.println(""); //apenas salta uma linha na tela do monitor de vídeo
        System.out.println("O triplo de " + Num + " é " + Triplo); //exibe o resultado
        entrada.close();
    } //comando de fim do programa
}
