package Agile.Software.Testing.LeanTesting;

/**
 * Hello world!
 *
 */
public class MainClass 
{
    public static void main(String[] args)
    {
    	  //defining an 'age' variable  
        int age=20;  
        //checking the age  
        if(age>18){  
            System.out.print("Age is greater than 18\n"); 
            
        } 
        
        //A6 class with implemented interface from printable
        A6 obj = new A6();  
        obj.print();
        
        //Recursion class
        //Recursion A = new Recursion();
        //System.out.println("Factorial of 5 is: "+A.factorial(5)); 
        
        //method
        
        int num_1 = 8;
        findEvenOdd(num_1);
        int num_2 = 9;
        findEvenOdd(num_2);
        
        //PrintArray
        PrintArray B = new PrintArray();
        int a[]=new int[5];//declaration and instantiation  
        a[0]=10;//initialization  
        a[1]=20;  
        a[2]=70;  
        a[3]=40;  
        a[4]=50; 
        B.print(a);
        
        //Student
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  
        s2.display();
        
        //Math
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x)); 
        
        
    }
    
  //user defined method  
    public static void findEvenOdd(int num)  
    {  
    //method body  
    if(num%2==0)   
    System.out.println(num+" is even");   
    else   
    System.out.println(num+" is odd");  
    }  
}


