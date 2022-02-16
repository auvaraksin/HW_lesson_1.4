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
    int fridayDate = 3;
    for (i = fridayDate; i <= 31; i += 7) {
        if (i == fridayDate) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
            fridayDate = fridayDate + 7;
        }
    }
    //task 3
    System.out.println("Задание 3");
    int currentYear = 2022;
    for (int begin = currentYear - 200; begin <= currentYear + 100; begin++) {
        if (begin % 79 == 0) {
            System.out.println(begin);
        }
    }
    //task 4
    System.out.println("Задание 4");
    for (i = 1; i <= 30; i++) {
        if ((i % 3 != 0) && (i % 5 !=0)) {
            System.out.println(i + ":");
        }
        if ((i % 3 == 0) && (i % 5 != 0)) {
            System.out.println(i + ": ping");
        }
        if ((i % 3 != 0) && (i % 5 == 0)) {
            System.out.println(i + ": pong");
        }
        if ((i % 3 == 0) && (i % 5 == 0)) {
            System.out.println(i + ": ping pong");
        }
    }
    //task 5
    System.out.println("Задание 5");
    int first = 0;
    int second = 1;
    int third = first + second;
    for (i = 1; i < 10; i++) {
        if (i == 1) {
            System.out.print(first + " " + second + " ");
        }
        else {
            System.out.print(third + " ");
        }
        third = first + second;
        first = second;
        second = third;
    }
    //task 6
    System.out.println();
    System.out.println("Задание 6");
    int age = 19;
    float salary = 58_000f;
    float coef1 = 0f;
    float coef2 = 1.0f;
    if (age >= 23) {
        coef1 = 3.0f;
        }
    else {
        coef1 = 2.0f;
    }
    if (salary < 50_000) {
        coef2 = 1.0f;
    }
    if ((salary >= 50_000) && (salary < 80_000)) {
        coef2 = 1.2f;
    }
    if (salary >= 80_000) {
        coef2 = 1.5f;
    }
    System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * coef1 * coef2) + " рублей");
    //task 7
    System.out.println("Задание 7");
    age = 25;
    salary = 60_000;
    float wantedSum = 330_000f;
    float baseRate = 10f;
    float rate = baseRate;
    float montlyPayment;
    float montlyRatePayment;
    float monthlyFee;
    boolean isSalaryEnough;
    if (age < 23) {
        rate = baseRate + 1f;
    }
    if ((age >= 23) && (age < 30)) {
        rate = baseRate + 0.5f;
    }
    if (salary > 80_000) {
        rate = rate - 0.7f;
    }
    montlyPayment = wantedSum / 12;
    montlyRatePayment = ((wantedSum / 12) * rate / 100);
    monthlyFee = montlyPayment + montlyRatePayment ;
    if ((salary / 2) >= monthlyFee) {
        isSalaryEnough = true;
    }
    else {
        isSalaryEnough = false;
    }
    System.out.println("Ежемесячная зарплата " + salary + " рублей");
    System.out.println("Сумма кредита " + wantedSum + " рублей");
    System.out.println("Срок кредитования 12 месяцев");
    System.out.println("Ставка по кредиту " + rate + " %");
    System.out.println("Ежемесячный платеж по основному долгу " + montlyPayment + " рублей");
    System.out.println("Ежемесячный платеж по процентам " + montlyRatePayment + " рублей");
    System.out.println("Ежемесячный платеж по кредиту " + monthlyFee + " рублей");
    System.out.println("Максимально допустимая величина платежа согласно ежемесячному доходу может быть " + (salary / 2) + " рублей");
    if (isSalaryEnough) {
        System.out.println("Вы соответствуюте критериям по условиям кредитования. Кредит одобрен. Ежемесячный платеж по кредиту составит " + monthlyFee + " рублей");
    }
    else {
        System.out.println("Вы не соответствуюте критериям по условиям уредитования. В кредите отказано");
    }
    }
}
