package problema;

import java.util.Scanner;

public class Watermelon {
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in);
	
	int peso = entrada.nextInt();

	if(peso%2 != 0){
		System.out.println("no");
	}
	else if(peso == 2){
		System.out.println("no");
	}
	else{
		System.out.println("si");
	}

}

}
