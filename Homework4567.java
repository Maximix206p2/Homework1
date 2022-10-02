public class Homework4567 {
    public static void main(String[] args) {
        /*
        4. Дано трехзначное число. Заменить в нём вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        6. Дано трехзначное число. Определить, является ли его число десятков четным числом.
        7. Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        */

            //fourth exercise
        int a1 = 989;
        int tens = a1 / 10 % 10;
        a1 = -(tens % 2 * 10) + 10 + a1;
        System.out.println(a1);

            //fifth exercise
        int a2 = 917;
        if (a2 % 10 > a2 / 100) {
            a2 = (a2 % 10 - a2 / 100) * 100 + a2;
        }
        else {
            a2 = (a2 / 100 - a2 % 10) + a2;
        }
        System.out.println(a2);

            //sixth exercise
        int a3 = 623;
        int tens2 = (a3 / 10 % 10);
        boolean evenNumber = tens2 % 2 == 0;
        if (evenNumber == true) {
            System.out.println("число " + tens2 + " является чётным");
        }
        else {
            System.out.println("число " + tens2 + " не является чётным");
        }

            //seventh exercise
        int a = 273;
        int hundreds = a / 100;
        boolean oddNumber = hundreds % 2 == 1;
        if (oddNumber == true) {
            System.out.println("число " + hundreds + " является нечётным");
        }
        else {
            System.out.println("число " + hundreds + " не является нечётным");
        }
    }
}
