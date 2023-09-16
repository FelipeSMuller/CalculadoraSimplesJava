package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Calculadora Simples: Crie uma calculadora simples que pede ao usuário dois
		 * números e uma operação (+, -, *, /) e, em seguida, exibe o resultado.
		 */

		String[] operadores = { "+", "-", "*", "/" };
		String operador;
		int numero1, numero2;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite o primeiro número :");

		numero1 = sc.nextInt();

		System.out.println(" Digite o segundo número :");

		numero2 = sc.nextInt();

		for (int i = 0; i < operadores.length; i++) {
			System.out.println(" Operadores disponíveis : " + operadores[i]);

		}
		System.out.println(" Digite um operador para finalizar a conta:");

		operador = sc.next();

		switch (operador) {
		case "+":
			System.out.println("Resultado final = " + (numero1 + numero2));
			break;
		case "-":
			System.out.println("Resultado final = " + (numero1 - numero2));
			break;
		case "*":
			System.out.println("Resultado final = " + (numero1 * numero2));
			break;
		case "/":

			if (numero1 == 0 || numero2 == 0) {
				System.out.println("Não é possível efetuar divisões por 0 , reinicie novamente");
				break;
			}
			System.out.println("Resultado final = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Você não selecionou nenhuma operação válida, reinicie novamente");

		}

		sc.close();

	}

}
