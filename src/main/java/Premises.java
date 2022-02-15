//Поля классов:
//        Название помещения
//        Станция метро
//        Адрес
//        Кол-во комнат (для квартир)
//        Тип помещения (для коммерческих помещений)
//        Метраж помещения
//        Цена
//        Средняя оценка

import java.util.Scanner;

public abstract class Premises {
    private String description;
    private String subwayStation;
    private String address;
    private double area;
    private double price;
    private double avgRating;

    public String getDescription() {
        return description;
    }


    public String getSubwayStation() {
        return subwayStation;
    }


    public String getAddress() {
        return address;
    }


    public double getArea() {
        return area;
    }


    public double getPrice() {
        return price;
    }


    public double getAvgRating() {
        return avgRating;
    }


    public Premises() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Введите название новой позиции: ");
        input = scanner.nextLine();
        if(input.length() >1) this.description = input;

        System.out.print("Введите станцию метро: ");
        input = scanner.nextLine();
        if(input.length() >1) this.subwayStation = input;

        System.out.print("Введите адрес: ");
        input = scanner.nextLine();
        if(input.length() >1) this.address = input;

        System.out.print("Введите площадь: ");
        input = scanner.nextLine();
        if(input.length() >1) this.area = Double.parseDouble(input);

        System.out.print("Введите цену: ");
        input = scanner.nextLine();
        if(input.length() >1) this.price = Double.parseDouble(input);

        System.out.print("Введите среднуюю оценку: ");
        input = scanner.nextLine();
        if(input.length() !=0) this.avgRating = Double.parseDouble(input);
    }

    @Override
    public String toString() {
        return "Объект недвижимости: " +
                "название=" + description +
                ", станция метро=" + subwayStation +
                ", адрес=" + address +
                ", площадь=" + area + " кв.м."+
                ", цена=" + String.format("%,.2f руб.", price) +
                ", средняя оценка=" + avgRating;
    }


}
