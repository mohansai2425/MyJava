public class Prime {
    public static void main(String[] args) {
        int n=8;
        boolean flag=true;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("not prime");
                flag=false;
                break;
            }

        }
        if(flag) System.out.println("prime");


    }
}
