public class ExtraCheese extends ToppingDecorator{

    //additoinal feature of basepizza

    BasePizza p;

    public ExtraCheese(BasePizza p) {
        this.p = p;
    }

    @Override
    public int cost() {
        return this.p.cost()+10;
    }
}
