import java.util.Scanner;

public class Theatre {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		long a = entrada.nextLong();
		long b = entrada.nextLong();
		long c = entrada.nextLong();
		

		long x = a/c;
		long y = b/c;
		
		if(a%c>0){
			x++;
		}
		
		if(b%c>0){
			y++;
		}
		long res = y*x;
		
		System.out.println(res);
		

	}

}
