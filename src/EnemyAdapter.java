public class EnemyAdapter implements GameComponent {

    private LegacyEnemy legacy;

    public EnemyAdapter(LegacyEnemy legacy) {
        this.legacy = legacy;
    }

    @Override
    public void update() {
        legacy.oldMove();
    }

    @Override
    public String getInfo() {
        return "Adapted Legacy Enemy";
    }
}