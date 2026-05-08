public class DamageBoostDecorator extends GameObjectDecorator {

    public DamageBoostDecorator(GameComponent component) {
        super(component);
    }

    @Override
    public void update() {
        System.out.println("Damage Boost Applied!");
        component.update();
    }

    @Override
    public String getInfo() {
        return component.getInfo() + " +DamageBoost";
    }
}