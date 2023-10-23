package project2;

import java.util.*;
import java.util.Scanner;
public class Main {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	/*
	Vehicle Class Object Constructor Rules
  	private String make;
	private String model;
	private int year;
	private int used;
	private int gift;
	private int insurance;
	private int smogged;
	private int nonOp;
	private int tickets;
	
	
	(-1(empty) 0(false) 1(true)
	
	

 */
	public static void main(String [] args) {
	
	int costVariable;	
	double cost = 0;
	boolean[] onFile = {true};
	Scanner kb = new Scanner(System.in);
	BooleanBinaryTree tree = new BooleanBinaryTree();
	ArrayList<vehicleClass> cars = new ArrayList<vehicleClass>();
	
	int[] vins = {12345, 23456, 34567, 45678, 56789, 67890, 98765, 87654, 76543, 65432, 0};
	
	
	
	
	
	
	
	
	
	
	
	
	vehicleClass Car1 = new vehicleClass("Honda", "Civic", 12345, 2020, 1, 0, 1, 0, 3, true);
	vehicleClass Car2 = new vehicleClass("Toyota", "Sienna", 23456, 2012, 1, 0, 1, 0, 0, true);
	vehicleClass Car3 = new vehicleClass("Ford", "Fusion", 34567, 2008, 1, 0, 1, 0, 0, true);
	vehicleClass Car4 = new vehicleClass("Mercedes", "E-Class", 45678, 2018, 1, -1, 1, 0, 0, true);
	vehicleClass Car5 = new vehicleClass("Chevrolet", "Silverado 1500", 56789, 2015, 1, 0, 1, 1, 0, true);
	vehicleClass Car6 = new vehicleClass("Nissan", "GT-R", 67890, 2020, -1, 0, 1, 0, 6, true);
	vehicleClass Car7 = new vehicleClass("Honda", "S2000", 98765, 2009, 1, 0, -1, 0, 0, true);
	vehicleClass Car8 = new vehicleClass("Kia", "Sorento", 87654, 2014, 1, -1, 1, 0, 4, true);
	vehicleClass Car9 = new vehicleClass("Honda", "Accord", 76543, 2019, 1, 0, -1, 0, 0, true);
	vehicleClass Car10 = new vehicleClass("Ford", "F-250", 65432, 2010, 1, -1, 1, 1, 0, true);
	vehicleClass yourCar = new vehicleClass("", "", 0, 0, 0, 0, 0, 0, 0, true);
	cars.add(Car1);
	cars.add(Car2);
	cars.add(Car3);
	cars.add(Car4);
	cars.add(Car5);
	cars.add(Car6);
	cars.add(Car7);
	cars.add(Car8);
	cars.add(Car9);
	cars.add(Car10);
	cars.add(yourCar);
	
	
	//ourTree.printTree(root,  0);
	
	int carNumber = 0;
	carNumber = checkVehicle(onFile, yourCar, kb, vins, cars);
	if (onFile[0] == false) {
		carNumber = 10;
	makeAndModel(yourCar, kb);
	newUsed(yourCar, kb);
	if (cars.get(carNumber).getUsedInt() == 0) {
		System.out.println("You do not need to register your vehicle. The dealership already has already taken care of that for you.");
		
		System.exit(0);
	}
	year(yourCar, kb);
	insurance(yourCar, kb);
	smogged(yourCar, kb);
	nonOp(yourCar, kb);
	tickets(yourCar, kb);
	
	}
	if (onFile[0] == true) {
		if (cars.get(carNumber).getUsedInt() == -1) {
			gap();
			System.out.println("Your vehicle status is not on file...");
			newUsed(cars.get(carNumber), kb);
			
		}
		if (cars.get(carNumber).getInsuranceInt() == -1) {
			gap();
			System.out.println("The status of your current insurance is not on file...");
			insurance(cars.get(carNumber), kb);
		}
		if (cars.get(carNumber).getSmoggedInt() == -1) {
			gap();
			System.out.println("Your vehicle's smogged status is not on file...");
			smogged(cars.get(carNumber), kb);
		}
		if (cars.get(carNumber).getNonOpInt() == -1) {
			gap();
			System.out.println("Your vehicles non operational status is not on file...");
			nonOp(cars.get(carNumber), kb);
		}
		if (cars.get(carNumber).getTicketsInt() == -1)
		tickets(cars.get(carNumber), kb);
		
	}
	
	if(cars.get(carNumber).getUsedInt() == 0) {
		tree.insert(1, "Used", false);
	}else {
			tree.insert(1, "Used", true);
		}
	System.out.println(cars.get(carNumber).getInsurance());
	wait(3000);
	if(cars.get(carNumber).getInsuranceInt() == 0) {
		tree.insert(2,  "Code 3395800000 - No Insurance On File", false);
	}else {
		tree.insert(2, "Insurance on File", true);
	}
	if(cars.get(carNumber).getSmoggedInt() == 0) {
		tree.insert(3, "Code 339566000202 - Vehicle Not Smogged", false);
	}else {
		tree.insert(3, "Smogged", true);
	}
	if(cars.get(carNumber).getTicketsInt() > 0) {
		int ans = -1;
		while (ans >= 0) {
		System.out.println("You have pending tickets totaling " + cars.get(carNumber).getTicketCosts());
		wait(2000);
		System.out.println("Are you able to pay this today? 0 for No. 1 for Yes");
			while (!kb.hasNextInt()) {
				System.out.println("Use 0 for No, not today. \nUse 1 for Yes, I can pay them today");
				kb.next();
			}
			ans = kb.nextInt();
		}
			if(ans == 0) {
				tree.insert(4, "Tickets Pending", true);
				
			}else {tree.insert(4, "Ticket Pending",true);
			
			}
	}
			
	tree.inOrderTraversal(cars.get(carNumber));
	if(cars.get(carNumber).getRegable() == false) {
		System.out.println("However, if you would like to pay your fees today...");
	}
	if(cars.get(carNumber).getRegable() == true) {
		System.out.println(ANSI_GREEN + "You may register your vehicle today..."+ANSI_RESET);
	}
	costVariable = getCostOfModelRegistration(cars.get(carNumber).getModel());
	cost = totalCost(cars.get(carNumber).getTicketCosts(), costVariable);
	
	if (cars.get(carNumber).getNonOpInt() == 1) {
		System.out.printf("The total cost will be \n%.0000f Dollars.", cost/3);
	}else {	
	System.out.println(ANSI_GREEN+"The total cost will be\n" +cost+ANSI_RESET);
	}
	
	
	
	
	
	//System.out.println("Your Vehicle Info: "+ cars.get(10).toString());
	}
	
