public class TestMyCreditCard {

    public static void main (String [] args) {

        final MyMoney LIMIT = new MyMoney(1000); final MyMoney FIRST_AMOUNT = new MyMoney(200); final MyMoney SECOND_AMOUNT = new MyMoney(10.02); final MyMoney THIRD_AMOUNT = new MyMoney(25); final MyMoney FOURTH_AMOUNT = new MyMoney(990); MyPerson owner = new MyPerson("Christie", "Diane", new MyAddress("237J Harvey Hall","Menomonie", "WI" , "54751")); MyCreditCard visa = new MyCreditCard(owner, LIMIT); System.out.println(visa.getPersonals()); System.out.println("Balance: " + visa.getBalance()); System.out.println("Credit Limit : " + visa.getCreditLimit()); System.out.println(); System.out.println("Attempt to charge " + FIRST_AMOUNT);

        visa.charge(FIRST_AMOUNT); System.out.println("Balance : " + visa.getBalance()); System.out.println("Attempt to charge " + SECOND_AMOUNT); visa.charge(SECOND_AMOUNT); System.out.println("Balance : " + visa.getBalance()); System.out.println("Attempt to pay " + THIRD_AMOUNT); visa.payment(THIRD_AMOUNT);
        System.out.println("Balance : " + visa.getBalance());

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);

        visa.charge(FOURTH_AMOUNT);

        System.out.println("Balance : " + visa.getBalance());


    }

}
