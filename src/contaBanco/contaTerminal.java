package contaBanco;

import java.util.Scanner;

/*
 * Crie o projeto ContaBanco que receberá dados via terminal contendo 
 * as características de conta em banco conforme atributos abaixo:
 * Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
 * 
 * Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
 * Programa: "Por favor, digite o número da Agência !"
 * Usuário: 1021 (depois ENTER para o próximo campo)
	
 * Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
 * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
*/

public class contaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite o valor do saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Digite o número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite o número agencia ex: 123-5: ");
		String agencia = scanner.next();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
		+ ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
		
		
		scanner.close();

	}

}
