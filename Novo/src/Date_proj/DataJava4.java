package Date_proj;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataJava4 {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(" Data Atual "+ dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalTime horaAtual = LocalTime.now();
		System.out.println(" Hora Atual "+ horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(" Data e Hora "+dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
	}

}
