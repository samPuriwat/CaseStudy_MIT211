public class ExchangeCurrencyApp {

    public static void main(String[] args) {

        ExchangeAPI2 ex = new ExchangeAPI2();

        // test connection with THB
        if (ex.getConnection("THB")) {
            System.out.println(ex.getResult());
        }





    }
}
