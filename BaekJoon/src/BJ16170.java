import java.text.SimpleDateFormat;
import java.util.Date;


public class BJ16170 {
	public static void main(String[] args) {
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");
		Date d = new Date();
		System.out.println(year.format(d));
        System.out.println(month.format(d));
        System.out.println(day.format(d));
	}
}

