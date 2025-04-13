interface Computers1 {
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

 interface Electronics1 extends Computers1 {
	 
	
 }