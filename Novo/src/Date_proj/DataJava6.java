package Date_proj;

import java.time.Duration;
import java.time.Instant;

public class DataJava6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
		
		System.out.println("Inicio "+ inicio.);
		
		Thread.sleep(4000);
	     
		Instant fim = Instant.now();
		
		System.out.println("Fim    "+ fim);
		
		Duration duracao = Duration.between(inicio, fim);
		
		System.out.println("Duração entre nanosegundos " + duracao.toNanos());
		
		System.out.println("Duração entre horas " + duracao.toHours());
		
		System.out.println("Duração entre segundos " + duracao.toMinutes());
		
		System.out.println("Duração entre dias " + duracao.toDays());

	}

}
