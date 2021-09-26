package studyDate;

import java.util.Calendar;

public class CalMain {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.add(Calendar.MONTH, 5));
		System.out.println(cal.get(Calendar.DATE));
	}
}
