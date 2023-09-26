
public class Patient
{
	private String Fname;
	private String Mname;
	private String Lname;
	private String Street;
	private String city;
	private String state;
	private String ZIP;
	private String Phone_num;
	private String emergencyName;
	private String emergency_num;
	
	public Patient(String Fname, String Mname, String Lname, String Street, String city, String state, 
			String ZIP, String Phone_num, String emergencyName, String emergency_num) 
	{ 
		this.Fname = Fname;
		this.Mname = Mname;
		this.Lname = Lname;
		this.Street = Street;
		this.city = city;
		this.state = state;
		this.ZIP = ZIP;
		this.Phone_num = Phone_num;
		this.emergencyName = emergencyName;
		this.emergency_num = emergency_num;		
	}
	
	
	
public String getFirstName() {
    return Fname;
}



public String getLastName() {
    return Lname;
}



public String getMidName() {
	return Mname;
}


public String getStreet() {
	return Street;
}

public String getCity() {
	return city;
}

public String getState() {
	return state;
}

public String getZIP() {
	return ZIP;
}

public String getPhone() {
	return Phone_num;
}


public String getEmergentName() {
	return emergencyName;
}

public String getemergency_num() {
	return emergency_num;
}

public void DisplayPatient() {
	
	System.out.println("Patient Info:");
	
	System.out.println("Name: " + getFirstName() + " " + getMidName() + " " + getLastName());
	System.out.println("Address: " + getStreet() + " " + getCity()+ " " + getState()+" " + getZIP());
	System.out.println("Emergency Contact: " + getemergency_num() + " " + getEmergentName());
	System.out.println();
	
}



}
