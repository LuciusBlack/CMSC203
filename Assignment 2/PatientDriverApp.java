



public class PatientDriverApp {

	public static void main(String[] args) {
	
		String name = "Yohance Mottley";
		String Due_Date = "9/28/23";
		double total;
		
		Patient patient = new Patient("Kenny", "C", "Carlton", "Boom Bap St.", "Orange County",
				"FL", "23531", 	"324-5528-358", "Stevie James", "202-357-3283");
		
		Procedure HRT_Surgery = new Procedure("10/29/23", "James Bong", "Heart Surgery", 62330.42);
		Procedure BNE_TRNSPLNT = new Procedure ("10/30/23", "Garisonson Ging", "Bone Transplant", 43454.24);
		Procedure RAD_THERAPY = new Procedure ("10/31/23", "Parley James", "Radiation Therapy", 4941.32);
	
		
		patient.DisplayPatient();
		
		
	HRT_Surgery.DisplayProcedure();
		
		
	BNE_TRNSPLNT.DisplayProcedure();
		
	
	RAD_THERAPY.DisplayProcedure();
		
		
		total = (HRT_Surgery.getCharge() + BNE_TRNSPLNT.getCharge() + RAD_THERAPY.getCharge());
		
		System.out.println("Total Charges: " + total);
		
		System.out.println();
		
		System.out.println("This was created by " + name + " " + Due_Date);
		
				
	}
	
}

