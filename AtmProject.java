import java.util.Scanner;

 public class AtmProject 
{
    public static void main(String[] args) 
    {
        int Deposite,ch,count,loop=1,Withdraw=0;
        double  balance=10000,x;
        int n100=0,n200=0,n500=0,n2000=0;
        while(loop==1)
        {
            System.out.println("***Menu***");
            System.out.println("1)Deposite");
            System.out.println("2)Withdraw");
            System.out.println("3)Check Balance");
            System.out.println("4)Exit");
            Scanner s =new Scanner(System.in);
            System.out.println("Enter your choice=");
            ch=s.nextInt();
            n100=0;n200=0;n500=0;n2000=0;
            switch(ch)
            {
                case 1:
                System.out.println("You are Selected Deposite");
                System.out.println("Enter your amount you want to deposite=");
                Deposite = s.nextInt();
                balance=10000+Deposite;
                System.out.println("Your New balance ="+balance);
                break;
                case 2:
                System.out.println("Your selected Withdrawn");
                System.out.println("Enter the Amount you want to withdrawn");
                Withdraw = s.nextInt();
                if(Withdraw <= balance)
                {
                    x=balance-Withdraw;
                    balance=balance-Withdraw;

                    while(Withdraw>2500)
                    {
                        
                        Withdraw=Withdraw-2000;
                        n2000++;
                    }
                    System.out.println("2000*"+n2000);
                    
                    while(Withdraw>500)
                    {
                        Withdraw=Withdraw-500;
                        n500++;
                    }
                    System.out.println("500*"+n500);

                    while(Withdraw>100)
                    {
                        Withdraw=Withdraw-200;
                        n200++;
                    }
                    System.out.println("200*"+n200);

                    while(Withdraw>0)
                    {
                        Withdraw=Withdraw-100;
                        n100++;
                    }
                    System.out.println("100*"+n100);

                   System.out.println("***Collect the Cash***");
                    System.out.println("Withdraw Succesfully...!");
                    System.out.println("Availabe balance ="+x);
                    

                }
                else 
                {
                    System.out.println("Insufficient Fund ");
                }
                break;
                case 3:
                System.out.println("You are Selected Check Balance");
                System.out.println("***Your Balance*** ="+balance);
                break;
                case 4:
                System.out.println("***Exited Succesfully***");
                System.exit(1);

                default :
                System.out.println("Please Select Valid Number");

            }
        }
        
        
    }

    
}