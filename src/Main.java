public class Main {
    static double SquaredDouble(double d) {
        return d * d;
    }

    static boolean DivisibleFourInt(int d) {
        return (d % 4 == 0); // Returns true if remainder is 0
    }

    static int AttackOne(int l) {
        return l * 2;
    }

    static double AttackTwo(double d) {
        return d * 2.5;
    }

    static int AttackThree(int l, int a) {
        return 4 * (l + a);
    }
        static void main() {

        String[] NimblesnotsGoods = {"Razzberry Goop", "Unicorn Toenails", "Giant Beans", "Nimblesnots' Snot", "Banana"};
        double[] NimblesnotsPrices = {7.5, 98.33, 25.99, 899.99, 1.49};

        int[] MathHomework = {104, 31, 2304};

        // Maybe make a random number generator instead of hardcoded values
        int AttackOneScore = AttackOne(160);
        double AttackTwoScore = AttackTwo(18.5);
        int AttackThreeScore = AttackThree(25, 10);

        double TotalAttackScore = AttackOneScore + AttackTwoScore + AttackThreeScore;

        System.out.print("---------- Stop #1 ----------\n");
        for (int i = 5; i < 9; i++) {
            double result = SquaredDouble(i);
            System.out.print((int) Math.round(result) + "\n");
        }

        System.out.println();

        System.out.print("---------- Stop #2 ----------\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(NimblesnotsGoods[i] + ": $" + (NimblesnotsPrices[i] + 2.5));
        }

        System.out.println();

        System.out.print("---------- Stop #3 ----------\n");
        for (int i : MathHomework) {
            System.out.print("Is " + i + " divisible by 4? " + DivisibleFourInt(i) + "\n");
        }

        System.out.println();

        System.out.print("---------- Stop #4 ----------\n");
        System.out.print("Attack One Score: " + AttackOneScore + "\n");
        System.out.print("Attack Two Score: " + AttackTwoScore + "\n");
        System.out.print("Attack Three Score: " + AttackThreeScore + "\n\n");
        System.out.print("Total Attack Score: " + TotalAttackScore);

    }
}