
package work04;


public class BankAccount {
//    4.2 Create a public class named "BankAccount" in package named "work04".
//          This class contains the following field and methods.
//          4.2.1 a private "number" field of type "int".
//          4.2.1 a private "owner" field of type "Person".
//          4.2.2 a private "balance" field of type "double".
//          4.2.3 a public constructor that receives a "number" parameter and
//                an "owner" parameter to set the "number" and "owner" fields.
//          4.2.4 public getter methods for "owner" and "balance" fields.
//          4.2.5 a public "deposit" method that receives an "amount" 
//                parameter of type "double" and returns a "double". 
//                This method adds the "amount" to the "balance" to set
//                the new value of the "balance" and returns this new value.
//          4.2.6 a public "withdraw" method that receives an "amount"
//                parameter of type "double" and returns a "double".
//                This method subtracts the "amount" to the "balance" to set
//                the new value of the "balance" and returns this new value.
//          4.2.7 a public "transfer" method that receives an "amount" 
//                parameter of type "double" and an "account" parameter of 
//                type "BankAccount". This method



//                "withdraws" the "amount" from the "balance" ofzzzobject and

//                "deposits" the "amount" to the "balance" of the "account" object



//                (in the parameter). This methods returns nothing.
//          4.2.8 @Override a public "toString" method that 
//                returns a "String" of value "BankAccount(id,)" 
//                where "id" is the "id" field.
//      4.3 Show in this "work04UseOfObjectClass" method how to use 
//          each method of "Person" and "BankAccount" objects.    
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public Person getOwner() {
        return owner;
    }
    
    public double deposit(double amount){
        balance += amount;
        //balance = balance + amount;
        return balance;
    }
    
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
    
    public void transfer(double amount, BankAccount account){
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", ID=" + owner.getId() +
                ", balance=" + balance +
                '}';
    }
}
