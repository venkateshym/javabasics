public class fibonnacci {
   // private static Supplier<ICustomReport> extentReport = GenerateCustomReport::new;

   static int fibonnaci(int n){
    int a=0, b=1, c; 
    if(n==0)
    return a; 
    for(int i=2; i<=n; i++){
        c= a+b; 
        a=b;
        b=c;
    }
    return b; 
   }

    public static void main(String[] args){
        int n = 10;
        System.out.println("Fibonacci series of " + n + " numbers: ");
        for(int i=0; i<=n; i++){
            System.out.print(fibonnaci(i) + " ");
        }
       
    }

}
