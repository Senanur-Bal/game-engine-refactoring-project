public class HealthUI implements Observer {

    @Override
    public void update(int health) {
        System.out.println("UI -> Player Health: " + health);
    }
}