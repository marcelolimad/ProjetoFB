package Date_proj;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.text.SimpleAttributeSet;

public class DataJava3 {

	public static void main(String[] args) throws ParseException {
		
	Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("26/02/2023");	
		
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dataInicial);
    
    for(int p = 1; p <= 25; p++ ) {
    	
    	calendar.add(Calendar.DAY_OF_MONTH, 0);
    	calendar.add(Calendar.MONTH, 1);
    	
    	System.out.println("Parcelo numero "+ p + " vencimento em " +new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
    	
    	
    }
    
	
	
	}

}
