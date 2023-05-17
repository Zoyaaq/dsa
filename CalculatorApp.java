import java.util.*;

  
    
        //Scanner one = new Scanner(System.in);
        //System.out.println("your first number?");
        /*int button1= one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("your second number?");
        int button2= two.nextInt();

        System.out.println("Choose from 1,2,3,4, for add, subtract, multiply, divide respectively");
        Scanner op = new Scanner(System.in);
        int result = op.nextInt();

        switch(result){
            case 1:
            System.out.println("you have chosen addition");
            result= button1+button2;
            System.out.println(result);
            break;

            case 2:
            System.out.println("you have chosen subtraction");
            result= button1-button2;
            System.out.println(result);
            break;

            case 3:
            System.out.println("you have chosen multiply");
            result= button1*button2;
            System.out.println(result);
            break;

            case 4:
            System.out.println("you have chosen division");
            result= button1/button2;
            System.out.println(result);
            break;

            default:
            System.out.println("the calculator is crazy");
        }*/

        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<=n;i++){

            sum=sum+i;
            

        }
        System.out.println(sum);
        }*/

        
        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int a= sc.nextInt();
        sc.close();

        int mul=0;

        

        for(int i=1; i<11; i++){
            mul=(i*a);
            System.out.println(mul);

        }*/
        //solid rectangle
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }*/
        
        //hollow rectangle
        /*int n=4;
        int m=5;
        for(int i=1; i<=4;i++){

            for(int j=1;j<=5;j++){

                if(i==1 || j ==1 || i==n || j ==m){
                    System.out.print("*");
                }
                   
                else{
                    System.out.print(" "); 
                }

            
            }
            System.out.println();  
        }
    }
    
}
        //half pyramid
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();  
        }*/
        /*int n=4;
        for(int i=1; i<=n;i++){

            for(int j=1;j<=n-i;j++)

                {
                    System.out.print(" "); 
                   }
       
            for(int q=1;q<=i;q++)
                   {
                       System.out.print("*");
                   }


                   System.out.println();
            }*/
            
        

    public class CalculatorApp{
        
        public static void myFactorial(int n){ 
            if(n<0) {
                System.out.println("INVALID");
                return;

            }
            int fact =1;
            for(int i=n;i>=1;i--)  {
                fact=i*fact;
                
            }
            System.out.print(fact);
        return;
        }
    
    public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    

    sc.close();
    myFactorial(a);

    


    
    
    }

    }
    
       
        
    
    
    
        

