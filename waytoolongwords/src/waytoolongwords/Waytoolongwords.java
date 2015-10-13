package waytoolongwords;

import java.util.Scanner;

public class Waytoolongwords {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int b = entrada.nextInt();		
		String vector[] = new String[b];
		for(int i=0; i<b; i++){
			
			String palabra = entrada.next();
			
			if(palabra.length()>10){
				
				int largo = palabra.length()-2;
				vector[i] = ((palabra.charAt(0))+""+largo+""+(palabra.charAt(palabra.length()-1)));
			}
			else{
				vector[i] = palabra;
			}
				}
		for(int i=0; i<b; i++){
			
			System.out.println(vector[i]);
			
		}
			}
}
