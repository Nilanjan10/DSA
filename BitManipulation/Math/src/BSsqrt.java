public class BSsqrt {
    public static void main(String[] args) {
        int n = 40;
        int p=3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    static double sqrt(int n,int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        int m = s+(e-s)/2;
        if(m*m == n){
            return m;
        }
        if(m*m>n){
            e=m-1;
        }
        s=m+1;
        double inc=0.1;
        for(int i=0;i<p;i++){
            while (root*root<=n){
                root = root+inc;
            }
            root = root-inc;
            inc /=10;
        }
        return root;
    }
}
