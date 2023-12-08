package Hometask3;
import java.util.Arrays;
public class Task2<T> {

    private T[] array;
    private T[] array1;
    Object[] initialArray = {};

    public Task2() {
        this.array = (T[]) initialArray;
        this.array1 = (T[]) initialArray;
    }

    boolean compare(T[] array, T[] array1) {
        if (array.length != array1.length) {
            return false;
        }
        if (!Arrays.equals(array, array1)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Task2<Number> task2 = new Task2();

        Number[] arr = new Number[3];
        arr[0] = 1;
        arr[1] = 2.0f;
        arr[2] = 29384759823476L;
        System.out.println(Arrays.toString(arr));

        Number[] arr1 = new Number[3];
        arr1[0] = 1;
        arr1[1] = 2.0f;
        arr1[2] = 29384759823476L;
        System.out.println(Arrays.toString(arr1));

        System.out.println(task2.compare(arr1, arr));

    }
}
