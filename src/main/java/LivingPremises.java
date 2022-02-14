import java.util.Scanner;

public class LivingPremises extends Premises{
    int roomCount;

    public LivingPremises() {
        super();

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Введите количество комнат: ");
        input = scanner.nextLine();
        if(input.length() >1) this.roomCount = Integer.parseInt(input);
    }

    @Override
    public String toString() {
        return super.toString() + ", roomCount= " + roomCount + "}";
    }
}
