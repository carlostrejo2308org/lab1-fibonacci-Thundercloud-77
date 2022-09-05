public class Fibona {

    public static void main(String[] args) {
        System.out.println("Iterativo "+fibo(3));
        System.out.println("Recursivo "+fiboRecursivo(3));
    }
    //Iterativo
    static int fibo(int numero){
        int inicio=0,siguiente=1,rta=0;
        for(int i=1;i<numero;i++){
            rta=inicio+siguiente;
            inicio=siguiente;
            siguiente=rta;
        }
        return rta;
    }
    //Recursivo
    static int fiboRecursivo(int numero){
        if(numero>1){
            return fiboRecursivo(numero-1)+fiboRecursivo(numero-2);
        }else{
            if(numero==1)return 1;
            else return 0;
        }
    }
}
