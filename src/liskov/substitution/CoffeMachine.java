package liskov.substitution;

public class CoffeMachine implements BaseCoffeMachine{
    public void brewFilterCoffe(){
        System.out.println("Filter coffe brewed..");
    }

    @Override
    public void brewCoffe(String coffeSelection) {
        brewFilterCoffe();
    }
}
