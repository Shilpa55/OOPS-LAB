import java.util.Scanner;
class product
{
	int pcode;
	String pname;
	double price;

void setdata(int code,String name,double prc)
{
	pcode=code;
	pname=name;
	price=prc;
}
void getdata()
{
	System.out.print("\nProduct name :"+pname);
	System.out.print("\nProduct code :"+pcode);
	System.out.print("\nProduct price :"+price);
}
void lowprice(product p1,product p2)
{
	if(price<=p1.price && price<=p2.price)
		System.out.println(price+"\nhas the smallest price");
	else if(p1.price<=price && p1.price<=p2.price)
		System.out.println(p1.price+"\nhas the smallest price");
	else
		System.out.println(p2.price+"\nhas the smallest price");
}
}
class javapgm6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int code;
		double price;
		String name;
		product p1=new product();
		product p2=new product();
		product p3=new product();
		System.out.println("enter the details of first product :");
		System.out.println("enter the product name :"); 
		name=sc.nextLine();
		System.out.println("enter the product code :"); 
		code=sc.nextInt();
		System.out.println("enter the product price :"); 
		price=sc.nextDouble();
		p1.setdata(code,name,price);
		System.out.println("enter the details of second product :");
		sc.nextLine();
		System.out.println("enter the product name :"); 
		name=sc.nextLine();
		System.out.println("enter the product code :"); 
		code=sc.nextInt();
		System.out.println("enter the product price :"); 
		price=sc.nextDouble();
		p2.setdata(code,name,price);
		System.out.println("enter the details of third product :");
		sc.nextLine();
		System.out.println("enter the product name :"); 
		name=sc.nextLine();
		System.out.println("enter the product code :"); 
		code=sc.nextInt();
		System.out.println("enter the product price :"); 
		price=sc.nextDouble();
		p3.setdata(code,name,price);
		System.out.println("Product 1");
		p1.getdata();
		System.out.println("\nProduct 2");
		p2.getdata();
		System.out.println("\nProduct 3");
		p3.getdata();
		p1.lowprice(p2,p3);
	}
}




