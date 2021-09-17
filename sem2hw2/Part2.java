package sem2hw2;

import java.util.*;
//Aysin Bundres Phan 1002058460
public class Part2 {
	public static void main(String[] args) {		
		int tries=0;
		do {
			System.out.println("Enter the numbers: ");
			Scanner sc = new Scanner(System.in);
			String data = sc.nextLine(); 
			data = data.replace(" ", "");
			String[] numberAndSign = data.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)|(?<=\\D)(?<=\\D)");
		try {
		// (1) -a+-b+-c
		if(numberAndSign[0].contains("-") && numberAndSign[3].contains("-") && numberAndSign[6].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[4]);
			int num3 = Integer.parseInt(numberAndSign[7]);
			num1 = - num1;
			num2 = - num2;
			num3 = - num3;
			String sign = numberAndSign[2];
			String sign2 = numberAndSign[5];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5] + numberAndSign[6] + numberAndSign[7]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (2) -a+-b+c
		else if(numberAndSign[0].contains("-") && numberAndSign[3].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[4]);
			int num3 = Integer.parseInt(numberAndSign[6]);
			num1 = - num1;
			num2 = - num2;
			String sign = numberAndSign[2]; 
			String sign2 = numberAndSign[5];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5] + numberAndSign[6]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (3) -a+b+-c
		else if(numberAndSign[0].contains("-") && numberAndSign[5].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			int num3 = Integer.parseInt(numberAndSign[6]);
			num1 = - num1;
			num3 = - num3;
			String sign = numberAndSign[2]; 
			String sign2 = numberAndSign[4];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5] + numberAndSign[6]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (4) a+-b+-c
		else if(numberAndSign[2].contains("-") && numberAndSign[5].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			int num3 = Integer.parseInt(numberAndSign[6]);
			num2 = - num2;
			num3 = - num3;
			String sign = numberAndSign[1]; 
			String sign2 = numberAndSign[4];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5] + numberAndSign[6]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (5) -a+b+c
		else if(numberAndSign[0].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[1]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			int num3 = Integer.parseInt(numberAndSign[5]);
			num1 = - num1;
			String sign = numberAndSign[2]; 
			String sign2 = numberAndSign[4];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (6) a+-b+c
		else if(numberAndSign[2].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[3]);
			int num3 = Integer.parseInt(numberAndSign[5]);
			num2 = - num2;
			String sign = numberAndSign[1]; 
			String sign2 = numberAndSign[4];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (7) a+b+-c
		else if(numberAndSign[4].contains("-")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[2]);
			int num3 = Integer.parseInt(numberAndSign[5]);
			num3 = - num3;
			String sign = numberAndSign[1]; 
			String sign2 = numberAndSign[3];
			System.out.println(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4] + numberAndSign[5]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
			}
		}
		
		// (8) a+b+c
		else if(numberAndSign[1].contains("-") || numberAndSign[1].contains("+") || numberAndSign[1].contains("*") || numberAndSign[1].contains("/") || numberAndSign[3].contains("-") || numberAndSign[3].contains("+") || numberAndSign[3].contains("*") || numberAndSign[3].contains("/")) {
			
			int num1 = Integer.parseInt(numberAndSign[0]); 
			int num2 = Integer.parseInt(numberAndSign[2]);
			int num3 = Integer.parseInt(numberAndSign[4]);
			String sign = numberAndSign[1]; 
			String sign2 = numberAndSign[3];
			System.out.print(numberAndSign[0] + numberAndSign[1] + numberAndSign[2] + numberAndSign[3] + numberAndSign[4]);
			System.out.println(Arrays.toString(numberAndSign));
			System.out.println(sign+ " " +sign2); 
			if(!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")){
				throw new InputMismatchException();
			}
			else if(!sign2.equals("+") && !sign2.equals("-") && !sign2.equals("*") && !sign2.equals("/")) {
				throw new InputMismatchException();
			}
			else if(sign.equals("*") || sign.equals("/") || sign2.equals("*") || sign2.equals("/")){ 
				tries = 3;
				multiplyDivide objmultiplyDivide = new multiplyDivide(); 
				objmultiplyDivide.multiplyDivideMethod(num1,num2,num3,sign,sign2);
			}
			else if(sign.equals("+") || sign.equals("-") || sign2.equals("+") || sign2.equals("-")){
				tries = 3;
				addSubtract objAddSubtract = new addSubtract(); 
				objAddSubtract.AddSubtractMethod(num1,num2,num3,sign,sign2);
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
				System.out.println("System terminated");
				System.exit(0);
			}
		}
		} while (tries < 3);
	}
}
class addSubtract { 
	void AddSubtractMethod(int data1, int data2, int data3, String plusMinus, String plusMinus2){ 
		if(plusMinus.equals("+")) { 
			int sum = data1 + data2;
			if(plusMinus2.equals("+")) {
				int sum2 = sum + data3;
				System.out.print("The result of " + data1 + " + " + data2 + " + " + data3 + " = " + sum2);
			}
			else if(plusMinus2.equals("-")) {
				int sum2 = sum - data3;
				System.out.print("The result of " + data1 + " + " + data2 + " - " + data3 + " = " + sum2);
			}
		}
		else if(plusMinus.equals("-")) { 
			int sum = data1 - data2;
			if(plusMinus2.equals("+")) {
				int sum2 = sum + data3;
				System.out.print("The result of " + data1 + " - " + data2 + " + " + data3 + " = " + sum2);
			}
			else if(plusMinus2.equals("-")) {
				int sum2 = sum - data3;
				System.out.print("The result of " + data1 + " - " + data2 + " - " + data3 + " = " + sum2);
			}
		}
	}
}
class multiplyDivide { 
	void multiplyDivideMethod(int data1, int data2, int data3, String plusMinus, String plusMinus2){ 
		// a*b+c, a*b-c, a*b*c. a*b/c
		if(plusMinus.equals("*")) {
			double sum = data1*data2;
					if(plusMinus2.equals("-")) {
						double sum2 = sum-data3;
						System.out.print("The result of " + data1 + " * " + data2 + " - " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("+")) {
						double sum2 = sum+data3;
						System.out.print("The result of " + data1 + " * " + data2 + " + " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("*")) {
						double sum2 = sum*data3;
						System.out.print("The result of " + data1 + " * " + data2 + " * " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("/")) {
						double sumA = sum;
						double data3A = data3;
						double sum2 = sumA/data3A;
						System.out.print("The result of " + data1 + " * " + data2 + " / " + data3 + " = " + sum2);
					}
		}
		// a/b+c, a/b-c, a/b*c, a/b/c
		else if(plusMinus.equals("/")) {
			double data1A = data1;
			double data2A = data2;
			double sum = data1A/data2A;
					if(plusMinus2.equals("-")) {
						double sum2 = sum-data3;
						System.out.print("The result of " + data1 + " / " + data2 + " - " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("+")) {
						double sum2 = sum+data3;
						System.out.print("The result of " + data1 + " / " + data2 + " + " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("*")) {
						double sum2 = sum*data3;
						System.out.print("The result of " + data1 + " / " + data2 + " * " + data3 + " = " + sum2);
					}
					else if(plusMinus2.equals("/")) {
						double sum2 = sum/data3;
						System.out.print("The result of " + data1 + " / " + data2 + " / " + data3 + " = " + sum2);
					}
		}
		// a+b*c, a-b*c
		else if(plusMinus2.equals("*")) {
			double sum = data2*data3;
					if(plusMinus.equals("-")) {
						double sum2 = data1-sum;
						System.out.print("The result of " + data1 + " - " + data2 + " * " + data3 + " = " + sum2);
					}
					else if(plusMinus.equals("+")) {
						double sum2 = data1+sum;
						System.out.print("The result of " + data1 + " + " + data2 + " * " + data3 + " = " + sum2);
					}
		}
		// a+b/c, a-b/c
		else if(plusMinus2.equals("/")) {
			double data2A = data2;
			double data3A = data3;
			double sum = data2A/data3A;
					if(plusMinus.equals("-")) {
						double sum2 = data1-sum;
						System.out.print("The result of " + data1 + " - " + data2 + " / " + data3 + " = " + sum2);
					}
					else if(plusMinus.equals("+")) {
						double sum2 = data1+sum;
						System.out.print("The result of " + data1 + " + " + data2 + " / " + data3 + " = " + sum2);
					}
		}
	}
}