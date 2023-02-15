package proj_executaveis;

import java.util.stream.DoubleStream;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] notas = new double[5];
		
		notas[0] = 2.9;
		notas[1] = 7.0;
		notas[2] = 4.5;
		notas[3] = 1.0;
		notas[4] = 3.5;
		
	   for(double n: notas) {
		   System.out.println(n);
	   }
		
		for (int i = 0; i < 5; i++) {
			
			if(notas[i] < 3.0) {
				double sum1 = DoubleStream.of(i).sum();
				System.out.println(" parte 1: "+notas[i] );
				System.out.println(" soma parte 1: "+ sum1 );


			
			}if(notas[i] > 3.0) {
				double sum2 = DoubleStream.of(i).sum();
				System.out.println(" parte 2: " +notas[i]);
				System.out.println(" soma parte 2: "+ sum2 );

			}else
				
			
		
		System.out.println(" valeu: " );
		
		}
	

	}

}
