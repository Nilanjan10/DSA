public class PrintFirst {
    public static void main(String[] args){
       // String s = "Hello User!! welcome";
       // String st = "   Hello User!! welcome";
        String str = "  Hello   User!!   welcome  ";

        char a[] = str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i] != ' ' && (i==0 || a[i-1] == ' ')){
                System.out.println(a[i]);
            }
        }
    }
}
