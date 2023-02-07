public class Main {
    public static void main(String args []) {
System.out.println("Lesson 3");
        System.out.println("-----------------------------------------");
        System.out.println("Task 1");
        System.out.println("-----------------------------------------");
    int a = 0;
        while (a < 10) {
        a++;
        System.out.print(a+ " ");
    }
        System.out.println();
        for (a = 10; a > 0; a--) {
        System.out.print(a+ " ");
    }
        System.out.println("Lesson 3");
        System.out.println("-----------------------------------------");
        System.out.println("Task 2");
        System.out.println("-----------------------------------------");
    int friday = 7;
        for (a=friday; a<31;a++) {
        if (friday + 7 == a) {
            System.out.println("Сегодня пятница," + a + "-е число. Необходимо подготовить отчет");
        } else if (friday + 14 == a) {
            System.out.println("Сегодня пятница," + a + "-е число. Необходимо подготовить отчет");
        } else if (friday + 21 == a) {
            System.out.println("Сегодня пятница," + a + "-е число. Необходимо подготовить отчет");
        } else if (friday + 28 == a) {
            System.out.println("Сегодня пятница," + a + "-е число. Необходимо подготовить отчет");
        }
    }
        System.out.println("Lesson 3");
        System.out.println("-----------------------------------------");
        System.out.println("Task 3");
        System.out.println("-----------------------------------------");
        for (int comet = 0; comet < 2100; comet++) {
        if (comet % 79 == 0 && comet > 1822) {
            System.out.println(comet);
        }
    }
}
}