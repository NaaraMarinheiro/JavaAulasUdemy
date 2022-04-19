package exerciciosIntroducao;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosUdemy1 {

	public static void main(String[] args) {

		// QUEST�ES DE ESTRUTURAS SEQUENCIAIS
		// exemplo0();
		// questao1();
		// questao2();
		// questao3();
		// questao4();
		// questao5();
		// questao6();
		// QUEST�ES DE ESTRUTURAS CONDICIONAIS
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
	 * Exerc�cio 01 : Fa�a um programa para ler dois valores inteiros, e depois
	 * mostrar na tela a soma desses n�meros com uma mensagem explicativa, conforme
	 * exemplos. : Corre��o:
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
	 * Exerc�cio 02 : Fa�a um programa para ler o valor do raio de um c�rculo, e
	 * depois mostrar o valor da �rea deste c�rculo com quatro casas decimais
	 * conforme exemplos. F�rmula da �rea: area = PI . raio2 Considere o valor de PI
	 * = 3.14159 : Corre��o:
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
	 * Exerc�cio 03 : Fazer um programa para ler quatro valores inteiros A, B, C e
	 * D. A seguir, calcule e mostre a diferen�a do produto de A e B pelo produto de
	 * C e D segundo a f�rmula: DIFERENCA = (A * B - C * D). Corre��o:
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
		System.out.println("A diferen�a �: " + diferenca);

		sc.close();
	}

	/**
	 * Exerc�cio 04 : Fazer um programa que leia o n�mero de um funcion�rio, seu
	 * n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio
	 * desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com
	 * duas casas decimais. : Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
	 */
	public static void questao4() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero do funcion�rio: ");
		int numeroDoFuncionario = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		float numeroHorasTrabalhadas = sc.nextFloat();
		System.out.println("Digite o valor que recebe por hora: ");
		float valorPorHora = sc.nextFloat();
		float salario = numeroHorasTrabalhadas * valorPorHora;
		System.out.println("NUMBER: " + numeroDoFuncionario);
		System.out.printf("SALARY: %.2f %n", salario);

		sc.close();
	}

	/**
	 * Exerc�cio 05 : Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de
	 * pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de
	 * pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser
	 * pago. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
	 */
	public static void questao5() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o c�digo da pe�a 1:");
		float codigoPeca1 = sc.nextFloat();
		System.out.println("Digite a quantidade da pe�a 1:");
		float quantidadePeca1 = sc.nextFloat();
		System.out.println("Digite o valor da pe�a 1:");
		float valorPeca1 = sc.nextFloat();

		System.out.println("Digite o c�digo da pe�a 2:");
		float codigoPeca2 = sc.nextFloat();
		System.out.println("Digite a quantidade da pe�a 2:");
		float quantidadePeca2 = sc.nextFloat();
		System.out.println("Digite o valor da pe�a 2:");
		float valorPeca2 = sc.nextFloat();

		float ValorTotal = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);
		System.out.println("Valor a Pagar: R$" + ValorTotal);
		System.out.println("C�digo Pe�as:" + codigoPeca1 + "  " + codigoPeca2);

		sc.close();
	}

	/**
	 * Exerc�cio 06 Fazer um programa que leia tr�s valores com ponto flutuante de
	 * dupla precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do
	 * tri�ngulo ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo
	 * de raio C. (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C
	 * por altura. d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que
	 * tem lados A e B. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
	 */
	public static void questao6() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite tr�s valores com ponto flutuante de dupla precis�o:");
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
	 * 01. Fazer um programa para ler um n�mero inteiro, e depois dizer se este
	 * n�mero � negativo ou n�o. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
	 */
	public static void questao7() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 02. Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par
	 * ou �mpar. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
	 */
	public static void questao8() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 03. Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma
	 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
	 * lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados
	 * em ordem crescente ou decrescente. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
	 */
	public static void questao9() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 04. Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o
	 * do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro,
	 * tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
	 */
	public static void questao10() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 05. Com base na tabela abaixo, escreva um programa que leia o c�digo de um
	 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a
	 * pagar.
	 */
	public static void questao11() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 06. Voc� deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em nenhum
	 * destes intervalos, dever� ser impressa a mensagemfora do intervalo "
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
	 * qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem origem. Se o
	 * ponto estiver sobre um dos eixos escreva eixo X ou eixo y, conforme for a
	 * situa��o. Corre��o:
	 * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
	 */
	public static void questao13() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();
	}

	/**
	 * 08. Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam
	 * felizes em pagar seus impostos, pois sabem que nele n�o existem pol�ticos
	 * corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o,
	 * sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$. Leia
	 * um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de
	 * Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
	 * Imposto de Renda, segundo a tabela abaixo.
	 * 
	 * Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas
	 * sobre R$ 1000.00, pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00
	 * � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � de 8%
	 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
	 * valor deve ser impresso com duas casas decimais.
	 */
	public static void questao14() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		sc.close();

	}

}
