public class Rev {
    public static void main(String[] args) {
        String s="My name is Nil";
        int start=0;int end=s.length()-1;
        char ch[] = s.toCharArray();
        
        while(start<end){
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;

            start++;
            end--;
        }
        for(int i=0;i<s.length();i++){
            System.out.print(ch[i]);
        }
    }
}
