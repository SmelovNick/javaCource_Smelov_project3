import java.util.Scanner;

public class CommercialPremises extends Premises{
    CommercialPremisesType type;

    public CommercialPremises() {
        super();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите тип помещения: ");
            input = scanner.nextLine();
            if (input.length() != 0) {
                switch (input) {
                    case "Магазин" -> {
                        this.type = CommercialPremisesType.SHOP;
                        flag = false;
                    }
                    case "Склад" -> {
                        this.type = CommercialPremisesType.WAREHOUSE;
                        flag = false;
                    }
                    case "Офис" -> {
                        this.type = CommercialPremisesType.OFFICE;
                        flag = false;
                    }
                    default -> System.out.println("Введен неверный тип помещения, попробуйте снова");
                }
            }
        }
    }
}
