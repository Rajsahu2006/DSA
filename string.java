package Traning;

public class string {
    static int countLength(String str) {
        if (str.equals("")) return 0;
        return 1 + countLength(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "aljd";
        System.out.println(countLength(str));
    }
    
}
