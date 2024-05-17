
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
                    3.findEntry
                    4.deleteEntry
                    5.updateEntry
                    6.exitApp
                    """;
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
        try {
            user.addDiary(username, password);
            print("Diary created successfully!!!");
        } catch (Exception j) {
            print(j.getMessage());
        }
        finally {
            menu();
        }
    }


    private static void createEntry () {
        String username = input("Enter your username:");
        String title = input("Enter title:");
        String body = input("Enter body ");
        try {
            Diary diary = user.findByUsername(username);
            diary.createEntry(title, body);
            print("Diary created successfully!!!");
        }catch (Exception j) {
            print(j.getMessage());
        }finally {
            menu();
        }
    }

    private static void findEntry() {
        String username = input("Enter your username:");
        String id = input("Enter your Diary id:");
        try {
            Diary diary = user.findByUsername(username);
            diary.findEntryById(Integer.parseInt(id));
            print("Entry found");
        }catch (Exception j) {
            print(j.getMessage());
        }finally {
            menu();
        }

    }

    private static void deleteEntry() {
        String username = input("Enter your username:");
        String id = input("Enter Id number of the entry you want to delete:");
        try {
            Diary diary = user.findByUsername(username);
            diary.deleteEntry(Integer.parseInt(id));
            print("Entry deleted successfully");
        } catch (Exception j) {
            print(j.getMessage());
        }finally {
            menu();
        }
    }

    private static void updateEntry() {
        String username = input("Enter your username:");
        String id = input("Enter your id:");
        String title = input("Enter title");
        String body = input("Enter body:");
        try {
            Diary diary = user.findByUsername(username);
            diary.updateEntry(Integer.parseInt(id), title, body);
            print("Entry updated successfully!");
        }catch (Exception j) {
            print(j.getMessage());
        }finally {
            menu();
        }
    }

    private static void exitApp() {
        menu();
    }


}
