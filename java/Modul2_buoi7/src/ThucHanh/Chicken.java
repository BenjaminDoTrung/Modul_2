package ThucHanh;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chích chích";
    }

    @Override
    public String howtoEat() {
        return "mổ mổ";
    }
}
