package firstPackage;

import javax.swing.JOptionPane;

public class LoopingStatements {

	public static void main(String[] args) {

		/*
		int number;

		for (number = 1; number <= 100; number++) {

			System.out.println(number);

			if (number == 50) {

				break;
			}
		}
		
		*/
		
//		int number2;
//		
//		number2 = 10;
//		
//		
//		while (number2 < 20){
//			
//			System.out.println("It is less");
//			break;
//		}
		
		
		String number3;
		
		
		number3 = JOptionPane.showInputDialog("Enter your value");
		
		int actualValue;
		
		actualValue = Integer.parseInt(number3);
		
		if(actualValue < 20){
			
			System.out.println("Less than 20");
		}
		
		else if (actualValue > 20){
			
			System.out.println("greater than 20");
		}
		
		else{
			
			System.out.println("Cannot be determined");
		}
		
		
		
		
		
		
		

	}

}
