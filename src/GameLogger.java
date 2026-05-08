public class GameLogger implements Observer {

    @Override
    public void update(int health) {
        System.out.println("LOG -> Player health changed: " + health);
    }
}