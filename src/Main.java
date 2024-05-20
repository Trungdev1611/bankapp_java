import java.util.Scanner;

public class Main implements bankworking {
    static int amountMoney = 0;
    public Main()  {

    }

    void showOption() {
        System.out.println("What do you want to do now?");
        System.out.println("Press 1 and Enter: get Balance");
        System.out.println("Press 2 and Enter: withdraw money");
        System.out.println("Press 3 and Enter: deposit money");
    }
    Scanner myObj = new Scanner(System.in);
    void getInput() {

        int optionSelect = myObj.nextInt();
        switch (optionSelect) {
            case 1 -> getBalance();
            case 2 -> withDraw();
            case 3 -> deposit();
            default -> System.out.println("Your selection is not appropriate");


        }

    }

    public void isContinueProcess() {
        System.out.println("Do you want to execute any different task?");
        System.out.println("Press 1 to continue or any different number to exit");
        int optionSelect = myObj.nextInt();
        if(optionSelect == 1) {
            showOption();
            getInput();
        }

    }
    @Override
    public void getBalance() {
        System.out.println("Your balance: " + amountMoney);
        isContinueProcess();
    }

    @Override
    public void withDraw() {
        System.out.println("Enter the amount that you want to withdraw:");
        System.out.println("Your balance: " + amountMoney);
        int amountMoneyWithDraw = myObj.nextInt();
        if(amountMoney >= amountMoneyWithDraw ) {
            amountMoney = amountMoney - amountMoneyWithDraw;
            System.out.println("Your withdrawal statement succeed");
        }
        else {
            System.out.println("Your balance is not enough");
        }
        getBalance();
    }

    @Override
    public void deposit() {
        System.out.println("Enter the amount that you want to deposit:");
        int amountMoneyDeposit= myObj.nextInt();
        amountMoney = amountMoney + amountMoneyDeposit;
        System.out.println("Your deposit statement succeed");
        getBalance();
    }

    public static void main(String[] args) {
        Main bankApp = new Main();
        bankApp.showOption();
        bankApp.getInput();
    }
}
