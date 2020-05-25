package day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles{
	
	@Override
	public void Start() {
		System.out.println("Tesla starting");
	}
	
	@Override
	public void Charge() {
		System.out.println("Tesla charging");
	}
	
	@Override
	public void SelfDrive() {
		System.out.println("Tesla self-driving");
	}

	@Override
	public void Fly() {
		System.out.println("Tesla flying");
		
	}
	
}
