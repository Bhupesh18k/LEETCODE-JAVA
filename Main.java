import java.util.*;
public class Main {
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int[] fsh = mergeSort(arr, lo, mid);
        int[] ssh = mergeSort(arr, mid + 1, hi);

        int[] fsa = mergeTwoSortedArrays(fsh, ssh);
        return fsa;
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
    public static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] sa = mergeSort(arr, 0, arr.length - 1);
        print(sa);
        scn.close();
    }
}