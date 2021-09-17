package sem2hw;

import java.util.*;
//Aysin Bundres Phan 1002058460
import java.util.Arrays;
public class Part1 {
	public static void main(String[] args) {		
		int tries=0;
		do {
			System.out.println("Enter the numbers: ");
			Scanner sc = new Scanner(System.in);
			String data = sc.nextLine(); 
			data = data.replace(" ", "");
			String[] numberAndSign = data.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)|(?<=\\D)(?<=\\D)");
		try {
		// -a+-b, -a--b 
		if(numberAndSign[0].contains("-") && numberAndSign[3].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[4]);
			num1 = - num1;
			num2 = - num2;
			String sign = numberAndSign[2];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign); 
			if(sign.equals("+") || sign.equals("-")){ 
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,sign);
			}
			else if(sign.equals("*") || sign.equals("/") ){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,sign); 
			}
			else {
				throw new InputMismatchException();
			}
		}
		
		// -a+b, -a-b
		else if(numberAndSign[0].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			num1 = - num1;
			String sign = numberAndSign[2]; 
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign); 
			if(sign.equals("+") || sign.equals("-")){ 
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,sign);
			}
			else if(sign.equals("*") || sign.equals("/") ){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,sign); 
			}
			else {
				throw new InputMismatchException();
			}
		}
		
		// a+-b, a--b
		else if(numberAndSign[2].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			num2 = - num2;
			String sign = numberAndSign[1]; 
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign); 
			if(sign.equals("+") || sign.equals("-")){ 
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,sign);
			}
			else if(sign.equals("*") || sign.equals("/") ){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,sign); 
			}
			else {
				throw new InputMismatchException();
			}
		}
		
		// a+b, a-b
		else if(numberAndSign[1].contains("-") || numberAndSign[1].contains("+") || numberAndSign[1].contains("*") || numberAndSign[1].contains("/")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[2]);
			String sign = numberAndSign[1]; 
			System.out.print(numberAndSign[0] + numberAndSign[1] + numberAndSign[2]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign); 
			if(sign.equals("+") || sign.equals("-")){ 
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,sign);
			}
			else if(sign.equals("*") || sign.equals("/") ){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,sign ); 
			}
			else {
				throw new InputMismatchException();
			}
		}
		else {
			throw new InputMismatchException();
		}
		} catch (Exception E){
			System.out.println("it’s an invalid arithmetic operator");
			System.out.println("");
			tries += 1;
			if (tries > 2) {
				System.out.println("Program terminated");
				System.exit(0);
			}
		}
		} while (tries < 3);
	}
}
class addSubtract { 
	void AddSubtractMethod(int data1, int data2, String plusMinus){ 
		if(plusMinus.equals("+")) { 
			int sum = data1 + data2;
			System.out.print("The result of " + data1 + " + " + data2 + " = " + sum);
		}
		if(plusMinus.equals("-")) { 
			int sum = data1 - data2; 
			System.out.print("The result of " + data1 + " - " + data2 + " = " + sum); 
		}
	}
}
class multiplyDivide { 
	void multiplyDivideMethod(int data1, int data2, String plusMinus){ 
		if(plusMinus.equals("*")) { 
			double sum = data1 * data2;
			System.out.print("The result of " + data1 + " * " + data2 + " = " + sum); 
		}
		if(plusMinus.equals("/")) { 
			double data11 = data1;
			double data22 = data2;
			double sum = data11/data22;
			System.out.print("The result of " + data1 + "/" + data2 + " = " + sum);
		}
	}
}
