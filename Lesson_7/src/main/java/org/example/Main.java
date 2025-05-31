package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,1,2,1};
        int l = 0,m = 0;
        int r = arr.length - 1;
        for (int i = 0; i < args.length; i++) {
            switch (arr[m]) {
                case (0) -> {
                    l++;
                    m++;
                }
                case (1) -> {
                    if(arr[m] < arr[l]) {
                        swap(arr,m,l);
                    } else if (arr[r] == 0) {
                        swap(arr,r,m);
                        m++;
                        l++;
                    }
                }
            }
        }
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = arr[temp];
    }
}