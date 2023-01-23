package liskov.substitution;

public class PremiumCoffeMachine implements BaseCoffeMachine{
    public void brewEspresso(){
        System.out.println("Espresso brewed..");
    }
    public void brewFilterCoffe(){
        System.out.println("Filter coffe brewed");
    }
    @Override
    public void brewCoffe(String coffeSelection) {
        if(coffeSelection == "espresso")
            brewEspresso();
        else
            brewFilterCoffe();
    }
}
