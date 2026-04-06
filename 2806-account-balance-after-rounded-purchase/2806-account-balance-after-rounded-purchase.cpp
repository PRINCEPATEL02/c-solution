class Solution {
public:
    int accountBalanceAfterPurchase(int purchaseAmount) {
        int r = ((purchaseAmount + 5) / 10) * 10;
        return 100 - r;
    }
};