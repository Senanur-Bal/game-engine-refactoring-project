public class Main {

    public static void main(String[] args) {

        GameObject obj = new GameObject("PLAYER", "Hero", 100, 20);

        GameComponent decorated =
                new DamageBoostDecorator(
                        new BasicGameObject(obj)
                );

        decorated.update();
        System.out.println(decorated.getInfo());

        LegacyEnemy enemy = new LegacyEnemy();

        GameComponent adapted = new EnemyAdapter(enemy);

        adapted.update();
        System.out.println(adapted.getInfo());
    }
}