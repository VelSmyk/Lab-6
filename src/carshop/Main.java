package carshop;
import carshop.cars.Car;
import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Truck;
import carshop.impl.MyOwnAutoShop;
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(170,true,270000,"Yellow",270);
        Ford ford1 = new Ford(220,false,280000,"Black",2015,5000);
        Ford ford2 = new Ford(260,true,240000,"Black",2020,5000);
        Truck truck1 = new Truck(150,false,380000,"White",1500);
        Truck truck2 = new Truck(190,true,450000,"White",2300);
        MyOwnAutoShop myOwnAutoShop = new MyOwnAutoShop(new Car[]{sedan,ford1,ford2,truck1,truck2});
        System.out.println("Стоимость проданных автомобилей:" + myOwnAutoShop.getIncome());
        System.out.println("Цвет машины с 1 id" + myOwnAutoShop.getCarColor(1));
        System.out.println("Стоимость всех машин:" + myOwnAutoShop.getCarsPrice());
        System.out.println("Цвет всех машин" + myOwnAutoShop.getCarColors());
        System.out.println("Стоимость машины с 4 id" + myOwnAutoShop.getCarPrice(4));
        System.out.println();
        System.out.println("Стоимость седана с учетом скидки : " + sedan.getSalePrice());
        System.out.println("Стоимость первого форда с учетом скидки : " + ford1.getSalePrice());
        System.out.println("Стоимость второго форда с учетом скидки : " + ford2.getSalePrice());
        System.out.println("Стоимость первого грузовика с учетом скидки : " + truck1.getSalePrice());
        System.out.println("Стоимость второго грузовика с учетом скидки : " +truck2.getSalePrice());
    }
}
