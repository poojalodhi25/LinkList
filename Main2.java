public class Main {

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        // Outer loop = customers/rows
        for (int i = 0; i < accounts.length; i++) {

            int currentWealth = 0;

            // Inner loop = banks/columns
            for (int j = 0; j < accounts[i].length; j++) {

                currentWealth = currentWealth + accounts[i][j];
            }

            // Compare current customer wealth with maximum wealth
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 5},
            {7, 3},
            {3, 5}
        };

        int answer = maximumWealth(accounts);

        System.out.println("Richest Customer Wealth = " + answer);
    }
}