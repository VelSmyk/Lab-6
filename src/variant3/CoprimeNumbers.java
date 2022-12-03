package variant3;

public class CoprimeNumbers implements MatchInterface{
    @Override
    public boolean match(int number1, int number2) {
        for(int i = 2; number1>=i;i++){
         if(number1%i==0 && number2%i==0)
             return false;
        }
        return true;
    }
}
