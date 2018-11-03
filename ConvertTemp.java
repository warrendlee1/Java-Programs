import java.util.Scanner;
public class ConvertTemp {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		
		System.out.print("enter degrees Fahrenheit: ");
		fahrenheit = reader.nextDouble();
		
		celsius = ((fahrenheit - 32.0) * 5.0 / 9.0);
		
		System.out.print("the temperature in Celsius is: ");
		System.out.println(celsius);
	}
}
