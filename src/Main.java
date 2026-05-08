public class Main {

    public static void main(String[] args) {

        System.out.println("===== OBSERVER PATTERN =====");

        Player player = new Player();

        HealthUI healthUI = new HealthUI();
        GameLogger logger = new GameLogger();

        player.addObserver(healthUI);
        player.addObserver(logger);

        player.setHealth(100);
        player.setHealth(75);
        player.setHealth(40);

        System.out.println("\n===== STRATEGY PATTERN =====");

        Enemy enemy = new Enemy();

        enemy.setStrategy(new MeleeAttack());
        enemy.attack();

        enemy.setStrategy(new RangedAttack());
        enemy.attack();
    }
}