public class GameObject {
    private String type;
    private String name;
    private int health;
    private int damage;

    public GameObject(String type, String name) {
        this.type = type;
        this.name = name;

        if (type.equals("PLAYER")) {
            this.health = 100;
            this.damage = 20;
        } else if (type.equals("ENEMY")) {
            this.health = 50;
            this.damage = 10;
        } else if (type.equals("ITEM")) {
            this.health = 0;
            this.damage = 0;
        }
    }

    public void update() {
        if (type.equals("PLAYER")) {
            System.out.println(name + " is moving and attacking.");
        } else if (type.equals("ENEMY")) {
            System.out.println(name + " is chasing the player.");
        } else if (type.equals("ITEM")) {
            System.out.println(name + " is idle.");
        }
    }

    public void render() {
        if (type.equals("PLAYER")) {
            System.out.println("Render Player: " + name);
        } else if (type.equals("ENEMY")) {
            System.out.println("Render Enemy: " + name);
        } else if (type.equals("ITEM")) {
            System.out.println("Render Item: " + name);
        }
    }
}