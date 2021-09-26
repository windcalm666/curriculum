import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SampleDate {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		Date date = new Date();
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
	}
}
