public class BasicGameObject implements GameComponent {

    private GameObject obj;

    public BasicGameObject(GameObject obj) {
        this.obj = obj;
    }

    @Override
    public void update() {
        obj.update();
    }

    @Override
    public String getInfo() {
        return obj.getName();
    }
}