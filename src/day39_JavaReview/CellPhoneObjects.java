package day39_JavaReview;

public class CellPhoneObjects {
	
	public static void main(String[] args) {
		
		CellPhone phone1 = new CellPhone();
		System.out.println(phone1.brand); 
		System.out.println(phone1.color); 
		System.out.println(phone1.model); 
		System.out.println(phone1.price); 
		System.out.println(phone1.screenSize);
		
		phone1.brand = "Motorola"; //instance variable
		System.out.println(phone1.brand);
		
		CellPhone phone2 = new CellPhone();
			phone2.brand = "Samsung";
		System.out.println(phone2.brand);
		
		CellPhone phone3 = new CellPhone("Motorola", "Moto Z2", 180, "Gray", 6.1);
		phone3.getInfo();
		
		CellPhone phone4 = new CellPhone("Nokia", "3330", 20, "Black", 3.3);
		phone4.getInfo();
		
		CellPhone phone5 = new CellPhone("Samsung", "GT-500", 700, "Red", 5.5);
		phone5.getInfo();
		
		//Array of objects
		CellPhone[] phones = {phone1, phone2, phone3, phone4, phone5};
		System.out.println(phones[2].brand);
		System.out.println(phones[2].model);
		
	}

}
