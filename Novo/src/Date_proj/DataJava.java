package Date_proj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataJava {

	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("01-03-2023"));
		
		calendar.add(Calendar.DAY_OF_WEEK, 10);
		
		System.out.println("Somando o dia " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 5);
		
		System.out.println("add o mês "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
        calendar.add(Calendar.YEAR, 1);
		
		System.out.println("add o ano "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		
		
		Date data =  new Date();
		
		/*System.out.println("Dia do m�s "+ data.getDate());
		
		System.out.println("Dia do m�s C "+ calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana "+ data.getDay());
		
		System.out.println("Dia da semana C "+ (calendar.get(Calendar.DAY_OF_WEEK) -1));
		
		System.out.println("Hora do dia "+ data.getHours());
		
		System.out.println("Hora do dia C "+ calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos "+ data.getMinutes());
		
		System.out.println("Minutos C "+ calendar.get(Calendar.MINUTE));
		
		System.out.println("mes "+ data.getMonth());
		
		System.out.println("mes C "+ calendar.get(Calendar.MONTH));
		
		System.out.println("ano "+ (data.getYear() + 1900));
		
		System.out.println("ano C "+ calendar.get(Calendar.YEAR));
		
		
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(formatData.format(data));
		
		System.out.println("Calendar "+ formatData.format(calendar.getTime()));
		
		
        formatData = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println(formatData.format(data));
		
		System.out.println(formatData.parse("2023-02-18 15:52.15"));*/
		
	//=========================================================
		/*System.out.println("---------------------------------------");
		
		SimpleDateFormat formatData2 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date DataVencBoleto = formatData2.parse("12/02/2023"); 
		
		Date DataHoje = formatData2.parse("14/02/2023");
		
		//Date DataH = formatData2.parse(DataHoje);
		
		System.out.println(DataHoje);
		
		int  DataH2 = 10/02/2023;
		
		int  DataH3 = 11/02/2023;
		
		if(DataVencBoleto.before(DataHoje)) {
			
			System.out.println(" Boleto Venceu");
		}else {
			System.out.println("Boleto não venceu");
		}*/
			
				
				
				
				
		
		

	}

}
