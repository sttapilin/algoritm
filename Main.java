import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] array = new int [100000];

        // заполнение массива случайными числами до 100 000
        for (int i = 0; i < array.length; i++){
           array [i] = rnd.nextInt(1000) +1;
        }

        // пузырек
        ArrSort.bubbleSort(array);
        System.out.println("Время сортировки алгоритма \"пузырек\": " + ArrSort.bubbleSort(array));
        
        // че-то сам придумал
        System.out.println("Время сортировки моего алгоритма: " + ArrSort.mySort(array));
        
        // квик сорт
        System.out.println("Время сортировки стандартной функции: " + ArrSort.arrSort(array));
        // поскольку рекурсия замер времени внутри метода не работает. ну по крайней мере у меня ) 
        long start = System.currentTimeMillis();
        ArrSort.quickSort(array,0, array.length -1);
        long end = System.currentTimeMillis();
        System.out.println("Время сортировки QuickSort: " + (end - start));
       
        /* для печати сгенерированного массива
       System.out.println("");
        int i = 0;
        for (int s : array) {

            if (i%50 == 0) {
                System.out.println("");
            }
            System.out.print(s +" ");
            i++;
        }*/


    }

}
