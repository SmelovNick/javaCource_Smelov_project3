import java.util.Locale;
import java.util.Scanner;

public class CommercialPremises extends Premises{
    CommercialPremisesType type;

    public CommercialPremises() {
        super();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите один из трех типов коммерческой недвижимости - магазин, склад или офис: ");
            input = scanner.nextLine();
            if (input.length() != 0) {
                switch (input.toLowerCase(Locale.ROOT)) {
                    case "магазин" -> {
                        this.type = CommercialPremisesType.SHOP;
                        flag = false;
                    }
                    case "склад" -> {
                        this.type = CommercialPremisesType.WAREHOUSE;
                        flag = false;
                    }
                    case "офис" -> {
                        this.type = CommercialPremisesType.OFFICE;
                        flag = false;
                    }
                    default -> System.out.println("Введен неверный тип помещения, попробуйте снова");
                }
            }
        }
    }

    @Override
    public String toString() {
            return super.toString() + ", тип помещения= " + type.getType();
    }
}
