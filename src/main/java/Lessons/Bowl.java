package Lessons;

public class Bowl {
    private int amountEat;

    public Bowl(int amountEat) {
        this.amountEat = amountEat;
    }

    public boolean decreaseCountEat(int amount) {
        if (amountEat >= amount) {
            amountEat -= amount;
            return true;
        }
        return false;
    }

    public void addCountEat(int amount) {
        if (amount > 0) {
            amountEat += amount;
        }
    }
}
