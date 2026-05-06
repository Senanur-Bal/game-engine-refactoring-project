public class Main {
    public static void main(String[] args) {

        GameObject player = new GameObject("PLAYER", "Hero");
        GameObject enemy = new GameObject("ENEMY", "Goblin");
        GameObject item = new GameObject("ITEM", "Potion");

        player.update();
        player.render();

        enemy.update();
        enemy.render();

        item.update();
        item.render();
    }
}