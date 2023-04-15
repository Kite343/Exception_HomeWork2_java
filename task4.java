package homeWork2;

import java.util.Scanner;

// Разработайте программу, которая 
// выбросит Exception, 
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, 
// что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        try {
            String str = sc.nextLine();
            if(str.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");
            System.out.println(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally{sc.close();}
        
    }
}
