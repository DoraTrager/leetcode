public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount <= 0) {
            return 0;
        }

        if(coins.length == 0){
            return -1;
        }

        // f(n) = min(f(amount-coins[0]) + 1, f(amount-coins[1]) + 1, ..., f(amount-coins[n-1]) + 1)
        int[] steps = new int[amount + 1];
        for(int i = 1; i <= amount; i++){
            steps[i] = amount + 1; // initialized to a number lager than any condition
        }
        steps[0] = 0;

        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length && coins[j] <= i; j++) {
                int c1 = steps[i];
                int c2 = steps[i - coins[j]] + 1;
                steps[i] = Math.min(c1, c2);
            }
        }

        return steps[amount] == amount + 1? -1: steps[amount];
    }

    public static void main(String[] args) {
        Solution ex = new Solution();
        int steps = ex.coinChange(new int[]{474, 83, 404, 3}, 264);
        System.out.print(steps);
    }
}
