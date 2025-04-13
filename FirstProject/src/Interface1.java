
 interface Computers {
	 final int MonitorSize = 10;
	 	void OparatingSystem();
	 	void Compiler();
	 	void processor();
	 	void InstallSoftware();
	 	void unInstallSoftware();
	 	void SwitchOn();
	 	void ShutDown();
	 	void Restart();
	 	
	 	default void myMethod() {
	 		System.out.println("Defaultn from interface");
	 	}
}

 interface Electronics {
	 final int MonitorSize =50;
	 	void OparatingSystem();
	 	void CPU();
	 	void Monitor();
 }
 
 
class Desktop implements Computers,Electronics
 {

	@Override
	public void OparatingSystem() {
		System.out.println(Electronics.MonitorSize);
		
	}

	@Override
	public void Compiler() {
		System.out.println("Desktop");
		
	}

	@Override
	public void processor() {
		System.out.println("Desktop");
		
	}

	@Override
	public void InstallSoftware() {
		System.out.println("Desktop");
		
	}

	@Override
	public void unInstallSoftware() {
		System.out.println("Desktop");
		
	}

	@Override
	public void SwitchOn() {
		System.out.println("Desktop");
		
	}

	@Override
	public void ShutDown() {
		System.out.println("Desktop");
		
	}

	@Override
	public void Restart() {
		System.out.println("Desktop");
		
	}

	@Override
	public void CPU() {
		
		
	}

	@Override
	public void Monitor() {
		
		
	}
	
	public void myMethod()
	{
	}
	 
 }
 
 public class Interface1 {

		public static void main(String[] args) {
 
			//Computers Computer = new Computers();
			Computers Comp = new Desktop();
			Comp.Compiler();
			Comp.SwitchOn();
			Comp.OparatingSystem();
			Comp.myMethod();
		}
 }