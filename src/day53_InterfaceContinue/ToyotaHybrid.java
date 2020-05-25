package day53_InterfaceContinue;

public class ToyotaHybrid implements Cars, GasVehicles, ElectricVehicles{

	@Override
	public void Charge() {
		System.out.println("Toyota hybrid charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Toyota hybrid self-driving");
		
	}

	@Override
	public void PumpGas() {
		System.out.println("Toyota hybrid pumping gas");
		
	}

	@Override
	public void Start() {
		System.out.println("Toyota hybrid starting");
		
	}

	@Override
	public void Fly() {
		System.out.println("Toyota hybrid flying");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Toyota hybrid self-parking");
		
	}
	
}