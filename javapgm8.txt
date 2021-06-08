class CPU
{
	float price;
	RAM rob;
	Processor pob;
CPU(float p,String rammemory,String ramman,String pman,String pcore)
{
	price=p;
	rob=new RAM(rammemory,ramman);
	pob=new Processor(pcore,pman);
	
}
static class RAM
{
	String ramman;
	String rammemory;
	RAM(String rammemory,String ramman)
	{
		this.ramman=ramman;
		this.rammemory=rammemory;
	}
	void rdisplay()
	{
		System.out.println("RAM Memory = " + rammemory);
		System.out.println("RAM Manufacturer = " + ramman);
	}
	
}
class Processor
{
	String pcore;
	String pman;
	Processor(String pcore,String pman)
	{
		this.pcore=pcore;
		this.pman=pman;
	}
	void pdisplay()
	{
		System.out.println("Processor Core = " + pcore);
		System.out.println("Processor Manufacturer = " + pman);
	}
	

}
void display()
{
	System.out.println("CPU Price =" +price);
	rob.rdisplay();
	pob.pdisplay();
}	
}
class javapgm8
{
	public static void main(String args[])
	{
		CPU c=new CPU(1200,"30 GB","Rammanufacturer","I7","2");
		c.display();
		
	}
}

