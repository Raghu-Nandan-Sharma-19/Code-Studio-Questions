// Question link : https://www.codingninjas.com/studio/problems/n-2-forest_6570178?leftPanelTabValue=PROBLEM
public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
