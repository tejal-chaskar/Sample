
public class lambdaex {


		public static void main(String args[]){

		lambdaex tester = new lambdaex();
		//with type declaration

		MathOp add = (int a, int b) -> a + b;
		//with out type declaration

		MathOp sub = (int a, int b) -> a - b;
		//with return statem ent along with curly braces

		MathOp mul = (int a, int b) -> { return a * b; };
		//without return statem ent and without curly braces

		MathOp div = (int a, int b) -> a / b;

		System .out.println("10 + 5 = " + tester.operate(10, 5, add));
		System .out.println("10 - 5 = " + tester.operate(10, 5, sub));
		System .out.println("10 x 5 = " + tester.operate(10, 5, mul));
		System .out.println("10 / 5 = " + tester.operate(10, 5, div));
		//with parenthesis

		GreetingService greetService1 = message ->
		System .out.println("Hello " + message);
		//without parenthesis

		GreetingService greetService2 = (message) ->
		System .out.println("Hello " + message);
		greetService1.sayMessage("Tejal");
		greetService2.sayMessage("Good Morning");
		}
		interface MathOp {
		int operation(int a, int b);
		}
		interface GreetingService {
		void sayMessage(String message);
		}
		private int operate(int a, int b, MathOp mathOp){
		return mathOp.operation(a, b);
		}
		}


