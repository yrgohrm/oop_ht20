/**
 * This class is a piggybank for saving coins.
 * 
 * This piggybank can only store coins, not bills.
 */
public class PiggyBank {
    private int totalValue;
    private int numberOfCoins;

    public PiggyBank() {
        totalValue = 0;
        numberOfCoins = 0;
    }

    /**
     * Save a coin in the bank. Only allows proper coins, 1, 2, 5 and 10.
     * 
     * <p>If the coin is illegal nothing will happen.</p>
     * 
     * @param coin the value of the coin stored 
     */
    public void addCoin(int coin) {
        // check that the coin value is allowed
        if (coin == 1 || coin == 2 || coin == 5 || coin == 10) {
            totalValue = totalValue + coin;
            numberOfCoins++;
        }
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }


}
