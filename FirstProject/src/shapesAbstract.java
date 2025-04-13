
public abstract class shapesAbstract {
            abstract  float getArea();
           
            abstract  float getPerimeter();
             
            
	}


	abstract class shapes2D extends shapesAbstract
	{
		float Leangth;
		float Width;
	}
	
	abstract class shapes3D extends shapesAbstract
	{
		
		abstract float getVolume();
		float Radius;
		float Height;
	}
	
	// Have to user get and set
	class Triangle extends shapes2D
	{
		
		int ThirdSide; 
		
		float getArea()
		 {
			float A = Leangth*Width;
			return A;
			 
		 }
		 
		 float getPerimeter()
		 {
			 float P = Leangth +Width +ThirdSide;
			 
			return P;
			 
		 }
		 
		 Triangle(int l,int w,int C) 
			{
			 Leangth= l;	
			 Width = w;
			 ThirdSide = C;
			 
			}
		 
	}
	
	
	
	
	
	
	class Quadilateral extends shapes2D
	{
		 float getArea()
		 {
			return Leangth;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Leangth;
			 
		 }
		 
	}
	
	class Circle extends shapes2D
	{
		 float getArea()
		 {
			return Leangth;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Leangth;
			 
		 }
		 
	}
	
	
	
	class Cuboid extends shapes3D
	{
		 float getArea()
		 {
			return Height;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Height;
			 
		 }
		 
		 float getVolume()
		 {
			return Height;
			 
		 }
		 
	}
	
	
	
	class Sphere extends shapes3D
	{
		 float getArea()
		 {
			return Height;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Height;
			 
		 }
		 
		 float getVolume()
		 {
			return Height;
			 
		 }
		 
	}
	
	
	class Cyllinder extends shapes3D
	{
		 float getArea()
		 {
			return Height;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Height;
			 
		 }
		 
		 float getVolume()
		 {
			 float V = 3.14f*Height*Height*Height;
			return V;
			 
		 }
		 
		 Cyllinder(int r)
		 {
			 Height =r;
		 }
		 
		 
		 
	}
	
	
	class Cone extends shapes3D
	{
		 float getArea()
		 {
			return Height;
			 
		 }
		 
		 float getPerimeter()
		 {
			return Height;
			 
		 }
		 
		 float getVolume()
		 {
			 
			 float V = 3.14f*Radius*Radius*Height/3;
			return V;
			 
		 }
		 
		 Cone(float r,float h)
		 {
			 Height = h;
			 Radius = r;
			 
		 }
		 
		 
	}
	
	