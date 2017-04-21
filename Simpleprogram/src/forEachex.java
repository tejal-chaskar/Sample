import java.util.Arrays;
import java.util.List;


public class forEachex {
	
		 public static void main(String args[]) 
		{
		 List<Integer> primeno = Arrays.asList(2, 3, 5, 7, 11, 3, 17); 

		// in this case we are using method reference becasue 
		// we are not doing anything with each element of collection 
		// and just passing ito println method 
		System.out.println("Printing elements of list using forEach method : "); 
		primeno.stream().forEach(System.out::println); 
		// let's do something to each element before printing 
		// we will add comma after each element 

		System.out.println("Printing elements after adding comma: "); 

		primeno.stream().forEach( i -> System.out.print( i + ",")); 

		// you can also use forEach with parallel stream 
		// order will not be guaranteed 

		System.out.println("\nPrinting elements of list using parallel stream: "); 

		primeno.parallelStream().forEach( i-> System.out.println(i*2)); 

		} 
}
