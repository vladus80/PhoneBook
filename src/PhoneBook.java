import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        //Добавить считывание ввода пользователя в цикле
        String[][] book = new String[10][2];
        Scanner scanner = new Scanner(System.in);

        book[0][0] = "Иванов Иван Иванович";
        book[0][1] = "89103662578";


        String operation = "";

        while (true){
            operation =  scanner.nextLine();
            if(operation.equals("exit")){

                break;
            }
            if(operation.equals("list")){
                list(book);
            }

            System.out.println("Введите Имя пользователя");
            String userName = formatName(scanner.nextLine()); //Считываем строку и форматируем ФИО с заглавных

            if(!getPhoneIsName(book, userName).equals("")){
                System.out.println(getPhoneIsName(book, userName));
            }else {
                System.out.println("Введите номер телефона:");
                String number = formatPhoneNumber(scanner.nextLine());
                add(book,userName,formatPhoneNumber(number));
            }
        }

    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return true;
    }
    // Проверяет имя в массиве book
    public static boolean checkNameInBook(String name, String[][] book){

        boolean nameInBook = true;

        for (int i = 0; i < book.length ; i++){
            System.out.print(book[i][0] +": "+ book[i][1] +"\n");

            if(name.equals(book[i][0])){

                nameInBook = true;
            }else {

                nameInBook = false;
            }


        }


        return nameInBook;

    }

    public static boolean checkName(String name) {

        boolean nameNormal;

        String[] nameArr = name.split("\\D");
        if(nameArr.length > 2){

            System.out.println();
            nameNormal = false;
        }else {
            nameNormal = true;
        }

        return nameNormal;
    }

    // Метод возвращает  фразу из трех слов, каждое слово с Заглавной буквы
    public static String formatName(String name) {

        String[] nameArr = name.split("\\s+");
        String formatName = "";

        if(nameArr.length == 3){

            String nameFamUpCase = firstCharUppCase(nameArr[0]);
            String nameNameUpCase = firstCharUppCase(nameArr[1]);
            String nameOtUpCase = firstCharUppCase(nameArr[2]);

            formatName = nameFamUpCase + " " + nameNameUpCase+ " " + nameOtUpCase;

        }else{

            System.out.print("Неверный формат имени. Введите в формате: Фамилия Имя Отчество");
        }

        return formatName;
    }

    // Возвращает номер телефона по имени
    public static String getPhoneIsName(String[][] book, String name){
        String checkNameInArray = "";
        for (int i = 0; i < book.length-1; i++) {
            if(book[i][0].equals(name)){
                checkNameInArray = book[i][1];
            }
            break;
        }

        return checkNameInArray;
    }


    // Возвращает слово с заглавной буквой
    public static String firstCharUppCase(String word){

        return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length());

    }
    // Метод возвращает отформатированный номер
    public static String formatPhoneNumber(String numberUser) {

        String res = "";

        if(numberUser.length() < 11){

            System.out.println("Неверный формат. Введите в формате 8 XXX XXX XX XX");

        }else {
            String strAr = numberUser.replaceAll("\\D", "").substring(1,11);
            String gr1 = " "+strAr.substring(0,3);
            String gr2 = " "+strAr.substring(3,6);
            String gr3 = " "+strAr.substring(6,8);
            String gr4 = " "+strAr.substring(8,10);
            res = "8"+gr1+gr2+gr3+gr4;
        }

        return res;


    }

    public static void add(String[][] book, String name, String number) {

        for (int i = 0; i < book.length ; i++) {

           if(book[i][0] == null) {

               book[i][0] = name;
               book[i][1] = number;
               break;
           }

        }

    }

    // Метод печатает пользователей из массива
    public static void list(String[][] book) {
        //print phone book

        for (int i = 0; i < book.length ; i++){

            if(book[i][0] != null){
                System.out.print(book[i][0] +": "+ book[i][1] +"\n");
            }


//

        }

    }
}
