package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		 System.out.print("Ingrese el radio del círculo: ");
	        double radio = input.nextDouble();

	        double area = Math.PI * Math.pow(radio, 2);

	        System.out.printf("El área del círculo es: "+area);

		input.close();

	}

}
