package day53_InterfaceContinue;

public class Dealership {
	
	public static void main(String[] args) {
		
		Tesla_Model3 car1 = new Tesla_Model3();
		car1.Start();
		car1.Charge();
		car1.SelfDrive();
		car1.Fly();
		System.out.println("===================");
		
		Jeep_Wrangler car2 = new Jeep_Wrangler();
		car2.Start();
		car2.PumpGas();
		car2.SelfParking();
		System.out.println("===================");
		
		ToyotaHybrid car3 = new ToyotaHybrid();
		car3.Charge();
		car3.Start();
		car3.SelfDrive();
		car3.SelfParking();
		car3.Fly();
		
	}

}
