import java.util.*;

public class LineComparison
{
    // here we create main method in which we call our two main function
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        // here we declear all 4 arrays 
        double[]arr1=new double[2];  // Line 1 start (x1 y1)
        double[]arr2=new double[2];  // Line 1 end (x2 y2)
        double[]arr3=new double[2];  // Line 2 start (x3 y3)
        double[]arr4=new double[2];  // Line 2 end (x4 y4)
        
        // Line 1 ke coordinates input le rahe hain
        System.out.println("Enter Line 1 Start (x1 y1):");
        arr1[0] = sc.nextDouble(); arr1[1] = sc.nextDouble();
        System.out.println("Enter Line 1 End (x2 y2):");
        arr2[0] = sc.nextDouble(); arr2[1] = sc.nextDouble();

        // Line 2 ke coordinates input le rahe hain
        System.out.println("Enter Line 2 Start (x3 y3):");
        arr3[0] = sc.nextDouble(); arr3[1] = sc.nextDouble();
        System.out.println("Enter Line 2 End (x4 y4):");
        arr4[0] = sc.nextDouble(); arr4[1] = sc.nextDouble();
        
        // Dono lines ki length calculate kar li
        double l1 = LineLength(arr1, arr2);
        double l2 = LineLength(arr3, arr4);

        // Results section start
         System.out.println("\n----------------------- Results------------------------");
        checkEquals(arr1, arr2, arr3, arr4); // UC 2 check - equality check
        comparisonOfLne(l1, l2);             // UC 3 check - comparison
    }
    
    // this function is used to calculate the length of the line
    public static double LineLength(double[]arr1,double[]arr2)
    {
        return  Math.sqrt(
        Math.pow(arr2[0] - arr1[0], 2) +
        Math.pow(arr2[1] - arr1[1], 2));
    }
    
    // this function is check weather these two lines is equal or not
    public static void checkEquals(double[]arr1,double[]arr2,double[]arr3,double[]arr4)
    {
        double length1=LineLength(arr1,arr2);
        double length2=LineLength(arr3,arr4);
        if(length1==length2)
        {
            System.out.println("these two lines are exactly equals");
        }
        else
        {
            System.out.println("these two lines are not equals");
        }
    }
    
    // in this function we compare two lines
    public static void comparisonOfLne(double length1, double length2)            
    {
        double l1 = length1;
        double l2 = length2;
        int result = Double.compare(l1, l2);
        if (result == 0) 
        {
            System.out.println("both lines are equal.");
        } 
        else if (result > 0) {
            System.out.println("line 1 is larger than line 2");
        }
        else {
            System.out.println("line 2 is larger than line 1");
        }
    }
}
