import java.util.ArrayList;
import java.util.Scanner;

public class todo_list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todos = new ArrayList<>();

        while (true) {
            System.out.println("Was willst du tun?");
            System.out.println("(1) To-dos anzeigen");
            System.out.println("(2) To-dos hinzufügen");
            System.out.println("(3) Zurück zum Hauptmenü");
            System.out.print("Bitte auswählen: ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Meine Liste hat diese Elemente:");
                for (String todo : todos) {
                    System.out.println("- " + todo);
                }
            } else if (option.equals("2")) {
                System.out.print("Was möchtest du hinzufügen? ");
                String newItem = scanner.nextLine();
                todos.add(newItem);
            } else if (option.equals("3")) {
                System.out.println("Zurück zum Hauptmenü...");
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte 1, 2 oder 3 wählen.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
