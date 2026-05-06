public class Main {
    public static void main(String[] args) {

        GameObject player = GameObjectFactory.createObject("PLAYER", "Hero");
        GameObject enemy = GameObjectFactory.createObject("ENEMY", "Zombie");
        GameObject item = GameObjectFactory.createObject("ITEM", "Coin");

        player.update();
        enemy.update();
        item.update();
    }
}