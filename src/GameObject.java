public class GameObject {
    private String type;
    private String name;
    private int health;
    private int damage;

    public GameObject(String type, String name, int health, int damage) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void update() {
        System.out.println(name + " updated (" + type + ")");
    }

    public void render() {
        System.out.println("Render: " + name);
    }
}