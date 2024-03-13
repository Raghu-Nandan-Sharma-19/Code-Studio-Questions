import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        java.util.Scanner in = new Scanner(System.in);
        char character=in.next().charAt(0);
        if(character>='a' && character<='z') {
            System.out.println("0");
        } else if(character>='A' && character<='Z') {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
    }
}
