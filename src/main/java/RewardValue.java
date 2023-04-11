public class RewardValue {

    private double cash;
    private int miles;

    //two constructors
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (cash / 0.0035); //converts cash to miles.
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * 0.0035; //converts miles to cash.
    }

    //getCashValue returns the cash value of RewardValue.
    public double getCashValue() {
        return cash;
    }

    // getMilesValue returns how many miles RewardValue is worth.
    public double getMilesValue() {
        return miles;
    }
}
