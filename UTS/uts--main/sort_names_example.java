/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2nd_Semester;

/**
 *
 * @author ACER
 */
public class sort_names_example {

    // Insertion Sort
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Fungsi cetak array
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array dengan 7 nama orang
        String[] names = {"Hagia", "El", "Axan", "Kymy", "Aslan", "Ayana", "Valerie"};

        System.out.println("Array asli:");
        printArray(names);

        // Clone array supaya tiap metode sort punya array sendiri
        String[] namesInsertion = names.clone();
        String[] namesSelection = names.clone();
        String[] namesBubble = names.clone();

        // Insertion Sort
        insertionSort(namesInsertion);
        System.out.println("Setelah Insertion Sort:");
        printArray(namesInsertion);

        // Selection Sort
        selectionSort(namesSelection);
        System.out.println("Setelah Selection Sort:");
        printArray(namesSelection);

        // Bubble Sort
        bubbleSort(namesBubble);
        System.out.println("Setelah Bubble Sort:");
        printArray(namesBubble);
    }
}

