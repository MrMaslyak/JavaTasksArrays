public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        int [] arr = {2, 4, 23, 5, 15, 65, 3, 33, 100};
        HardTask1(arr);
        int[] array = {5,-3,-2,16,55,0};
        HardTask2(array);
        HardTask3();
        System.out.println();
        int[] arrays = {5,-3,-2,16,55,0};
        HardTask4(arrays);
    }
    public static void task1(){
        for (int i = 1; i <= 55 ; i+=2) {
            System.out.print(i + " ");
        }
    }
    public static void task2(){
        for (int i = 90; i >= 1 ; i-=5) {
            System.out.print(i + " ");
        }
    }
    public static void task3(){
        int[] a = new int[20];
        int value = 2;
        for (int i = 0; i < a.length; i++) {
            a[i]=value;
            value*=2;
            int num = a[i];
            System.out.print(num + " ");
        }
    }
    public static void task4(){
        for (int i = -29; i <= 10 ; i++) {
            if (i%5 == 0)
            System.out.print(i + " ");
        }
    }
    public static void task5(){
        int value = 0;
        int countEven = 0;
        for (int i = 50; i <= 150 ; i++) {
            value+=i;
            if (i%2 == 0)
                countEven++;
        }
        System.out.println("Сума чисел від 50 до 150: " + value);
        System.out.println("Кількість парних чисел у діапазоні: " + countEven);
    }
public static void HardTask1(int[] arr){
        int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (max<arr[i]){
          max=arr[i];
      }
    }
    System.out.println(max);
}
public static void HardTask2(int[] array){
        int PositiveSum = 0;
        int PositiveValue = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i]>0){
            PositiveSum += array[i];
            PositiveValue++ ;
        }
    }
    System.out.println("Positive Summa = " + PositiveSum);
    System.out.println("Positive Value = " + PositiveValue);
}
public static void HardTask3(){
        int[] array = new int[11];
        array[0] = 1;
        array[1] = 1;
    for (int i = 2; i < array.length ; i++) {
        array[i]= array[i-1] + array[i-2];
    }
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
public static void HardTask4(int[] arrays){
        int PositiveSum = 0;
        int PositiveValue = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>0){
                PositiveSum += arrays[i];
                PositiveValue++ ;
            }
        }
        System.out.println("Positive Summa = " + PositiveSum);
        System.out.println("Positive Value = " + PositiveValue);
    }
}