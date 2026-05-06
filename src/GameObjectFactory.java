public class GameObjectFactory {

    public static GameObject createObject(String type, String name) {

        if (type.equals("PLAYER")) {
            return new GameObject(type, name, 100, 20);
        } 
        else if (type.equals("ENEMY")) {
            return new GameObject(type, name, 50, 10);
        } 
        else if (type.equals("ITEM")) {
            return new GameObject(type, name, 0, 0);
        }

        throw new IllegalArgumentException("Unknown type: " + type);
    }
}