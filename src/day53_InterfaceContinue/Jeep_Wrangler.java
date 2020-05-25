package day53_InterfaceContinue;

public class Jeep_Wrangler implements Cars, GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("Jeep Wrangler pumping gas");
		
	}

	@Override
	public void Start() {
		System.out.println("Jeep Wrangler starting");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Jeep Wrangler self-parking");
		
	}
	
}
