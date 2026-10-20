package lezione01_Intro;

public class Operatori {
	
	public static void main(String[] args) {
		
		//Operatori di assegnazione =
		int num1 = 8;
		
		int num2 = 7;
		
		//operatori di confronto o relazionali --- producono sempre un boolean 
		// == ugale a (utile a confrontare variabili e non oggeti)
		//> o >=
		//< o <=
		
		//!= diverso da ---> ! not logico
		
		boolean conf1 = num1 == num2; //false 
		System.out.println(conf1);
		
		boolean conf2 = num1 != num2; //true
		System.out.println(conf2);
		
		boolean conf3 = num1 >= num2; //true
		System.out.println(conf3);
		
		//operatori di post incremento  e decremento (++) (--) di 1 
		int a = 3;
		
		a++; //a = a + 1
		
		System.out.println("Il numero a vale" + a);
		
		a--;
		System.out.println("Il numero a vale " + a);
		
		//operatori di pre ( prima cambia valore poi leggeincremento e documento
		
		int b = 5;
		
		--b;
		
		System.out.println("Il numero a vale" + a);
		
		System.out.println("Il numero a vale" + ++b);
		System.out.println(b);
		
		
		//operatori assegnazione matematica += -= *= /=
		
		int c = 10;
		
		//voglio modificare il valore della variable aggiungendo 5
		
		c = c +5; // c = c + 5
		
		c -= 6;
		
		c *= 3;
		
		c /= 3;
		
		System.out.println(c);
		
		//voglio la potenza di un numero
		
	int d = 4;
	
	double dd = Math.powExact(d, 2);
	
	System.out.println();// check in teachers notes 
	System.out.println(Math.pow(d,2));
	System.out.println(Math.abs(d));
	System.out.println(Math.random());
	
		
		
		
		
		
		
	}

}
