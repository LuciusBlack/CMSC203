
public class Procedure {

	private String Date;
	private String practitioner;
	private String Procedure;
	private double Charge;
	
	Procedure(String Date, String practitioner, String Procedure, double Charge){
		
		this.Date = Date;
		this.practitioner = practitioner;
		this.Procedure = Procedure;
		this.Charge = Charge;
	}
	
	
	
public String getDate() {
	return Date;
}

public String getPractitioner() {
	return practitioner;
}


public String getProcedure() {
	return Procedure;
}
	
public double getCharge() {
	return Charge;
}


public void DisplayProcedure() {
	
	System.out.println("Procedure: " + getProcedure());
	System.out.println("Practitioner: " + getPractitioner());
	System.out.println("Procedure Date: " + getDate());
	System.out.println("Charge: " + getCharge());
	System.out.println();
}
	



}
