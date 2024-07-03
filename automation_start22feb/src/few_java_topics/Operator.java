package few_java_topics;

public class Operator {

	public static void main(String[] args) {
		
	System.out.println("Arithmetic operator");
	System.out.println("---------------------------");
	
    byte a=10;
    int b=20;
    int c=a+b;
    System.out.println(c);
    
    short d=40;
    long l=100;
    
    System.out.println(d-l);
    System.out.println(d*b);
    
    //Division : Returns the division quotient
    System.out.println(b/l);
    
    //Modulus (%) returns the division remainder 
    System.out.println(b%a);
    
    //Increment (++): Increase the value of variable by 1
    System.out.println(++d);
    
  //Decrement (--): Decrease the value of variable by 1
    System.out.println(--l);
    
    //Assignment operator: used to assign values to variables
    System.out.println("Assignment Operator");

    System.out.println("---------------------------");
    
    byte ab=25;
    System.out.println("The value of cd is  : "+ (ab-5));
    int jy=95;
    int xy=(jy+5);
    System.out.println(xy);
     
    System.out.println("Comparison operator");
	System.out.println("---------------------------");

  // Java comparison operator:used to compare values:return value is true or false known as boolean values
  //Operator(== equal to, !=  Not equal, > greater than,>= greater than or equal to, <less than, <= less than equal to)

  long m=250;
  long n=125;
  int p=90;
  
  boolean o =(m==n);
  System.out.println(o);
  
  boolean i=(p!=n);
  System.out.println(i);
  
  System.out.println(p>n);
  System.out.println(m>=n);
  System.out.println(p<n);
  
  System.out.println(p<=100);
  
  System.out.println("Logical operator");
  System.out.println("----------------------------");
  
  //Operators: (logical and &&, logical or ||, logical not !)
  
  int u=50;
  int y=40;
  byte r=30;
  //True false hence output is false in logical and
  System.out.println(u>y&&y<r);
  
  //True True hence output is true in logical and
  boolean z=u>r&&r<y;
  System.out.println(z);
  
  // False true hence output is true in logical or
  System.out.println(u>=r||r<u);

  //False false hence output is false in logical or
  
  boolean R= r>u||y>u;
  System.out.println(R);
  
  //Logical not ! reverse the output
  System.out.println(!(r!=30));
  
  boolean q=!(r<y);
  System.out.println(q);
  
  }
	}
  

