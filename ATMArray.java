import java.util.Scanner;
/* getAthentication() // get pin and account number and verify
    displayMainMenu()
    display withdrawalamt()
*/
public class ATMArray{
    public static void main(String [] args){
        Scanner myScan = new Scanner(System.in);
        int [] accountNumber = {99999,88888,77777,66666,55555};
        int [] pin = {1216,1091,4822,2350,7385};
        double [] totalBalance = {1000,250,500,800,900};
        int [] withdrawAmount = {20,40,60,100,200,300}; 
        int deposit;
        int choice;
        int userAcct;
        int userPin;
        int input;
        int indexArray;
        boolean found = false;
        final int BALANCE_INQUIRY = 1;
        final int WITHDRAWAL = 2;
        final int DEPOSIT = 3;
        final int EXIT = 4;
        System.out.println("Enter your account number");
        userAcct = //MethodExample1.getInt(myScan);
        indexArray = 0;
        boolean correctAcct = checkAcct(userAcct,accountNumber);
        if(!correctAcct){
            System.out.println("Program exits");
        }
        else{
            System.out.println("Enter pin");
            userPin = myScan.nextInt();
            if (userPin != pin[indexArray]){
                System.out.println("You entered an invalid pin");
            }
            else{
            do{
                System.out.println("\nMain menu:");
                System.out.println("1 - View my balance");
                System.out.println("2 - Withdraw Cash");
                System.out.println("3 - Deposit funds");
                System.out.println("4 - Exit\n");
                System.out.println("Enter your choice");
                choice = myScan.nextInt();
                switch (choice){
                    case BALANCE_INQUIRY: 
                       System.out.println("\nBalance Information:");
                       System.out.println("  -  Total balance: ");
                       System.out.println(totalBalance[indexArray]);
                       break;
                    case WITHDRAWAL: 
                            System.out.println("\nWithdrawal Menu: ");
                            System.out.println("1 - $" + withdrawAmount[0]);
                            System.out.println("2 - $"+ withdrawAmount[1]);
                            System.out.println("3 - $"+ withdrawAmount[2]);
                            System.out.println("4 - $" + withdrawAmount[3]);
                            System.out.println("5 - $" + withdrawAmount[4]);
                            System.out.println("6 - $" + withdrawAmount[5]);
                            System.out.println("7 - Cancel transaction");
                            input = myScan.nextInt();
                            switch (input){
                                case 1:
                                  if (totalBalance[indexArray] > withdrawAmount[0]){
                                      totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[0];
                                      System.out.println("Remove your money from machine");
                                      System.out.println("Total Balance " + totalBalance[indexArray]);
                                    }
                                  else 
                                      System.out.println("Insufficient Funds");
                                  break;
                                  case 2:
                                    if (totalBalance[indexArray] > withdrawAmount[1]){
                                        totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[1];
                                        System.out.println("Remove your money from machine");
                                        System.out.println("Total Balance " + totalBalance[indexArray]);
                                    }
                                    else 
                                        System.out.println("Insufficient Funds");
                                    break;
                                    case 3:
                                        if (totalBalance[indexArray] > withdrawAmount[2]){
                                            totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[2];
                                            System.out.println("Remove your money from machine");
                                            System.out.println("Total Balance " + totalBalance[indexArray]);
                                        }
                                    else 
                                        System.out.println("Insufficient Funds");
                                    break;
                                    case 4:
                                        if (totalBalance[indexArray] > withdrawAmount[3]){
                                            totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[3];
                                            System.out.println("Remove your money from machine");
                                            System.out.println("Total Balance " + totalBalance[indexArray]);
                                         }
                                        else 
                                            System.out.println("Insufficient Funds");
                                        break;
                                    case 5:
                                        if (totalBalance[indexArray] > withdrawAmount[4]){
                                            totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[4];
                                            System.out.println("Remove your money from machine");
                                            System.out.println("Total Balance " + totalBalance[indexArray]);
                                        }
                                        else 
                                            System.out.println("Insufficient Funds");
                                        break;
                                    case 6:
                                        if (totalBalance[indexArray] > withdrawAmount[5]){
                                            totalBalance[indexArray] = totalBalance[indexArray] - withdrawAmount[5];
                                            System.out.println("Remove your money from machine");
                                            System.out.println("Total Balance " + totalBalance[indexArray]);
                                        }
                                        else 
                                            System.out.println("Insufficient Funds");
                                        break;
                                    case 7:
                                        System.out.println("Canceled Transaction");
                                    break;
                            }
                            break;
                    case DEPOSIT:
                        System.out.println("Enter deposit amount");
                        deposit = myScan.nextInt();
                        totalBalance[indexArray] = totalBalance[indexArray] + deposit;
                        System.out.println("Place you envelope in machine");
                        System.out.println("Total Balance " + totalBalance[indexArray]);
                    break;
                    case EXIT:
                        System.out.println("Have a nice Day");
                        break;
                    default:
                        System.out.println("Invalid Value Entered");
            }

        }
            while(choice != EXIT);
            
        }
    }
}
public static boolean checkAcct(int userAcct, int[] accountNumber){
    boolean found = false;
    for (int indexArray = 0; indexArray < accountNumber.length; indexArray++)
    if(userAcct == accountNumber[indexArray]){
        found = true;
        break;
    }
    if(!found){
        System.out.println("You entered an invalid accountNumber");
    }
    return false;
}
}