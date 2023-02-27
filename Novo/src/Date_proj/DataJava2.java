package Date_proj;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataJava2 {
	
	public static void main(String[] args) {
		
	
	
	long dias = ChronoUnit.WEEKS.between(LocalDate.parse("2022-02-20"), LocalDate.now()); 

    System.out.println("Possui " + dias + " dias entre a data atual");
	
  
    
    
	}
}
