import java.util.Scanner;

public class WomanMenu {

    Scanner input = new Scanner(System.in);

    public String showMenu() {
        return "1. Calzado\n2. Productos destacados\n3.Ropa\n4. Accesorios\n5. Deportes\n";
    }

    public void option_menu() {
        System.out.println(showMenu());
        int option = 0;
        int option_submenu = 0;
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Calzado\n1. Running\n2. Classic\nSelecciona una opción:");
                option_submenu = input.nextInt();
                if (option_submenu == 1) {
                    Running instance_running = new Running();
                    instance_running.addRunningShoesWoman();
                    System.out.println("Filtro por talla 38");
                    System.out.println(instance_running.sizeInformationShoes());
                    System.out.println("Filtro por precio mayor a 150");
                    System.out.println(instance_running.priceInformationShoes());
                    System.out.println("Filtro por envio");
                    System.out.println(instance_running.sendInformationShoes());
                    System.out.println("Sin filtro");
                    System.out.println(instance_running.showInformationShoes());
                } else if (option_submenu == 2) {
                    Classic instance_classic = new Classic();
                    instance_classic.addClassicShoes();
                    System.out.println("Filto por más de 5 colores");
                    System.out.println(instance_classic.coloursInformationShoes());
                    System.out.println("Filtro por precio mayor a 150");
                    System.out.println(instance_classic.priceInformationShoes());
                    System.out.println("Sin filtro");
                    System.out.println(instance_classic.showInformationShoes());
                } else {
                    System.out.println("Opción no válida");
                }
                break;
            case 2:
                System.out.println("Productos destacados");
            case 3:
                System.out.println("Ropa");
            case 4:
                System.out.println("Accesorios");
            case 5:
                System.out.println("Deportes");
        }
    }
}