	public static void gap() {
		System.out.println("--------------------------------------------------------------");
		
	}

	public static int checkVehicle(boolean[] onFile, vehicleClass yourCar, Scanner kb, int[] vins, ArrayList<vehicleClass> cars) {
		
		
		System.out.println("Here is list of VIN numbers we currently have on file:");
		for(int i = 0; i < 10; i = i + 5) {
			System.out.printf("\n%d %d %d %d %d\n\n", vins[i], vins[i+1], vins[i+2], vins[i+3], vins[i+4]);
			
		}
		System.out.println("Please enter the last 5 of your vin number");
		
		
		int vin = kb.nextInt();
		System.out.print("Checking to see if your vin is on file");
		for (int i = 0; i < 20; i++) {
			System.out.print(".");
			wait(300);
		}
		System.out.println(vin);
		for (int i = 0; i < vehicleClass.getCount(); i++) {
			System.out.println(cars.get(i).getVin());
			
			if (vin == cars.get(i).getVin()) {
				System.out.println("\n\n\n\n\n\n\nThis vehicle with vin " + cars.get(i).getVin()+ " is on file");
				System.out.println("Vehicle statistics with the DMV are as follows" + cars.get(i).toString());
				wait(2000);
				onFile[0] = true;
				return i;
				
			}
		}
			
				System.out.println("\nThis vehicle is not on file and needs to be entered");
				onFile[0] = false;
				yourCar.setVin(vin);
				
			
		
		return 0;
		
	}
		// User will enter the Make and Model of their vehicle via selections
	
