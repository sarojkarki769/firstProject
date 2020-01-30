package myProject;

public class myProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String 	myName = "Saroj karki";
	
	System.out.println(myName);
		
	String firstName;
	
	String lastName;
	
	firstName = "Saroj";
	
	lastName = "Karki";
	
	System.out.println(" My name is "  + firstName + " " + lastName);
		
		
		/// Concatination
		
		String housePrice = "650,000";
		String address = "12024 Valcour Island way";
		String techSchool = "TechCircle";
		
		System.out.println(techSchool + "is an IT Bootcamp. And the Address is\n" + 
		address + "." + " the medium price of houses in the area is " + housePrice + ".");
		
		
		
		/////// Premitive data type
		
		int firstNumber = 10;
		int secondNumber = 15;
		
		   boolean a = (firstNumber==secondNumber);
		    System.out.println(a);
	
		    
		    /////////////////// down below is Object data type
		  
		   
		
		Integer objectNumber = new Integer(6);
		    Integer objectSecNumber = new Integer(7);
		    
	   boolean b = (objectNumber.equals(objectSecNumber));
	   System.out.println(b);
	   
	   String myString = new String("Helloworld");
	   
	   System.out.println(myString);
	   
	   
	
	
	
	}

}
