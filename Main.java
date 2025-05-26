//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Objects;
import java.util.Scanner;

public class Main {

// Меню
    static void menu() {
            System.out.println("Меню:");
            System.out.println("0 - Выход");
            System.out.println("1 - Выполнить авторизацию");
        }


    static void menuProject() {
        Scanner in = new Scanner(System.in);

        System.out.println("146 - Тебоил");
        System.out.println("122 - АРНЕСТ");
        String projectId = in.nextLine();
        System.out.printf("Выберите проект:%s", projectId);
    }


//авторизация
static boolean authorizationcheckdata() {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите логин:");
    String login = in.nextLine();
    System.out.println("Введите пароль:");
    String password = in.nextLine();
    if(Objects.equals(login, "eee_test") && Objects.equals(password, "12345"))
    {
        return Example.resulrCorrectData = true; }
    else {
        return Example.resulrCorrectData = false; }


}

    static void authorization() {

        while (Example.resulrCorrectData == false){
            authorizationcheckdata();
        };
        if (Example.resulrCorrectData == true){
            menuProject();
        }

    }

    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);

            menu();

            int step = sc.nextInt();

               while (step == 0) {
                   menu();
                   step = sc.nextInt();
               }
               if (step == 1) {
                   authorization();
               }
               if (step != 1 && step != 2)
               {
                  System.out.println("Нет выбранного пукнта меню");
               }

        }

    }

}