	public static void makeAndModel(vehicleClass yourCar, Scanner kb) {
		
		String makeName = "";
		String modelName = "";
		int make = -1;
		int model = -1;
		
	    
	   
		for (int i = 0; i < carTypes.sizeOf("makes"); i++) {
			System.out.println(i + ". -- " + carTypes.getMake(i));
		}
		do {
			System.out.println("Please select your vehicle make from the list using the corrisponding number");
				while(!kb.hasNextInt()) {
					System.out.println("Please enter a number!");
					kb.next();
				}
				make = kb.nextInt();
		}
		
		while (make <0 || make > 8);
		
			
		//System.out.println("Thank you, You chose " + carTypes.getMake(make));
		gap();
		
			//If the choice is Honda (0)
		
		if (make == 0) {
			makeName = "Honda";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i + ". -- " + carTypes.getHondaModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			
			
			gap();
			//System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getHondaModel(model));
			modelName = carTypes.getHondaModel(model);
		}
		
			//If the choice is Toyota (1)
		
		if (make == 1) {
			makeName = "Toyota";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getToyotaModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getToyotaModel(model));
			modelName = carTypes.getToyotaModel(model);
		}
			
			//If the choice is Chevrolet (2)
		
		if (make == 2) {
			makeName = "Chevy";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getChevyModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getChevyModel(model));
			modelName = carTypes.getChevyModel(model);
		}
		
			//If the choice is Ford (3)
		
		if (make == 3) {
			makeName = "Ford";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getFordModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getFordModel(model));
			modelName = carTypes.getFordModel(model);
		}
		
			//If the choice is Nissan (4)
		
		if (make == 4) {
			makeName = "Nissan";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getNissanModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getNissanModel(model));
			modelName = carTypes.getNissanModel(model);
		}
		
			//If the choice is Kia (5)
		
		if (make == 5) {
			makeName = "Kia";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getKiaModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getKiaModel(model));
			modelName = carTypes.getKiaModel(model);
		}
		
			//If the choice is Acura (6)
		
		if (make == 6) {
			makeName = "Acura";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getAcuraModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getAcuraModel(model));
			modelName = carTypes.getAcuraModel(model);
		}
		
			//If the choice is Lexus (7)
		
		if (make == 7) {
			makeName = "Lexus";
			for (int i = 0; i < carTypes.sizeOf(makeName); i++) {
				System.out.println(i+ ". -- " + carTypes.getLexusModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf(makeName)) {
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			//while (model < 0 || model > carTypes.sizeOf(makeName));
			
			gap();
			System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getLexusModel(model));
			modelName = carTypes.getLexusModel(model);
		}
		
			//If the choice is Mercedes (8)
		
		if (make == 8) {
			makeName = "Mercedes";
			for (int i = 0; i < carTypes.sizeOf("Merc"); i++) {
				System.out.println(i+ ". -- " + carTypes.getMercModel(i));
			}
			while (model < 0 || model > carTypes.sizeOf("merc")){
				System.out.println("Please select your vehicle model from the list using the corrisponding number");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a number");
						kb.next();
					}
					model = kb.nextInt();
			}
			
			
			gap();
			//System.out.println("Thank you, you chose a " + carTypes.getMake(make) + " " + carTypes.getMercModel(model));
				
				
			modelName = carTypes.getMercModel(model);
		}
			gap();
			
				//sets the vehicle objects make and model attribute
			yourCar.setMake(makeName);
			yourCar.setModel(modelName);
	}
			
	
				//User will choose whether the vehicle is new or used
	
			public static void newUsed(vehicleClass yourCar, Scanner kb) {
			int used = -1;
			boolean usedNew;
			while (used < 0 || used > 1){
				System.out.println("Is your vehicle used or new?\n0 for New\n1 for Used");
					while (!kb.hasNextInt()) {
						System.out.println("1 for Yes, 0 for No");
						kb.next();
					}
					used = kb.nextInt();
				
			}
			
			
			
				//sets the vehicle object used attribute
			yourCar.setUsed(used);
			gap();
			}
			
				//User will enter the year of the vehicle
			
			public static void year(vehicleClass yourCar, Scanner kb) {
			int year = -1;
			
			while (year < 1900 || year > 2024) {
				System.out.println("What year is your vehicle?");
					while(!kb.hasNextInt()) {
						System.out.println("Please enter a valid year");
						kb.next();
					}
					year = kb.nextInt();
			}
			
			gap();
			
				//sets the vehicle object year attribute
			
			yourCar.setYear(year);
			}
			
			
				// User will choose if they have insurance
			
			public static void insurance(vehicleClass yourCar, Scanner kb) {
			int ins = -1;
			
			while (ins < 0 || ins > 1)	{
			System.out.println("Do you have Insurance on the vehicle?\n Press '1' for Yes\nPress '0' for No");
				while(!kb.hasNextInt()) {
					System.out.println("1 for Yes, 0 for No");
					kb.next();
				}
				ins = kb.nextInt();
			}
			
			
			gap();
				// sets the vehicle object insurance attribute
			yourCar.setInsurance(ins);
			//System.out.println(yourCar.getInsurance());
			
			}
			
			
				// User will choose if their vehicle is smogged
			
			public static void smogged(vehicleClass yourCar, Scanner kb) {
			int smg = -1;
			boolean smogged;
			while (smg < 0 || smg > 1)
			{
				System.out.println("Is your vehicle smogged?\nPress '1' for Yes\nPress '0' for No");
				while (!kb.hasNextInt()) {
					System.out.println("1 for Yes, 0 for No");
					kb.next();
				}
				smg = kb.nextInt();
			}
			
			
			
				//sets the vehicle objects smogged attribute
			yourCar.setSmogged(smg);
			gap();
			}
			
			
				//User will choose if their vehicle is non operational
			
			public static void nonOp(vehicleClass yourCar, Scanner kb) {
			int nop = -1;
			
			while (nop < 0 || nop > 1)
					{
				System.out.println("Is your vehicle going to be registered as a Non-Operational vehicle?");
				System.out.println("Please enter '1' for Yes or '0' for No");
				while (!kb.hasNextInt()) {
					System.out.println("1 for Yes, 0 for No");
					kb.next();
				}
				nop = kb.nextInt();
				
			}
			
				//sets the vehicle object non-op attribute
			
			yourCar.setNonOp(nop);
			gap();
			}
			
			
				//User will choose if they have any outstanding tickets
			
			public static void tickets(vehicleClass yourCar, Scanner kb) {
			Random rand = new Random();
		    int t = rand.nextInt(0, 10);
			int tkt = -10;
			int numTickets = -1;
			boolean check1;
			boolean check2;
			boolean check3;
			
			System.out.println("Lets check to see if you have any tickets on file");
			for (int i = 0; i < 20; i++) {
				System.out.print(".");
				wait(300);
			}
			System.out.println();
			check1 = rand.nextBoolean();
				if (check1 == false){
					System.out.println("You have no tickets on file with the DMV");
					wait(2000);
				}else {
								System.out.println("You have " + t + " tickets on file.");
								yourCar.setTickets(t);
								wait(2000);
							}
						}
				
			
			public static void wait(int time) {
				try {
					Thread.sleep(time);
				}catch(InterruptedException e) {
					Thread.currentThread().interrupt();
				 }
			}
			public static int getCostOfModelRegistration(String model) {
				int size;
				int i = 0;
				size = carTypes.sizeOf("suv");
				while (i < size) {
					if (model.contains(carTypes.getSUV(i))) {
						return 0;
					}
				i++;
				}
				i = 0;
				size = carTypes.sizeOf("compact");
				while (i < size) {
					if(model.contains(carTypes.getCompact(i))) {
						return 1;
					}
					i++;
				}
				i = 0;
				size = carTypes.sizeOf("sedan");
				while (i < size) {
				if(model.contains(carTypes.getSedan(i))) {
					return 2;
				}
				i++;	
				}
				i = 0;
				size = carTypes.sizeOf("truck");
				while (i < size) {
					if (model.contains(carTypes.getTruck(i))) {
						return 3;
					}
					i++;
				}
				i = 0;
				size = carTypes.sizeOf("sports");
				while(i < size) {
					if (model.contains(carTypes.getSports(i))) {
						return 4;
					}
					i++;
				}
				i = 0;
				size = carTypes.sizeOf("minivan");
				while (i < size) {
					if (model.contains(carTypes.getMiniVan(i))) {
						return 5;
					}
					i++;
				}
				
				
				


return -1;
			}
			public static double totalCost(int ticketCost, int modelNum) {
				double regCost;
				double ticketModifier;
				if (modelNum == 0) {
					regCost = 200;
					ticketModifier = 1.7;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == 1) {
					regCost = 120;
					ticketModifier = 1.2;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == 2) {
					regCost = 145;
					ticketModifier = 1.5;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == 3) {
					regCost = 275;
					ticketModifier = 2.3;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == 4) {
					regCost = 220;
					ticketModifier = 2.9;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == 5) {
					regCost = 50;
					ticketModifier = .9;
					return regCost + (ticketCost*ticketModifier);
				}
				if (modelNum == -1) {
					return -1.0;
				}
				return 0;
				
			}
			
			
}
			

			
		
		
		
		
		
			
		
	


