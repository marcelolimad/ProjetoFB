package Date_proj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataJava5 {

	public static void main(String[] args) {
	
		LocalDate dataAtual = LocalDate.now();
		System.out.println(" Data Atual "+ dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
		System.out.println(" Dia da semana " + dataAtual.getDayOfWeek());
		
		System.out.println(" Dia da semana " + dataAtual.getDayOfWeek().ordinal());
		System.out.println(" Dia do mês " + dataAtual.getDayOfMonth());
		
		System.out.println(" Dia do mês " + dataAtual.getMonth());
		
		System.out.println(" Dia do mês " + dataAtual.getYear());
	}

}
