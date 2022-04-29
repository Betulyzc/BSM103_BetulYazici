public class Account {
    int money;
    String name;
    Account(String name,int money){
        this.name=name;
        this.money=money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
