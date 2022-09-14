package calidadsft;
public class Fibonacci {
    public static void main(String[] args) {
        int A=0; 
        int B=1; 
        int i; 
        int l=30; 
        
        while(A+B<=l){
            i=A;
            A=B;
            B=i+A;
            System.out.println(B);
        }
        }
    }

