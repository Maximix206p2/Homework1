public class Homework123 {
    public static void main(String[] args) {
        /*
        1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        3. Дано трехзначное число. Вывести число, полученное при переста¬новке цифр сотен и десятков исходного числа (например,
        123 перейдет в 213).
         */

            //first exercise
        //1st method
        int a1 = 123;
        int hundreds1 = a1 / 100;
        int tens1 = a1 / 10 % 10;
        int ones1 = a1 % 10;
        //System.out.printf("hundreds: %d, tens: %d, ones: %d", hundreds, tens, ones); - если выводить текстом
        int b1 = ones1 * 100 + tens1 * 10 + hundreds1;
        System.out.println(b1);
    //
        //2nd method
        String s = Integer.toString(a1);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        b1 = Integer.parseInt(sb.toString());
        System.out.println(sb);

            //second exercise
        //1st method
        int a2 = 234;
        int dig1 = a2 / 100;
        a2 = a2 % 100 * 10 + dig1;
        System.out.println(a2);

            //third exercise
        int a3 = 345;
        int hundreds2 = a3 / 100;
        int tens2 = a3 / 10 % 10;
        int b3 = a3 % 10 + hundreds2 * 10 + tens2 * 100;
        System.out.println(b3);
    }
}