package exerciciosIntroducao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosUdemy1 {

	public static void main(String[] args) {

		// QUESTÕES DE ESTRUTURAS SEQUENCIAIS
		// exemplo0();
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// QUESTÕES DE ESTRUTURAS CONDICIONAIS
		// questao7();
		// questao8();
		// questao9();
		// questao10();
		// questao11();
		// questao12();
		// questao13();
		// questao14();
		// ESTRUTURA WHILE
		// questao15();
		// questao16();
		// questao17();

	}

	public static void exemplo0() {

		// Exercicio de exemplo - https://www.youtube.com/watch?v=Ah1Y6d6deq0
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);

		sc.close();

	}

	/**
	 * Exercício 01 : Faça um programa para ler dois valores inteiros, e depois
	 * mostrar na tela a soma desses números com uma mensagem explicativa, conforme
	 * exemplos. : Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
	 */
	public static void questao1() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int somavalores = valor1 + valor2;
		System.out.println("SOMA = " + somavalores);

		sc.close();
	}

	/**
	 * Exercício 02 : Faça um programa para ler o valor do raio de um círculo, e
	 * depois mostrar o valor da área deste círculo com quatro casas decimais
	 * conforme exemplos. Fórmula da área: area = PI . raio2 Considere o valor de PI
	 * = 3.14159 : Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
	 */
	public static void questao2() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raioDoCirculo = sc.nextDouble();
		double areaDoCirculo = 3.14159 * (Math.pow(raioDoCirculo, 2.0));
		System.out.printf("RESPOSTA = %.4f%n", areaDoCirculo);

		sc.close();
	}

	/**
	 * Exercício 03 : Fazer um programa para ler quatro valores inteiros A, B, C e
	 * D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de
	 * C e D segundo a fórmula: DIFERENCA = (A * B - C * D). Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
	 * 
	 * @return Este metodo n retorna nada.
	 */
	public static void questao3() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 4 valores inteiros:");
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();
		int diferenca = (valorA * valorB - valorC * valorD);
		System.out.println("A diferença é: " + diferenca);

		sc.close();
	}

	/**
	 * Exercício 04 : Fazer um programa que leia o número de um funcionário, seu
	 * número de horas trabalhadas, o valor que recebe por hora e calcula o salário
	 * desse funcionário. A seguir, mostre o número e o salário do funcionário, com
	 * duas casas decimais. : Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
	 */
	public static void questao4() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número do funcionário: ");
		int numeroDoFuncionario = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas: ");
		float numeroHorasTrabalhadas = sc.nextFloat();
		System.out.println("Digite o valor que recebe por hora: ");
		float valorPorHora = sc.nextFloat();
		float salario = numeroHorasTrabalhadas * valorPorHora;
		System.out.println("NUMBER: " + numeroDoFuncionario);
		System.out.printf("SALARY: %.2f %n", salario);

		sc.close();
	}

	/**
	 * Exercício 05 : Fazer um programa para ler o código de uma peça 1, o número de
	 * peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de
	 * peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser
	 * pago. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
	 */
	public static void questao5() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da peça 1:");
		float codigoPeca1 = sc.nextFloat();
		System.out.println("Digite a quantidade da peça 1:");
		float quantidadePeca1 = sc.nextFloat();
		System.out.println("Digite o valor da peça 1:");
		float valorPeca1 = sc.nextFloat();

		System.out.println("Digite o código da peça 2:");
		float codigoPeca2 = sc.nextFloat();
		System.out.println("Digite a quantidade da peça 2:");
		float quantidadePeca2 = sc.nextFloat();
		System.out.println("Digite o valor da peça 2:");
		float valorPeca2 = sc.nextFloat();

		float ValorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		System.out.println("Valor a Pagar: R$" + ValorTotal);
		System.out.println("Código Peças:" + codigoPeca1 + "  " + codigoPeca2);

		sc.close();
	}

	/**
	 * Exercício 06 Fazer um programa que leia três valores com ponto flutuante de
	 * dupla precisão: A, B e C. Em seguida, calcule e mostre: a) a área do
	 * triângulo retângulo que tem A por base e C por altura. b) a área do círculo
	 * de raio C. (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C
	 * por altura. d) a área do quadrado que tem lado B. e) a área do retângulo que
	 * tem lados A e B. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
	 */
	public static void questao6() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores com ponto flutuante de dupla precisão:");
		float valorA = sc.nextFloat();
		float valorB = sc.nextFloat();
		float valorC = sc.nextFloat();
		float areaDoTriang = (valorA * valorC) / 2;
		System.out.printf("TRIANGULO: %.3f %n", areaDoTriang);
		double areaCircular = 3.14159 * (Math.pow(valorC, 2.0));
		System.out.printf("CIRCULO: %.3f %n", areaCircular);
		float areaTrapezio = ((valorA + valorB) / 2) * valorC;
		System.out.printf("TRAPEZIO: %.3f %n", areaTrapezio);
		float areaQuadrado = valorB * valorB;
		System.out.printf("QUADRADO: %.3f %n", areaQuadrado);
		float areaRetangulo = valorA * valorB;
		System.out.printf("RETANGULO: %.3f %n", areaRetangulo);

		sc.close();
	}

	/**
	 * 01. Fazer um programa para ler um número inteiro, e depois dizer se este
	 * número é negativo ou não. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
	 */
	public static void questao7() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 02. Fazer um programa para ler um número inteiro e dizer se este número é par
	 * ou ímpar. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
	 */
	public static void questao8() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 03. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
	 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
	 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
	 * em ordem crescente ou decrescente. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
	 */
	public static void questao9() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 04. Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
	 * do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
	 * tendo uma duração mínima de 1 hora e máxima de 24 horas. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
	 */
	public static void questao10() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 05. Com base na tabela abaixo, escreva um programa que leia o código de um
	 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a
	 * pagar.
	 */
	public static void questao11() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 06. Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagemfora do intervalo "
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java"
	 */
	public static void questao12() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 07. Leia 2 valores com uma casa decimal (x e y), que devem representar as
	 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
	 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem origem. Se o
	 * ponto estiver sobre um dos eixos escreva eixo X ou eixo y, conforme for a
	 * situação. Correção:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
	 */
	public static void questao13() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 08. Em um país imaginário denominado Lisarb, todos os habitantes ficam
	 * felizes em pagar seus impostos, pois sabem que nele não existem políticos
	 * corruptos e os recursos arrecadados são utilizados em benefício da população,
	 * sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia
	 * um valor com duas casas decimais, equivalente ao salário de uma pessoa de
	 * Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
	 * Imposto de Renda, segundo a tabela abaixo.
	 * 
	 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
	 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
	 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
	 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
	 * valor deve ser impresso com duas casas decimais.
	 */
	public static void questao14() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();

	}

}
