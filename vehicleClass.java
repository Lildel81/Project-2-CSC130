package project2;

public class vehicleClass {
	
private String make;
private String model;
private int vin;
private int year;
private int used;
private int insurance;
private int smogged;
private int nonOp;
private int tickets;
final private int ticketCost = 150;
private int finalTicketCost;
 boolean regable = false;

public static int count = 0; 


	public vehicleClass(String make, String model, int vin, int year, int used,
			int insurance, int smogged, int nonOp, int tickets, boolean regable) {
		this.make = make;
		this.model = model;
		this.vin = vin;
		this.year = year;
		this.used = used;
		this.insurance = insurance;
		this.smogged = smogged;
		this.nonOp = nonOp;
		this.tickets = tickets;
		this.regable = regable;
		count = count +1;
				
		
	}
	//mutator methods
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setUsed(int used) {
		while (used < -1 || used > 1) {
			System.out.println("Please enter a proper value");
			System.out.println("-1 (empty)");
			System.out.println("0 (false)");
			System.out.println("1 (true)");
		}
		this.used = used;
	}
	public void setReg(boolean value) {
		this.regable = value;
	}
	
	public void setInsurance(int insurance) {
		while (insurance < -1 || insurance > 1)
		{System.out.println("Please enter a proper value");
		 System.out.println("-1 (empty)");
		 System.out.println("0 (false)");
		 System.out.println("1 (true)");
		}
		
		this.insurance = insurance;
	}
	public void setSmogged(int smogged) {
		while (smogged < -1 || smogged > 1)
		{System.out.println("Please enter a proper value");
		 System.out.println("-1 (empty)");
		 System.out.println("0 (false)");
		 System.out.println("1 (true)");
		}
		
		this.smogged = smogged;
	}
	public void setNonOp(int nonOp) {
		while (nonOp <-1 || nonOp > 1)
		{System.out.println("Please enter a proper value");
		 System.out.println("-1 (empty)");
		 System.out.println("0 (false)");
		 System.out.println("1 (true)");
		}
		
		this.nonOp = nonOp;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public void setTicketCost(int tickets) {
		finalTicketCost = tickets * ticketCost;
		
	}
	
	//getter methods
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getVin() {
		return vin;
	}
	public int getYear() {
		return year;
	}
	public String getUsed() {
		if (used == -1)
			return "-1 (Empty)";
		else if (used == 0)
			return "0 (False)";
		else if (used == 1)
			return "1 (True)";
		else {
			return "Invalled seleciton made, please choose -1(empty), 0(false), or 1(true)";
		}
	
	}
	public int getUsedInt() {
		return used;
	}
	
	public String getInsurance() {
		if (insurance == -1)
			return "-1 (Empty)";
		else if (insurance == 0)
			return "0 (False)";
		else if (insurance == 1)
			return "1 (True)";
		else {
			return "Invalled seleciton made, please choose -1(empty), 0(false), or 1(true)";
		}
	}
	
	public int getInsuranceInt() {
		return insurance;
	}
	
	public String getSmogged() {
		if (smogged == -1)
			return "-1 (Empty)";
		else if (smogged == 0)
			return "0 (False)";
		else if (smogged == 1)
			return "1 (True)";
		else {
			return "Invalled seleciton made, please choose -1(empty), 0(false), or 1(true)";
		}
	}
	public int getSmoggedInt() {
		return smogged;
	}
	
	
	public String getNonOp() {
		if (nonOp == -1)
			return "-1 (Empty)";
		else if (nonOp == 0)
			return "0 (False)";
		else if (nonOp == 1)
			return "1 (True)";
		else {
			return "Invalled seleciton made, please choose -1(empty), 0(false), or 1(true)";
		}
	}
	
	public int getNonOpInt() {
		return nonOp;
	}
	
	public String getTickets() {
		if (tickets == 0)
			return "0 (There are no tickets on file)";
		else {
			return tickets + " are on file";
		}
	}
	
	public int getTicketsInt() {
		return tickets;
	}
	
	
	public String addTicketCosts() {
		if (tickets == 0)
			return "There are no tickets on file. No extra costs incurred";
		else {
			finalTicketCost = tickets*ticketCost;
			return tickets + " tickets multiplied by the vehicle multiplier of your vehicle";
		}
	}
	public int getTicketCosts() {
		if (tickets == 0)
			return 0;
		else {
			return tickets*ticketCost;
		}
	}
	public static int getCount() {
		return count;
	}
	public String toString() {
		return "Make: " + make+
				"\nModel: " + model+
				"\nYear: " + year+
				"\nUsed: " + getUsed()+
				"\nInsured: " + getInsurance()+
				"\nSmogged: " + getSmogged()+
				"\nNon Operational: " + getNonOp()+
				"\nTickets on file: " + getTickets()+
				"\nCost of tickets added to registration: " + addTicketCosts();
				
	}
	public boolean getRegable() {
		return regable;
	}
	
	
	
	

}
