public class PhoneBook {

    public static void main(String[] args) {
        //Добавить считывание ввода пользователя в цикле


        String[][] users =
                {
                        {"Иванов Иван Иванович", "79102553687"},{"ddfddf","154135541"}
                };

        list(users);
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return true;
    }

    public static boolean checkName(String name) {
        return true;
    }

    public static String formatName(String name) {
        return "";
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
           // System.out.print(book[i][0] +"\n" );
            for(int j=0; j < book[i].length; j++){

                System.out.print(book[i][0] +": "+ book[i][1] +"\n" );
            }
            //System.out.print(book[0][i] +": "+   book[1][i] + "\n" );
            //System.out.println();
        }

    }
}
