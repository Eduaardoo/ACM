
public class Bin {
	
	int num1; 
	int num2;
	int buscar;
	int numero=0;
	int resto;
	
	
public int Suma(int num1, int num2){
	this.numero=num1;
	do{
	if(numero%2==1){
		resto++;
	}
	numero=numero/2;
	}
	while(numero>0);	
	return resto;
}


  public static void main(String[] args){
			
                  Bin solución = new Bin();
                  Bin registro = new Bin();      
    
                  int cifra1=15;          
     
                  int cifra2=18;
     
     int[] vector = new int[cifra2];
     
     
     vector[cifra1] = solución.Suma(cifra1,cifra2);   
     
   
                      System.out.println(solución.Suma(cifra1,cifra2));   
  }
		

}
