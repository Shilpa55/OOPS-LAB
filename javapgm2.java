class Rectangle
{
	float length;
	float breadth;
	void setdata(float a,float b)
	{
		length=a;
		breadth=b;
	}
	float getArea()
	{
		return length*breadth;
	}
}
class javapgm2
{
	public static void main(String args[])
	{
		Rectangle R1=new Rectangle();
		R1.setdata(12.4f,13f);
		float area=R1.getArea();
		System.out.print("Area of Rectangle R1 :" +area);
		Rectangle R2=new Rectangle();
		R2.setdata(10.5f,9f);
		float area1=R2.getArea();
		System.out.print("\nArea of Rectangle R2 :" +area1);
		Rectangle R3=new Rectangle();
		R3.setdata(13f,14f);
		float area2=R3.getArea();
		System.out.print("\nArea of Rectangle R3 :" +area2);
	}
}	