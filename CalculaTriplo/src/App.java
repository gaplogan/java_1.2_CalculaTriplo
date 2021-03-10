import java.util.Scanner; // Biblioteca para utilizar a entrada de dados

public class App {
    public static void main(String[] args) throws Exception { //comando de in�cio do programa

        Scanner entrada = new Scanner(System.in);
        double Num, Triplo; //declara��o das vari�veis do programa
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //comando "LimpaTela" limpa a tela do monitor de v�deo
        //{Entrada dos dados} 
        System.out.println("Digite um n�mero: "); //mensagem para que o usu�rio saiba o que deve fazer
        Num = entrada.nextDouble(); //leitura do n�mero para a mem�ria
        //{Processamento}
        Triplo = Num * 3; //calcula o triplo e armazena o resultado na vari�vel Triplo
        //{Sa�da da informa��o}
        System.out.println(""); //apenas salta uma linha na tela do monitor de v�deo
        System.out.println("O triplo de " + Num + " � " + Triplo); //exibe o resultado
        entrada.close();
    } //comando de fim do programa
}
