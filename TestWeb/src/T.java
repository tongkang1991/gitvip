import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class T {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		 String t1 = "20080310"; 
		    String t2 = "20100410"; 

		    Date d1 = null; 
		    Date d2 = null; 

		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 

		    try { 
		        d1 = sdf.parse(t1); 
		        d2 = sdf.parse(t2); 
		    } catch (Exception pe){ 
		        System.out.println(pe.getMessage()); 
		    } 
		    
		    long dd1 = d1.getTime(); 
		    long dd2 = d2.getTime(); 
		    double hours = (double)(dd2-dd1)/3600/1000/24/365; 
		    System.out.println("时间差是："+hours+"年"); 
		    
		    
		    System.out.println("---------------");
		    SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
			int num = 3600*1000*24*365;
			double  hours1 = (double)(sf.parse("20181001").getTime() - sf.parse("20170901").getTime()) / 3600/1000/24/365;
			int s=(int) hours1;
			System.out.println(s); 
	}

}
