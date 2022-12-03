package carshop.impl;
import carshop.cars.Car;
import carshop.interfaces.Admin;
import carshop.interfaces.Customer;
import java.util.Arrays;
public class MyOwnAutoShop implements Admin, Customer {
    public MyOwnAutoShop(Car[] cars) {
        this.cars = cars;
    }
      Car[] cars;
    @Override
    public double getIncome() {
        double sum = 0;
       for(Car car : cars){
           if(car.isSellOut())
          sum+=car.getSalePrice();
       }
        return sum;
    }
    @Override
    public double getCarsPrice() {
        double sum = 0;
        for(Car car : cars){
            sum+= car.getRegularPrice();
        }
        return sum;
    }
    @Override
    public String getCarColors() {
        String[] string = new String[cars.length];
        int i = 0;
        for(Car car : cars){
            string[i] = car.getColor();
            i++;
        }
        return Arrays.toString(string);
    }
    @Override
    public int getCarPrice(int id) {
        return (int) cars[id].getSalePrice();
    }
    @Override
    public String getCarColor(int id) {
        return cars[id].getColor();
    }
    @Override
    public boolean purchaseCar(int id) {
        return cars[id].isSellOut();
    }
}