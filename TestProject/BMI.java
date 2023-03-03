package modthree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BMI {
	

	

	//private static Object getName;
	//private static Object getAge;
	//private static double getWeight;
	//private static double getHeight;

	public static void main(String[] args) {
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		try (BufferedWriter write = new BufferedWriter(new FileWriter("C://Users//austi//Documents//BMI.csv")))
		{
		//name of user
		//System.out.println("Whats your name?");
		//String name = input.nextLine();
		
		//age of user
		//System.out.println("What is your age?");
		//String age = input.nextLine();
		
		//Weight input from user
		//System.out.println("Whats your weight?");
		//double weight = input.nextDouble();
		
		//Height from user
		//System.out.println("What is your height in inches ?");
		//double height = input.nextDouble();
		//input.close();
		//math
		//double bmi = weight / (height * height) * 703;
		
		//prints on console
		//DecimalFormat df = new DecimalFormat("0.0");
		//System.out.println("Your BMI is " + df.format(bmi));
		
		//getName = name;
		//getAge = age;
		//getWeight = weight;
		//getHeight = height;
		
		
		
		
		List<List<String>> OT = new ArrayList<>();
		
		while (true) {
			List<String> OR = new ArrayList<>();
			
			System.out.println("Whats your name");
			String getName = input.nextLine();
			
			System.out.println("Whats your age");
			Double getAge = input.nextDouble();
			
			System.out.println("What is your weight");
			Double getWeight = input.nextDouble();
			
			System.out.println("What is your height");
			Double getHeight = input.nextDouble();
			
			double bmi = getWeight / (getWeight * getHeight) * 703;
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("Your BMI is " + df.format(bmi));
			input.nextLine();
			 System.out.print("Do you want to quit(press q/Q):");
	            String quit = input.nextLine();
			if (quit.equalsIgnoreCase("q")) break;
			 
		         
			
		StringBuilder sb = new StringBuilder();
		sb.append("Name");
		sb.append(",");
		sb.append("Age");
		sb.append(",");
		sb.append("Weight");
		sb.append(",");
		sb.append("Height");
		sb.append(",");
		sb.append("BMI");
		sb.append(System.lineSeparator());
		
		if (bmi <= 18.5)sb.append("Insurance category low");
		else if (bmi >= 18.5 && bmi < 25)sb.append("Insurance category low,");
		else if (bmi >= 25 && bmi < 30)sb.append("Insurance category is normal");
		else if (bmi >= 30)sb.append("Insurnace high");
		
		write.write(sb.toString());
		}
		write.close();
		
		
		
		
		
		
		
		
			
		} catch (IOException e) {
		   System.out.println("no");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	}


