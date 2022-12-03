package carshop.cars;
public class Sedan extends Car{
    int length;
    public Sedan(int speed, boolean isSellOut, double regularPrice, String color,int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }
    @Override
    public double getSalePrice() {
        if(length>20)
            return super.getSalePrice() -  super.getSalePrice()*0.05;
        return super.getSalePrice();
    }
}