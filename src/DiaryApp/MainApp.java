
package DiaryApp;
import java.util.Scanner;



public class MainApp {
    public static void main(String[] args) {
        menu();
    }

    public static void menu () {
        String menu = """
                    Welcome!!!
                    Kindly pick any option you would like to perform
                    1.createDiary
                    2.createEntry
                    3.createPassword
                    4.findEntry
                    5.deleteEntry
                    6.updateEntry
                    7.exitApp
                    """;
//        Scanner input = new Scanner(System.in);
//        System.out.print();
//        String choice = input.next();
        print(menu);
        String option = input("Enter your desired option:");
        switch (option) {
            case "1":
                createDiary();
            case "2":
                createEntry();
            case "3":
                findEntry();
            case "4":
                deleteEntry();
            case "5":
                updateEntry();
            case "6":
                exitApp();
            default:
                menu();
        }
    }



    private static String input(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void print(String prompt) {
        System.out.println(prompt);
    }
    private static Diaries user = new Diaries();

    private static void createDiary () {
        String username = input("Enter your username:");
        String password = input("Enter your password");
        user.addDiary(username, password);
        print("Entry created successfully!!!");
        menu();
    }

    private static void createEntry () {
        String username = input("Enter your username:");
        String title = input("Enter title:");
        String body = input("Enter body ");
        Diary diary = user.findByUsername(username);
        diary.createEntry(title, body);
        print("Diary created successfully!!!");
        menu();

    }

    private static void findEntry() {
        String username = input("Enter your username:");
        String id = input("Enter your Diary id:");
        Diary diary = user.findByUsername(username);
        diary.findEntryById(Integer.parseInt(id));
        print("Entry found");

    }

    private static void deleteEntry() {
        String username = input("Enter your username:");
        String id = input("Enter Id number of the entry you want to delete:");
        Diary diary = user.findByUsername(username);
        diary.deleteEntry(Integer.parseInt(id));
        print("Entry deleted successfully");

    }

    private static void updateEntry() {
        String username = input("Enter your username:");
        String id = input("Enter your id:");
        String title = input("Enter title");
        String body = input("Enter body:");
        Diary diary = user.findByUsername(username);
        diary.updateEntry(Integer.parseInt(id),title,body);
        print("Entry updated successfully!");
    }

    private static void exitApp() {
        menu();
    }


}
