/* Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna 
a cda una un valor. A continuación, muestra por pantalla:
	- El valor de cada variable;
	- La suma X+Y;
	- La diferencia X-Y;
	- El producto X*Y;
	- El cociente X/Y;
	- El resto X%Y;
	- La suma N+M;
	- La diferencia N-M;
	- El producto N*M;
	- El cociente N/M;
	- El resto N%M;
	- La suma X*N;
	- El cociente Y/M;
	- El resto Y%M;
	- El doble de cada variable;
	- La suma de cada variable;
	- El producto de todas las variables;
	*/

public class Ej3 {
	public static void main(String args[]) {
		int x=1;
		int y=2;
		double n=1.5;
		double m=2.5;
		
		System.out.println("Las variables creadas son: x = "+x+ ", "+ "y = "+y+", "+"n = "+n+" y "+"m = "+m+".");
		System.out.println("x + y = "+(x+y));
		System.out.println("x - y = "+(x-y));
		System.out.println("x * y = "+(x*y));
		System.out.println("x / y = "+(x/y));
		System.out.println("x % y = "+(x%y));
		System.out.println("n + m = "+(n+m));
		System.out.println("n - m = "+(n-m));
		System.out.println("n * m = "+(n*m));
		System.out.println("n / m = "+(n/m));
		System.out.println("n % m = "+(n%m));
		System.out.println("x + n = "+(x+n));
		System.out.println("y / m = "+(y/m));
		System.out.println("y % m = "+(y%m));
		System.out.println("El doble de las variables x, y, n y m es "+(x*2)+", "+ (y*2)+", "+ (n*2)+ " y "+(m*2)+" respectivamente.");
		System.out.println("La suma de todas las variables es "+(x+y+n+m));
		System.out.println("El producto de todas las variables es "+(x*y*n*m));

	}

}
