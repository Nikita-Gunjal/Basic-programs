public class Funpractice {
   /* public static int product(int a ,int b){
        int product= a*b;
        return product;
    
    }    
    public static void main(String[]args){
        int a=3;
        int b=5;
        int mul= product(a,b);
        System.out.println(mul);


    }*/

    
        

   /* FACTORIAL OF GIVEN NUMBER
   public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    

    public static void main(String[]args){
        System.out.println(fact(4));

    }*/

    //BINOMIAL COEFICIENT


    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }
        return f;
    }
    public static int binomial(int n ,int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
    public static void main(String[]args){
        System.out.println(binomial(5,2));


    }
    
}
