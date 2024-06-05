package account;

public class Test {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();

        Account cus1=new Account();
        cus1.accNum="123";
        cus1.cusName="Bashir";
        cus1.ifsc="SBIN001";
        cus1.balance=5000;

        accountService.deposit(1000,cus1);
        accountService.withDraw(5700,cus1);
        accountService.details(cus1);

        Account cus2=new Account();
        cus2.accNum="456";
        cus2.cusName="Nashir";
        cus2.ifsc="SBIN002";
        cus2.balance=3000;
        accountService.deposit(1000,cus2);
        accountService.withDraw(5700,cus2);
        accountService.details(cus2);

    }
}
