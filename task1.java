package homeWork2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя 
// ввод дробного числа (типа float), и 
// возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

// осторожно, через 10 попыток возвращает null

public class task1 {
    public static void main(String[] args) {
        
        System.out.printf("Введенное число равно %.3f\n", inputFloat());
    }

    public static Float inputFloat() {
        Float num = null;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Введите дробное число: ");
            try {
                num = Float.parseFloat(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число");
            } finally{
                count++;
                if (count == 10){flag = false;}
            }
        }
        sc.close();
        return num;
    }
}
