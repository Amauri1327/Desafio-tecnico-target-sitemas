package desafio;

public class Desafio {

	public static void main(String[] args) {
		
/*
	 1) Dado a sequência de Fibonacci, 
	 onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
	 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
	 escreva um programa na linguagem que desejar onde, 
	 informado um número, ele calcule a sequência de Fibonacci 
	 e retorne uma mensagem avisando se o número informado 
	 pertence ou não a sequência.
 */
	int numero = 34;
		
	if (pertenceFibonacci(numero)) {
		System.out.println(numero + " pertence a sequência!");
	}
	else {
		System.out.println(numero + " não pertence!");
	}
		
	
	//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
	//seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
	
	String string = "Amauri";
	System.out.println(aExist(string));
	
	
	/* 3) Observe o trecho de código abaixo: 
	int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE 
	faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
	Ao final do processamento, qual será o valor da variável SOMA?: 77
	
	*/
	int indice = 12;
	int k = 1;
	int soma = 0;
	
	while (k < indice) {
		k = k + 1;
		soma = soma + k;
	}
	System.out.println(soma);
	

/*	4) Descubra a lógica e complete o próximo elemento:
	a) 1, 3, 5, 7, _9_
	b) 2, 4, 8, 16, 32, 64, _128_
	c) 0, 1, 4, 9, 16, 25, 36, _49_
	d) 4, 16, 36, 64, _100_
	e) 1, 1, 2, 3, 5, 8, _13_
	f) 2,10, 12, 16, 17, 18, 19, _20_
*/		
	
/* 
 5) Você está em uma sala com três interruptores, 
 cada um conectado a uma lâmpada em salas diferentes. 
 Você não pode ver as lâmpadas da sala em que está, 
 mas pode ligar e desligar os interruptores quantas vezes quiser. 
 Seu objetivo é descobrir qual interruptor controla qual lâmpada. 
 Como você faria para descobrir, usando apenas duas idas até uma 
 das salas das lâmpadas, qual interruptor controla cada lâmpada?  
  
  Resposta: 
 	Primeiro: ligaria o interruptor A e deixaria ligado por 5 a 10 minutos para a lampada esquentar
 	- Segundo deixaria o interruptor B ligado e iria para a sala das lampadas
 	- A lampada que estivesse quente/morna seria a A e a que estivesse ligada seria a B 
 	  	e a que estivesse deligada seria a C.
 	 
  
  
*/
	
	
		
}
		
	public static int aExist(String string) {
		int count = 0;		
		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'A') {
				count++;
			}
		}
		
		
		return count;
	
		
	}
	

	public static boolean pertenceFibonacci(int num) {
		if (num < 0) {
			return false;
		}	
		int a = 0, b = 1;	
		if (num == a || num == b) {
			return true;
		}		
		while (b < num) {
			
			int proximo = a + b;
			a = b;
			b = proximo;
			
			if (b == num) {
				return true;
			}	
		}
		return false;	
	}
}
