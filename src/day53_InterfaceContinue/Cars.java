package day53_InterfaceContinue;

/**
Warmup:
    create an interface called Cars
            Actions: Start()
    create an interface called ElectricVehicles
            Actions: Charge()
                     SelfDrive()
    create an interface called GasVehicles
            Actions: PumpGas()
    create classes:
            1. Tesla_Model3: 
                    implement Cars and  ElectricVehicles Interfaces
            2. Jeep_wrangler: 
                    implement Cars and GasVehicles Interfaces
            3. ToyotaHybird:
                    implement Cars, GasVehicles, and  ElectricVehicles Interfaces
 */

/*
 Interface review:
 
 Interface: Used for achieving abstraction
 			We can store only abstract methods (plus static and default methods).
 			Meant to be implemented.
 			A class can implement multiple interfaces.
 			
 Interface can have:
 		Methods: Abstract, static, and default methods
 				public abstract void method();
 				public void method(); 
 				(Abstract given automatically)
 		Variables: public static final (automatically)
 		
 Interface cannot have:
 		Methods: Constructor, Instance
 		Variables: Instance
 		Blocks: neither static nor instance initializer block
 		 		Static: Because variables are final
 		 		Instance: No instance variables (no objects)
 		 		
 Restrictions of abstract method:
  		Cannot have body
  		Cannot have private access-modifier
  		Cannot have static, final
 
 */
public interface Cars {
	
	public abstract void Start();

}
