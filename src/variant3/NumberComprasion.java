package variant3;

public class NumberComprasion implements MatchInterface{
    @Override
    public boolean match(int number1, int number2) {
        return number1 > number2;
    }
}
