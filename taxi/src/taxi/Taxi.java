package taxi;

import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int taxis = 0;
	    int grupo1 = 0;
	    int grupo2 = 0;
	    int grupo3 = 0;
		
		int cantgrupos = entrada.nextInt();
		
		for(int i=0; i<cantgrupos; i++){
			int c = entrada.nextInt();
			if(c == 1)grupo1++;
			if(c == 2)grupo2++;
			if(c == 3){
				grupo3++;
				taxis++;
			}
			if(c == 4)taxis++;	
		}
		grupo1 -= grupo3;
		
		if(grupo2>1)taxis += grupo2/2;
		if(grupo2%2 != 0){
			taxis++;
			grupo1 -= 2;
		}
		if(grupo1 > 0){
			taxis += grupo1/4;
		if(grupo1%4 != 0){
			taxis++;
		}
		}
		System.out.println(taxis);
	}
}


