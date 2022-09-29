public class Main {
    public static void main(String[] args) {
        int[] arr = {101_000,102_000,103_000,104_000,105_000,106_000,107_000,108_000,109_000,110_000,111_000,112_000,113_000,114_000,115_000,116_000,117_000,118_000,119_000,120_000,121_000,122_000,123_000,124_000,125_000,126_000,127_000,128_000,129_000,130_000};

        //Задача 1
        System.out.println("Задача 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задача 2
        System.out.println();
        System.out.println("Задача 2");
        int minCost = arr[0];
        for (int i : arr)  {
            if (i <= minCost) {
                minCost = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей");
        int maxCost = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCost) {
                maxCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + maxCost + " рублей");

        //Задача 3
        System.out.println();
        System.out.println("Задача 3");
        double average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
 }