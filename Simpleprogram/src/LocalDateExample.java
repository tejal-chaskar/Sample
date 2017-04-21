
	import java.time.LocalDate;
	import java.time.Month;

	
	public class LocalDateExample {

		public static void main(String[] args) {
			
		
			LocalDate todays_date = LocalDate.now();
			System.out.println("Current Date= " + todays_date);
			
			
			LocalDate firstDay_2018 = LocalDate.of(2018, Month.JANUARY, 1);
			System.out.println("Specific Date= " + firstDay_2018);
			
			
		
		}

	}


