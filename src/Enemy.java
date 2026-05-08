public class Enemy {

    private AttackStrategy strategy;

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        if (strategy == null) {
            System.out.println("No attack strategy set!");
        } else {
            strategy.attack();
        }
    }
}