package Application;

public class Kbin {

	public static void main(String[] args) throws java.io.IOException{
		int i;
		int sum = 0;
		char ch;
		System.out.print("Escolha uma letra seguida de Enter: ");
		
		ch = (char) System.in.read(); 
		System.out.println("A sua letra foi: " + ch);
		
		for(i=0; i<10; ) {
			System.out.println("Pass# " + i);
			i++;		
			
		}
		
		for(i = 1; i <=7; sum += i++);  // Laço for sem corpo não existe os { }  as chaves 
		System.out.println("A soma eh:  " + sum);
	}
}
