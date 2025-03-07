public class Mushroom extends ToppingDecorator{


    BasePizza p;

    public Mushroom(BasePizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return p.cost()+20;
    }
}
