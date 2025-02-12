public class MyMoney {
    private long dollars;
    private long cents;

    public MyMoney(double amount){
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }
    public MyMoney(MyMoney otherObject){
        this.dollars = otherObject.dollars;
        this.cents =otherObject.cents;
    }
    public void add(MyMoney otherObject){
        this.dollars += otherObject.dollars;
        this.cents += otherObject.cents;
        if (this.cents >= 100){
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    }
    public void subtract(MyMoney otherObject){
        this.dollars -= otherObject.dollars;
        this.cents -= otherObject.cents;
        if (this.cents < 0){
            this.dollars -= 1;
            this.cents += 100;
        }
    }
    public int compareTo(MyMoney otherObject) {
        if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents > otherObject.cents)) {
            return 1;
        } else if (this.dollars < otherObject.dollars || (this.dollars == otherObject.dollars && this.cents < otherObject.cents)) {
            return -1;
        }
        return 0;
    }
    public boolean equals(MyMoney otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }
    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }



}
