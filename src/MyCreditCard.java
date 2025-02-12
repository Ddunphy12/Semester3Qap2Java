public class MyCreditCard {
    private MyMoney balance = new MyMoney(0);
    private MyMoney creditLimit;
    private MyPerson owner;

    public MyCreditCard(MyPerson newCardHolder, MyMoney creditLimit){
        this.owner = newCardHolder;
        this.creditLimit = creditLimit;
    }
    public MyMoney getBalance(){
        return this.balance;
    }

    public MyMoney getCreditLimit(){
        return this.creditLimit;
    }

    public String getPersonals(){
        return this.owner.toString();
    }
    public void charge(MyMoney amount){
        MyMoney credit = new MyMoney(this.getBalance());
        credit.add(amount);
        if (credit.compareTo(this.getCreditLimit()) == 1) {
            System.out.println("Exceeds credit limit");
        } else {
            this.balance.add(amount);
        }
    }

    public void payment(MyMoney amount) {
            this.balance.subtract(amount);
    }
}

