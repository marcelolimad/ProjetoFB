package Date_proj;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataJava7 {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(2022, 5, 15);
		
		LocalDate dataAntiga2 = LocalDate.parse("2020-08-30");
		
		LocalDate dataNova = LocalDate.of(2023, 10, 30);
		
		LocalDate dataNova2 = LocalDate.parse("2023-05-20");
		
        //System.out.println("Mais 10 dias " + (dataNova2 = dataNova2.plusDays(10)));
		
		//System.out.println("Mais 1 semanas " + (dataNova2 = dataNova2.plusWeeks(1)));
		
		//System.out.println("Mais 2 meses " + (dataNova2 = dataNova2.plusMonths(2)));
		
		//System.out.println("Menos 15 dias " + (dataNova2 = dataNova2.minusDays(15)));

		
		System.out.println("---------------------------------------------------------");
		
		System.out.println(" Data antiga e maior: " + dataAntiga.isAfter(dataNova));
		
		System.out.println(" Data antiga e menor: " + dataAntiga.isBefore(dataNova));
		
		System.out.println(" Data antiga e menor: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga2, dataNova2);
		
		
	   System.out.println(" Quantos dias "+ periodo.getDays());
	   
	   System.out.println("total meses "+ periodo.toTotalMonths());
				
	   System.out.println("Quantos meses "+ periodo.getMonths());
	   
		
	   System.out.println("Quantos anos " + periodo.getYears());
	   
	   System.out.println(periodo.getYears()+" Anos "+periodo.getMonths()+" meses " + periodo.getDays()+" dias");
	   

	   for(int i = 1; i <= 12; i++) {
		   dataNova2 = dataNova2.plusMonths(1);
		   System.out.println(" Data do vencimento " +dataNova2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		   
	   }
      	   
	   
	}

}
