



	import java.time.LocalTime;

	
	public class LocalTimeDemo {

		public static void main(String[] args) {
			
		
			LocalTime time = LocalTime.now();
			System.out.println("Current Time=  " + time);
			
			
			LocalTime specificTime = LocalTime.of(12,20,25,40);
			System.out.println("Specific Time of Day= " +specificTime);
			
			

		}

	}


