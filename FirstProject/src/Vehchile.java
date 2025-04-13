
public class Vehchile {

	int NoOfwheels ;
	int HPEngine;
	int Maxspeed;
	String BrandName;
	boolean CruiseControl;
	
	public static void main(String[] args) 
	{
		Bicycle bicycle = new Bicycle(2,0,50,"atlas",false);
		bicycle.DisplayBicycle();
		
		
		MountainBycycle mountainBycycle = new MountainBycycle(2,false);
		mountainBycycle.DisplayBicycle();
		mountainBycycle.extraInfo();
	}


Vehchile(int W, int P,int Max,String BN,boolean C) 
{	
	NoOfwheels=W;
	HPEngine =P;
	Maxspeed = Max;
	BrandName =BN;
	CruiseControl = C;
	
}


}
class Bicycle extends Vehchile
{
	int gear;
	boolean elctric;
	
	//	super(2,0,50,"atlas",false);
		
				
	
	
		 Bicycle(int Wh,int Po,int Mx,String Bn,boolean Cr)
		 {
			 super(2,0,50,"atlas",false);
			 this.gear =0;
			 this.elctric=false;
		 }
		 
		 void DisplayBicycle()
		 {
			 System.out.println(NoOfwheels);
			 System.out.println(HPEngine);
			 System.out.println(Maxspeed);
			 System.out.println(BrandName);
			 System.out.println(CruiseControl); 
		 }
		void extraInfo()
		{
			
			 System.out.println(gear);
			 System.out.println(elctric);
		}

}

class MountainBycycle extends Bicycle
{
	MountainBycycle(int G,boolean El)
	{	
		 super(2,0,50,"atlas",false);
		 gear=G;
		 elctric = El;
	}
	
	
}



	







