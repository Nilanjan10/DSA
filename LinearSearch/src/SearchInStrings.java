public class SearchInStrings {
    public static void main(String[] args) {
        String name = "NILANJAN";
        char c = 'I';
        System.out.println(search(name,c));
    }
    static boolean search(String name,char c) {

        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (c == name.charAt(i))
                return true;
        }
        return false;
    }
}
