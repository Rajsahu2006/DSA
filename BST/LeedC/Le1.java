package BST.LeedC;

import org.w3c.dom.Node;

// insert the num
public class Le1 {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6};
        int target = 5;

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } 
            else if (num[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }

        System.out.println("Not found");
    }
}

