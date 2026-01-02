/* Find the first occurrence of a target element in an array */
public class FirstOccurence {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 3, 12};
        int n = arr.length;
        int tar = 3;
        int firstocc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == tar) {
                firstocc = i;
                break;
            }
        }
        System.out.println("first occ:" + firstocc);
    }
}
