package proj_executaveis;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int notas [][] = new int[2][3] ;
		
         notas[0][0] =10;
         notas[0][1] =12;
         notas[0][2]= 15;
	
         notas[1][0]= 9;
         notas[1][1]= 5;
         notas[1][2]= 7;
         
       
         
     for(int l = 0; l < notas.length; l++) {
    	 
    	for(int c = 0; c < notas[l].length; c++) {
    		
    		
    			
    		System.out.println("valor "+notas[l][c]); 
    		
    	}
     }    
         
	
	}
  


}

