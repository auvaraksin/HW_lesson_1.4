package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // task 1
    System.out.println("Задание 1");
    int i = 1;
    while (i <= 10) {
        System.out.print(i + " ");
        i++;
    }
        System.out.println();
    for (i = 10; i != 0; i--) {
        System.out.print(i + " ");
    }
    //task 2
    System.out.println();
    System.out.println("Задание 2");
    int fridayDate = 6;
    for (i = 1; i <= 31; i++) {
        if (i == fridayDate) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            fridayDate = fridayDate + 7;
        }
    }
    System.out.println("Задание 3");
    int currentYear = 2022;
    for (int begin = currentYear - 200; begin <= currentYear + 100; begin++) {
        if (begin % 79 == 0) {
            System.out.println(begin);
        }
    }
    }
}
