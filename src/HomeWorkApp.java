public class HomeWorkApp {
    // #1
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(1, -3);
        printColor(-560);
        compareNumbers(1, -3);
        checkSum(3, 18);
        checkNumber(2);
        checkNumber(-2);
        checkNumberAndReturnBool(3);
        checkNumberAndReturnBool(-3);
        stringAndNumber("Hello You", 4);
        visokosnyiRik(24);
        visokosnyiRik(801);
    }

    // #2
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // #3
    static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Suma pozitivna");
        } else {
            System.out.println("Suma negativna");
        }
    }

    // #4
    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Chervonyi");
        } else if (value > 0 && value <= 100) {
            System.out.println("Zhovtyi");
        } else {
            System.out.println("Zelenyi");
        }
    }

    // #5
    static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // #6
    static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    // #7
    static void checkNumber(int a) {
        String result = a >= 0 ? "Chislo dodatne" : "Chislo vid'emne";
        System.out.println(result);
    }

    // #8
    static boolean checkNumberAndReturnBool(int a) {
        return a >= 0;
    }

    // #9
    static void stringAndNumber(String line, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(line);
        }
    }

    // #10
    static boolean visokosnyiRik(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
