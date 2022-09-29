public class Main {
    public static void main(String[] args) {
        //Циклы часть 2
        //task1 С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        // при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        int payment = 15000;
        float total = 0;
        int i = 0;
        while (total < 2459000) {
            total = (float) (total + total * 0.12);
            total = total + payment;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений " + total + " руб.");
        }
        System.out.println("Итого потребуется " + i + " месяца.");
        System.out.println();
        //task2 Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        //task3 В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        // что показатели рождаемости и смертности постоянны.
        int people = 12_000_000;
        int born = people / 1000 * 17;
        int died = people / 1000 * 8;
        int b = 0;
        while (b < 10) {
            b = b + 1;
            people = people + born - died;
            System.out.println("Год " + b + ". Численность населения составляет " + people + " чел.");
        }
        System.out.println();
        // task4 Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
        // а всегда равен 7%.
        int month = 0;
        int deposit = 15000;
        int sum = 0;
        while (sum < 12_000_000) {
            month = month + 1;
            sum = sum + sum / 100 * 7;
            sum = sum + deposit;
            //System.out.println("Месяц "+month+". Сумма накоплений - "+sum+" руб.");
            //task5 Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
            // а только каждый шестой.
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений - " + sum + " руб.");
            }
        }
        System.out.println();
        //task6 Напишите программу, которая будет выводить Василию сумму его накоплений
        // за следующие каждые полгода в течение 9 лет.
        while (month < 108) {
            month = month + 1;
            sum = sum + sum / 100 * 7;
            sum = sum + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений - " + sum + " руб.");
            }
            System.out.println();
            //task7 Нам нужно написать программу, которая считает дни месяца по датам,
            // определяет, какой день пятница, и выводит сообщение с напоминанием,
            // что нужно подготовить еженедельный отчет.
            int d = 3;// номер первой пятницы в месяце.
            while (d <= 31) {
                if ((d - 3) % 7 == 0) {
                    System.out.println("Сегодня пятница, " + d + "-е число. Время накидаться))");
                }
                d = d + 1;
            }
            System.out.println();
        }
        //task8 АСТРОНОМИЧЕСКОЕ
        int period = 79;
        int startYear = 1822;
        int finishYear = 2122;
        int year = 0;
        System.out.println("Годы пролета кометы:");
        while (year <= finishYear) {
            year = year + period;
            if (year >= startYear && year <= finishYear) {
                System.out.println(year);
            }
        }
        System.out.println();
        //task9 Таблица умножения на 2
        int f = 2;
        int g = 1;
        int productOfNumbers = 0;
        while (g <= 10) {
            productOfNumbers = f * g;
            System.out.println(f + "*" + g + "=" + productOfNumbers);
            g = g + 1;
        }
    }
}