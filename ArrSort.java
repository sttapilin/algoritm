import java.util.Arrays;

public class ArrSort {
      // пузырек
      public static long bubbleSort (int [] arr) {
         long start = System.currentTimeMillis();
         int arraysort [] = arr.clone();
          for (int i = 0; i < arraysort.length - 1; i++) {
              for (int j = 1; j < arraysort.length - i; j++) {
                  if (arraysort [j - 1] > arraysort [j]) {
                      int tmp = arraysort [j];
                      arraysort [j] = arraysort [j - 1];
                      arraysort [j - 1] = tmp;
                  }
              }
          }
          long end = System.currentTimeMillis();
        return end - start;
      }

      // че-то свое
      public static long mySort (int [] arr) {
          long start = System.currentTimeMillis();
          int arraysort [] = arr.clone();
          int min = arraysort [0];
          for (int i = 0; i < arraysort.length - 1; i++) {
              min = arraysort [i];
                for (int j = i + 1; j < arraysort.length; j++) {
                    if (arraysort [j] < min) {
                        min = arraysort [j];
                        arraysort [j] = arraysort[i];
                        arraysort [i] = min;
                    }
                }
          }
          long end = System.currentTimeMillis();
        return end - start;
      }

      // стандартный
      public static long arrSort (int [] arr) {
          long start = System.currentTimeMillis();
          Arrays.sort(arr);
          long end = System.currentTimeMillis();
       return end - start;
      }

      //quicksort
      public static void quickSort (int [] arr, int low, int high) {
          //границы массива
          if (low >= high)
              return;
          // опорный элемент медиана
          int middle = arr[low + (high - low) / 2];
          // деление на подмассивы, больше и меньше медианы
          int i = low, j = high;
          while (i <= j) {
              while (arr[i] < middle) {
                  i++;
              }
              while (arr[j] > middle) {
                  j--;
              }
              if (i <= j) {//меняем местами
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  i++;
                  j--;
              }
          }
          // вызов рекурсии для сортировки левой и правой части
          if (low < j)
              quickSort(arr, low, j);
          if (high > i)
              quickSort(arr, i, high);
      }

// для поверки сортировки можно вставить этот код в любой метод, кроме quick (рекурсия!)
/*  for (int k = 0; k < arr.length; k++) {
        if (k % 100 == 0) {
            System.out.println(" ");
        }
        System.out.print(" " + arr[k]);
    }*/
}
