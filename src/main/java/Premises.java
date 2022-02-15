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

    private void setDescription() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите название новой позиции: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() !=0) {
                this.description = input;
                flag = false;
            }
            else System.out.println("Некорректное название, введите значение ещё раз");
        }
    }

    private void setSubwayStation() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите станцию метро: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() !=0) {
                this.subwayStation = input;
                flag = false;
            } else System.out.println("Некорректное название, введите значение ещё раз");
        }
    }

    private void setAddress() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите адрес: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() != 0) {
                this.address = input;
                flag = false;
            } else System.out.println("Некорректное название, введите значение ещё раз");
        }
    }

    private void setArea() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите площадь: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() !=0){
                try{
                    double possibleArea = Double.parseDouble(input);
                    if (possibleArea>0){
                        this.area = possibleArea;
                        flag = false;
                    }
                    else System.out.println("Некорректная величина площади помещения, введите значение ещё раз");
                }catch (Exception ex){
                    System.out.println("Некорректная величина площади помещения, введите значение ещё раз");
                }
            }
        }
    }

    private void setPrice() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите цену: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() !=0){
                try{
                    double possiblePrice = Double.parseDouble(input);
                    if (possiblePrice>0){
                        this.area = possiblePrice;
                        flag = false;
                    }
                    else System.out.println("Некорректная цена помещения, введите значение ещё раз");
                }catch (Exception ex){
                    System.out.println("Некорректная цена помещения, введите значение ещё раз");
                }
            }
        }
    }

    private void setAvgRating() {
        boolean flag = true;
        while (flag) {
            System.out.print("Введите среднюю оценку: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.length() !=0){
                try{
                    double possibleAvgRating = Double.parseDouble(input);
                    if (possibleAvgRating>0){
                        this.avgRating = possibleAvgRating;
                        flag = false;
                    }
                    else System.out.println("Некорректная оценка, введите значение ещё раз");
                }catch (Exception ex){
                    System.out.println("Некорректная оценка, введите значение ещё раз");
                }
            }
        }
    }


    public Premises() {
        setDescription();
        setSubwayStation();
        setAddress();
        setArea();
        setPrice();
        setAvgRating();
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
