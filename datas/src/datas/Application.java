package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date d1 = sdf1.parse("02/10/1991");
		Date d2 = sdf2.parse("02/10/1991 19:30:15");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		d2 = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		
		Date hoje = new Date();
		
		//System.out.println(sdf1.format(d1));
		System.out.println(sdf2.format(d2));
		
		//System.out.println(sdf2.format(hoje));
		
		System.out.println("Minutos: "+minutes);
		
		
	}

}
