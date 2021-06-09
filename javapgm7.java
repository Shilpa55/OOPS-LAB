import java.util.Scanner;
class complex
{ 
	double real;
	double imag;
complex()
{
	real=0.0;
	imag=0.0;
}
public complex(double rp)
{
	real=rp;
	imag=0.0;
}
public complex(double rp,double ip)
{
	real=rp;
	imag=ip;
}
public double getReal()
{
	return real;
}
public double getImag()
{
	return imag;
}
public void setReal(double rp)
{
	real=rp;
}
public void setImag(double ip)
{
	imag=ip;
}
public complex plus(complex c)
{
	complex sum=new complex(real + c.real,imag + c.imag);
	return sum;
}
void getcomplex()
{
	System.out.println("("+real+" + "+imag+"i)");
}
}
class javapgm7
{
	public static void main(String args[])
	{
		double rp,ip;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first complex number(real,imag):");
		rp=sc.nextDouble();
		ip=sc.nextDouble();
		complex c1=new complex(rp,ip);
		System.out.println("Enter the second complex number(real,imag):");
		rp=sc.nextDouble();
		ip=sc.nextDouble();
		complex c2=new complex(rp,ip);
		complex sum=new complex();
		sum=c1.plus(c2);
		System.out.println("Sum of complex number is :");
		c1.getcomplex();
		System.out.print("+");
		c2.getcomplex();
		System.out.print("=");
		sum.getcomplex();
		
	}
}
	
 