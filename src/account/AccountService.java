package account;

public class AccountService {

    void deposit(double amount,Account account)
    {

        if (amount>0)
        {
            account.balance+=amount;
        }
        else
            System.out.println("deposit amount should be > 0");


    }
    void withDraw(double amount, Account account)
    {

        if (amount<=account.balance&&account.balance-amount>Account.minBal)
        {
            account.balance-=amount;
        }
        else
            System.out.println("insufficient balance ");
    }

    void details(Account account)
    {
        System.out.println(account.cusName);
        System.out.println(account.accNum);
        System.out.println(account.ifsc);
        System.out.println(account.balance);
    }

}
