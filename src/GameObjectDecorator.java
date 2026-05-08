public abstract class GameObjectDecorator implements GameComponent {

    protected GameComponent component;

    public GameObjectDecorator(GameComponent component) {
        this.component = component;
    }
}