public class ReplaceCh {
    public static void main(String[] args) {
        String s = "Hello Everyone Welcome to Oman";
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='o' || ch[i]=='O'){
                ch[i]='K';
            }
        }
        System.out.println(ch);
        //another way
        System.out.println(s.replace('e', 'p'));
    }
    
}
