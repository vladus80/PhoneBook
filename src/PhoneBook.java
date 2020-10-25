public class PhoneBook {

    public static void main(String[] args) {
        //Добавить считывание ввода пользователя в цикле


        System.out.println(formatName("петров                  игорь            валерьевич   "));

        String[][] users =
                {
                        {"Иванов Иван Иванович", "79102553687"},
                        {"ddfddf","154135541"}
                };

        //list(users);
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return true;
    }

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

        String[] nameArr = name.split(" ");
        if(nameArr.length > 2){

            System.out.println();
            nameNormal = false;
        }else {
            nameNormal = true;
        }

        return nameNormal;
    }

    public static String formatName(String name) {

        String[] nameArr = name.split("\\s+");
        String formatName = "";

        if(nameArr.length == 3){

            String nameFamUpCase = firstCharUppCase(nameArr[0]);
            String nameNameUpCase = firstCharUppCase(nameArr[1]);
            String nameOtUpCase = firstCharUppCase(nameArr[2]);

            formatName = nameFamUpCase.trim() + " " + nameNameUpCase.trim() + " " + nameOtUpCase.trim();

        }else{

            System.out.print("Неверный формат имени. Введите в формате: Фамилия Имя Отчество");
        }

        return formatName;
    }

    // Возвращает слово с заглавной буквой
    public static String firstCharUppCase(String word){

        return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1, word.length());

    }

    public static String formatPhoneNumber(String number) {

        String strAr = number.replaceAll("\\D", "").substring(1,11);
        String gr1 = " "+strAr.substring(0,3);
        String gr2 = " "+strAr.substring(3,6);
        String gr3 = " "+strAr.substring(6,8);
        String gr4 = " "+strAr.substring(8,10);
        return "+7"+gr1+gr2+gr3+gr4;


    }

    public static void add(String[][] book, String name, String number) {
        //add logic



    }

    public static void list(String[][] book) {
        //print phone book

        for (int i = 0; i < book.length ; i++){
            System.out.print(book[i][0] +": "+ book[i][1] +"\n");
            for(int j=0; j < book[i].length; j++){

                //System.out.print(book[i][0] +": "+ book[i][1] +"\n" );
            }

        }

    }
}
