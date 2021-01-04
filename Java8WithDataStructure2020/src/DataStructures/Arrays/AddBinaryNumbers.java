package DataStructures.Arrays;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0};
        int[] b = {1, 0, 0, 1};

        int[] k = addBN(a, b);
        for (int d : k) {
            System.out.print(d);
        }
    }

    private static int[] addBN(int[] a, int[] b) {
        int carry = 0;
        int[] c = new int[a.length+1];
        for(int i = a.length-1; i >= 0; i--){
           c[i+1] = (a[i] + b[i] + carry) % 2;
           carry = (a[i] + b[i] + carry)/2;
        }
        c[0] = carry;
        return c;
    }
}
