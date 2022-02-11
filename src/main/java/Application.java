import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    ArrayList<LivingPremises> livingPremises = new ArrayList<>();
    ArrayList<CommercialPremises> commercialPremises = new ArrayList<>();

    public void run() {
        boolean flag = true;
        while(flag){
            showMenu(MenuForm.MAINMENU);
            switch (chooseOption()) {
                case 1 -> showLivingMenu();
                case 2 -> showCommercialMenu();
                case 3 -> flag = false;
                case 4 -> flag = false;
                case 0 -> flag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }

    void showMenu(MenuForm menuForm){
        System.out.println(menuForm.getMenuForm());
    }

    public static int chooseOption(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int option=-1;
        if(input.length() ==1) option = Integer.parseInt(input);
        return option;
    }

    //TODO Заменить пункты-заглушки
    public void showLivingMenu(){
        boolean createNoteflag = true;
        while (createNoteflag) {
            showMenu(MenuForm.LIVINGMENU);
            switch (chooseOption()) {
                case 1 -> createNoteflag = false;
                case 2 -> createNoteflag = false;
                case 3 -> createNoteflag = false;
                case 4 -> createNoteflag = false;
                case 5 -> createNoteflag = false;
                case 6 -> createNoteflag = false;
                case 7 -> createNoteflag = false;
                case 0 -> createNoteflag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }

    //TODO Заменить пункты-заглушки
    public void showCommercialMenu(){
        boolean createNoteflag = true;
        while (createNoteflag) {
            showMenu(MenuForm.COMMERCIAL);
            switch (chooseOption()) {
                case 1 -> createNoteflag = false;
                case 2 -> createNoteflag = false;
                case 3 -> createNoteflag = false;
                case 4 -> createNoteflag = false;
                case 5 -> createNoteflag = false;
                case 6 -> createNoteflag = false;
                case 7 -> createNoteflag = false;
                case 0 -> createNoteflag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }

    void addToList(){}

}
