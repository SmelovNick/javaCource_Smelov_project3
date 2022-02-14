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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubwayStation() {
        return subwayStation;
    }

    public void setSubwayStation(String subwayStation) {
        this.subwayStation = subwayStation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
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
        if(input.length() >1) this.avgRating = Double.parseDouble(input);
    }

    @Override
    public String toString() {
        return "Premises{" +
                "description='" + description + '\'' +
                ", subwayStation='" + subwayStation + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", avgRating=" + avgRating;
    }
}
