package project2;
import java.util.*;
public class carTypes {

	private static String[]makes = {"Honda", "Toyota", "Chevrolet", "Ford", "Nissan", "Kia", "Acura", "Lexus", "Mercedes"};
	private static String[]hondaModels;
	private static String[]toyotaModels;
	private static String[]chevyModels;
	private static String[]fordModels;
	private static String[]nissanModels;
	private static String[]kiaModels;
	private static String[]acuraModels;
	private static String[]lexusModels;
	private static String[]mercModels;
	
		public carTypes(String[] makes, String[] hondaModels, String[] toyotaModels,
		String[] chevyModels, String[] fordModels, String[] nissanModels, 
		String[] kiaModels, String[] acuraModels, String[] lexusModels, 
		String[] mercModels) {
			/*this.makes = makes;
			this.hondaModels = hondaModels;
			this.toyotaModels = toyotaModels;
			this.chevyModels = chevyModels;
			this.fordModels = fordModels;
			this.nissanModels = nissanModels;
			this.kiaModels = kiaModels;
			this.acuraModels = acuraModels;
			this.lexusModels = lexusModels;
			this.mercModels = mercModels;*/
			
		}
		
		//List of vehicles based on makes
		static String[] Makes = {"Honda", "Toyota", "Chevrolet", "Ford", "Nissan", "Kia", "Acura", "Lexus", "Mercedes"};
		static String[] HondaModels = {"Civic", "Accord", "Odessy", "Ridgeline", "CRZ", "S2000"};
		static String[] ToyotaModels = {"Sienna", "Corolla", "Rav-4", "Tacoma", "Tundra", "Camry"};
		static String[] ChevyModels = {"Silverado 1500", "Silverado 2500", "Silverado 2500 HD", "Camaro", "Corvette", "Malibu"};
		static String[] FordModels = {"F-150", "F-250", "F-250 SuperDuty", "Mustang", "Windstar", "Focus", "Fusion"};
		static String[] NissanModels = {"Pathfinder", "Rogue", "GT-R", "Versa", "Frontier", "Quest"};
		static String[] KiaModels = {"Sorento", "Rio", "Seltos", "Stinger", "Sportage", "Forte", "Soul"};
		static String[] AcuraModels = {"TLX", "ILX", "Integra", "MDX", "RDX", "NSX"};
		static String[] LexusModels = {"GX", "IS", "LX", "NX", "RZ", "LS"};
		static String[] MercModels = {"A-Class", "E-Class", "G-Class", "S-Class", "GLE-Class"};
		
		//list of vehicle types used in evaluating the cost of registration
		static String[] SUV = {"Rav-4", "Pathfinder", "Rogue", "Sportage", "Seltos", "Sorento", "MDX", "RDX", "GX", "G-Class", "GLE-Class"};
		static String[] compact = {"Civic", "CRZ", "Corolla", "Focus", "Versa", "Rio", "Forte", "Integra", "A-Class"};
		static String[] sedan = {"Accord", "Camry", "Malibu", "Fusion", "Stinger", "TLX", "ILX", "IS", "LX", "LS", "E-Class", "S-Class"};
		static String[] sports = {"S2000", "Camaro", "Corvette", "Mustang", "GT-R", "NSX", "RZ"};
		static String[] truck = {"Ridgeline", "Tacoma", "Tundra", "Silverado 1500", "Silverado 2500", "Silverado 2500 HD", "F-150",
									"F-250", "F-250 SuperDuty", "Frontier"};
		static String[] miniVan = {"Odessy", "Sienna", "Windstar", "Quest"};
		
		//length of the arrays used in the sizeOf() method
		private static int makesSize = Makes.length;
		private static int hondaSize = HondaModels.length;
		private static int toyotaSize = ToyotaModels.length;
		private static int chevySize = ChevyModels.length;
		private static int fordSize = FordModels.length;
		private static int nissanSize = NissanModels.length;
		private static int kiaSize = KiaModels.length;
		private static int acuraSize = AcuraModels.length;
		private static int lexusSize = LexusModels.length;
		private static int mercSize = MercModels.length;
		
		
		//getter methods
		
		public static String getMake(int i) {
			return makes[i];
		}
		public static String getHondaModel(int i) {
			return HondaModels[i];
		}
		public static String getToyotaModel(int i) {
			return ToyotaModels[i];
		}
		public static String getChevyModel(int i) {
			return ChevyModels[i];
		}
		public static String getFordModel(int i) {
			return FordModels[i];
		}
		public static String getNissanModel(int i) {
			return NissanModels[i];
		}
		public static String getKiaModel(int i) {
			return KiaModels[i];
		}
		public static String getAcuraModel(int i) {
			return AcuraModels[i];
		}
		public static String getLexusModel(int i) {
			return LexusModels[i];
		}
		public static String getMercModel(int i) {
			return MercModels[i];
		}
		public static String getSUV(int i) {
			return SUV[i];
		}
		public static String getCompact(int i) {
			return compact[i];
		}
		public static String getSedan(int i) {
			return sedan[i];
		}
		public static String getSports(int i) {
			return sports[i];
		}
		public static String getTruck(int i) {
			return truck[i];
		}
		public static String getMiniVan(int i) {
			return miniVan[i];
		}
		
		public static String listMakes() {
			return Arrays.toString(makes);
			
			
		}
		public static String listHondaModels() {
			
			return Arrays.toString(hondaModels);
		}
		public static String listToyotaModels() {
			
			return Arrays.toString(toyotaModels);
		}
		public static String listChevyModels() {
			
			return Arrays.toString(chevyModels);
		}
		public static String listFordModels() {
			
			return Arrays.toString(fordModels);
		}
		public static String listNissanModels() {
			return Arrays.toString(nissanModels);
		}
		public static String listKiaModels() {
			return Arrays.toString(kiaModels);
		}
		public static String listAcuraModels() {
			return Arrays.toString(acuraModels);
		}
		public static String listLexusModels() {
			return Arrays.toString(lexusModels);
		}
		public static String listMercModels() {
			return Arrays.toString(mercModels);
		}
		public static int sizeOf(String data) {
			if(data.equalsIgnoreCase("Makes"))
				return makesSize;
			else if(data.equalsIgnoreCase("Honda"))
				return hondaSize;
			else if(data.equalsIgnoreCase("Toyota"))
				return toyotaSize;
			else if (data.equalsIgnoreCase("Chevy"))
				return chevySize;
			else if (data.equalsIgnoreCase("Ford"))
				return fordSize;
			else if (data.equalsIgnoreCase("nissan"))
				return nissanSize;
			else if (data.equalsIgnoreCase("kia"))
				return kiaSize;
			else if (data.equalsIgnoreCase("acura"))
				return acuraSize;
			else if (data.equalsIgnoreCase("lexus"))
				return lexusSize;
			else if (data.equalsIgnoreCase("merc"))
				return mercSize;
			else if (data.equalsIgnoreCase("suv"))
				return SUV.length;
			else if (data.equalsIgnoreCase("compact"))
				return compact.length;
			else if (data.equalsIgnoreCase("sedan"))
				return sedan.length;
			else if (data.equalsIgnoreCase("truck"))
				return truck.length;
			else if (data.equalsIgnoreCase("sports"))
				return sports.length;
			else if (data.equalsIgnoreCase("minivan"))
				return miniVan.length;
			else {
				return -1;
			}
		}
		public int size() {
			return 10;
		}
		
		
}
	
	
	
