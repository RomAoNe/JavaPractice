package LivecodingRunUp;

public class Task6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4, 5};
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i > j) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[j];
            }
        }
    }
}
