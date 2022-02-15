import java.util.*;
import java.util.stream.Collectors;

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
                case 3 -> clearAllLists();
                case 4 -> showLists();
                case 0 -> flag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }

    private void showMenu(MenuForm menuForm){
        System.out.println(menuForm.getMenuForm());
    }

    private static int chooseOption(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int option=-1;
        if(input.length() ==1) option = Integer.parseInt(input);
        return option;
    }

    //TODO Заменить пункты-заглушки
    private void showLivingMenu(){
        boolean createNoteflag = true;
        while (createNoteflag) {
            showMenu(MenuForm.LIVINGMENU);
            switch (chooseOption()) {
                case 1 -> livingPremises.add(new LivingPremises());
                case 2 -> deletePremises(livingPremises);
                case 3 -> sortPremisesByPriceAsc(livingPremises);
                case 4 -> sortPremisesByPriceDesc(livingPremises);
                case 5 -> showGroupedBySubway(livingPremises);
                case 6 -> showBestAvgRate(livingPremises);
                case 7 -> showAllPremisesFromArrayList(livingPremises);
                case 0 -> createNoteflag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }

    private <T extends Premises> void deletePremises(ArrayList<T> premises) {
        System.out.print("Введите название позиции, которую следует удалить: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        premises.removeAll(premises.stream().filter(p -> p.getDescription().equals(input)).toList());
    }

    private <T extends Premises> void sortPremisesByPriceAsc(ArrayList<T> premises){
        premises
                .stream()
                .sorted(Comparator.comparing(Premises::getPrice))
                .forEach( p -> System.out.printf("%s - %,.2f руб.- %1.2f\n", p.getDescription() , p.getPrice(), p.getAvgRating()));
    }

    private <T extends Premises> void sortPremisesByPriceDesc(ArrayList<T> premises){
        premises
                .stream()
                .sorted(Comparator.comparing(Premises::getPrice).reversed())
                .forEach( p -> System.out.printf("%s - %,.2f руб. - %1.2f\n", p.getDescription() , p.getPrice(), p.getAvgRating()));
    }

    private <T extends Premises> void showGroupedBySubway(ArrayList<T> premises) {
        Map<String, List<T>> groupedPremises = premises.stream().collect(Collectors.groupingBy(Premises::getSubwayStation));
        groupedPremises.forEach((subwayStation, premise) -> {
            System.out.println(subwayStation);
            premise.forEach( p -> System.out.printf("%s - %,.2f руб. - %1.2f\n", p.getDescription() , p.getPrice(), p.getAvgRating()));
        });
    }

    private <T extends Premises> void showBestAvgRate(ArrayList<T> premises){
        premises.stream().max(Comparator.comparing(Premises::getAvgRating)).ifPresent(System.out::println);
    }

    private <T extends Premises> void showAllPremisesFromArrayList(ArrayList<T> premises){
        premises.forEach(System.out::println);
    }

    //TODO Заменить пункты-заглушки
    private void showCommercialMenu(){
        boolean createNoteflag = true;
        while (createNoteflag) {
            showMenu(MenuForm.COMMERCIAL);
            switch (chooseOption()) {
                case 1 -> commercialPremises.add(new CommercialPremises());
                case 2 -> deletePremises(commercialPremises);
                case 3 -> sortPremisesByPriceAsc(commercialPremises);
                case 4 -> sortPremisesByPriceDesc(commercialPremises);
                case 5 -> showGroupedBySubway(commercialPremises);
                case 6 -> showBestAvgRate(commercialPremises);
                case 7 -> showAllPremisesFromArrayList(commercialPremises);
                case 0 -> createNoteflag = false;
                default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
            }
        }
    }



    //TODO протестировать
    private void clearAllLists(){
        System.out.println("Вы действительно хотите очистить списки с недвижимостью? Введите Y/N и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "Y" -> {livingPremises.clear();commercialPremises.clear();}
            case "N" -> {}
            default -> System.out.println("Выбрана невалидная опция, попробуйте ещё раз");
        }
    }

    private void showLists(){
        System.out.println("Жилая недвижимость\n");
        livingPremises.forEach(System.out::println);
        System.out.println("Коммерческая недвижимость\n");
        commercialPremises.forEach(System.out::println);
    }
}
