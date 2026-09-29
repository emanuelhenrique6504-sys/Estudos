/*
*/
import java.util.Scanner;
public class ExerciciosAulas{
	static public void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		int maiorNumero = 0;
		int intermediarioNumero = 0;
		int menorNumero = 0;

		boolean primeiroMaior = false;
		boolean primeiroMaio = false;
		boolean segundoMaior = false;
		boolean segundoMaio = false;
		boolean terceiroMaior = false;
		boolean terceiroMaio = false;
		boolean intermediarioUm = false;
		boolean intermediarioDois = false;
		boolean intermediarioTres = false;
		
		System.out.println("Me informe uma sequencia de 3 numeros inteiros");
		int primeiroNumero = entrada.nextInt();
		int segundoNumero = entrada.nextInt();
		int terceiroNumero = entrada.nextInt();

		entrada.close();
		
		if( primeiroNumero > segundoNumero ){
			primeiroMaior = true;
		} 

		if( primeiroNumero > terceiroNumero ){
			primeiroMaio = true;
		}

		if( segundoNumero > primeiroNumero ){
			segundoMaior = true;
		} 

		if( segundoNumero > terceiroNumero ){
			segundoMaio = true;
		}

		if( terceiroNumero > primeiroNumero ){
			terceiroMaior = true;
		} 

		if( terceiroNumero > segundoNumero ){
			terceiroMaio = true;
		}

		if( primeiroMaior && primeiroMaio ){
			 maiorNumero = primeiroNumero; 

		} else 
		
		if( segundoMaior && segundoMaio ){
			 maiorNumero = segundoNumero;

		} else

		if( terceiroMaior && terceiroMaio ){
			 maiorNumero = terceiroNumero;		
		} 

		if( !primeiroMaior && !primeiroMaio ){
			 menorNumero = primeiroNumero; 

		} else 
		
		if( !segundoMaior && !segundoMaio ){
			 menorNumero = segundoNumero;

		} else

		if( !terceiroMaior && !terceiroMaio ){
			 menorNumero = terceiroNumero;
		} 

		if( maiorNumero == primeiroNumero ){
			intermediarioUm = true;
		}

		if( maiorNumero == segundoNumero ){
			intermediarioDois = true;
		}

		if( maiorNumero == terceiroNumero ){
			intermediarioTres = true;
		}
		
		if( intermediarioUm && !intermediarioDois || !intermediarioUm && intermediarioDois ){
			 intermediarioNumero = terceiroNumero;

		} else 

		if( intermediarioDois && !intermediarioTres || !intermediarioDois && intermediarioTres ){
			 intermediarioNumero = primeiroNumero;

		} else 

		if( intermediarioUm && !intermediarioTres || !intermediarioUm && intermediarioTres ){
			 intermediarioNumero = segundoNumero;
		} 	
		
		System.out.println("a sequencia crescente:" + menorNumero + " " + intermediarioNumero + " " + maiorNumero); 
		System.out.println("a sequencia digitada:" + primeiroNumero + " " + segundoNumero + " " + terceiroNumero); 
	}		
}