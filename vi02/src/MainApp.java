public class MainApp {

    public static void main(String[] args) {

        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        String computer = "Computer";
        String officeDesk = "Office desk";

        System.out.println("Product:");
        System.out.printf("%s, wich price is $ %.2f%n", computer, price1);
        System.out.printf("%s, wich price is $ %.2f%n", officeDesk, price2);
        System.out.println();
        System.out.printf("Record  %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n%n", measure);

    }

}
