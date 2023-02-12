/**
 * CoffeMachine
 */
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
 public class CoffeMachine 
{
    public static void main(String[] args) 
    {
        int tankwater=5000,tankmilk=5000,tanksugar=3000,tankcoffe=2000,water=50,milk=200,sugar=10,Lattecoffe=5,Capichinocoffe=7,Expessocoffe=10;
        int tankcup=50,cup=1,lprice=90,cprice=110,eprice=150,ch,ch1=0,loop1=1,loop=1,loop3=1,coffee1=0,coffee2=0,coffee3=0;
        int l=0,c=0,e=0,total=0;
        int Latte=0; int Capichino=0; int Expesso=0;
        while(loop==1)
        {
            System.out.println("-------------------------------------");
            System.out.println("\t\tMenu");
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println("1.Buy");
            System.out.println("2.Fill");
            System.out.println("3.Exit");
            Scanner s=new Scanner(System.in);
            System.out.println("");
            System.out.println("Please Enter your Choice");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Welcome to Coffee Menu");
                while(loop1==1)
                {
                    System.out.println("");
                    System.out.println("\t\tMENU");
                    System.out.println("");
                    System.out.println("1.Latte\t\t\t\t90rs");
                    System.out.println("2.Capichino\t\t\t110rs");
                    System.out.println("3.Expesso\t\t\t150rs");
                    //System.out.println("4.Bill");
                    System.out.println("");
                    System.out.println("Select the Coffee");
                    ch=s.nextInt();
                    
                    
                    switch(ch)
                    {
                        case 1:
                        if(tankcoffe>0)
                       {
                        System.out.println("***************************");
                        System.out.println("Latte Coffee"); //water 50ml,milk 200ml,sugar,10gm,coffe 5gm,cup 1
                        System.out.println("***************************");  
                        System.out.println("What quantity you want");
                       
                        coffee1=s.nextInt();
                        Latte=coffee1;
                        l=lprice*coffee1;
                        tankwater-=water*coffee1;
                        tankmilk-=milk*coffee1;
                        tanksugar-=sugar*coffee1;
                        tankcoffe-=Lattecoffe*coffee1;
                        tankcup-=cup*coffee1;
                        System.out.println("");
                        // System.out.println("Your total Latte Coffee bill to pay ="+l);
                       }
                       else 
                       {
                        System.out.println("Out Of Stock...!");
                       }
                        



                        break;

                        case 2:
                        if(tankcoffe>0)
                        {
                        System.out.println("***************************");
                        System.out.println("Capichino Coffee");
                        System.out.println("***************************");
                        System.out.println("What quantity you want");
                        coffee2=s.nextInt();
                        Capichino=coffee2;
                       
                        c=cprice*coffee2;
                        tankwater-=water*coffee2;
                        tankmilk-=milk*coffee2;
                        tanksugar-=sugar*coffee2;
                        tankcoffe-=Capichinocoffe*coffee2;
                        tankcup-=cup*coffee2;
                        System.out.println("");
                        //System.out.println("Your total Capichino Coffee bill to pay ="+c); //water 50ml,milk 200ml,sugar,10gm,coffe 7gm,cup 1
                        }
                        else 
                        {
                            System.out.println("Out of Stock...!");
                        }
                        break;

                        case 3:
                        if(tankcoffe>0)
                        {
                        System.out.println("***************************");
                        System.out.println("Expesso Coffee");
                        System.out.println("***************************");  
                        System.out.println("What quantity you want");
                        coffee3=s.nextInt();
                        Expesso=coffee3;
                        e=eprice*coffee3;
                        tankwater-=water*coffee3;
                        tankmilk-=milk*coffee3;
                        tanksugar-=sugar*coffee3;
                        tankcoffe-=Expessocoffe*coffee3;
                        tankcup-=cup*coffee3;
                        System.out.println("");
                        //System.out.println("Your total Expesso coffee bill to pay ="+e); //water 50ml,milk 200ml,sugar,10gm,coffe 10gm,cup 1
                        }
                        else 
                        {
                            System.out.println("Out of stock...!");
                        }
                        break;

                        //case 4:
                        // total=l+c+e;
                        // System.out.println("**************************************************************");
                        // Latte=1*coffee1;
                        // System.out.println("Total quantity of Latte ="+Latte);
                        // Capichino=1*coffee2;
                        // System.out.println("Total quantity of Capichino ="+Capichino);
                        // Expesso=1*coffee3;
                        // System.out.println("Total quantity of Expesso ="+Expesso);
                        // System.out.println("**************************************************************");
                        // System.out.println("total bill="+total);
                        // System.out.println("Thanks for Coming...! Visit Again");
                        // break;


                        default:
                        System.out.println("Please Select the valid choice");
                    }
                   System.out.println("");
                    System.out.println("Do you want to continue in Coffee Menu:\n Press 1 for yes and 0 for no");
                    loop1=s.nextInt();
                }
                break;

                case 2:
                System.out.println("Machine Fill Incrediants");
                System.out.println("");
                System.out.println("Avalaible water="+tankwater);
                System.out.println("Avalaible Milk="+tankmilk);
                System.out.println("Avalaible Sugar="+tanksugar);
                System.out.println("Avalaible Coffe="+tankcoffe);
                System.out.println("Avalaible Coffe="+tankcup);
                System.out.println("");
                System.out.println("");
                System.out.println("you required to fill water="+(5000-tankwater)+"ml");
                System.out.println("you required to fill milk="+(5000-tankmilk)+"ml");
                System.out.println("you required to fill Sugar="+(3000-tanksugar)+"gm");
                System.out.println("you required to fill water="+(2000-tankcoffe)+"gm");
                System.out.println("you required to fill Cup="+(50-tankcup)+"unit");
                System.out.println("");
                while(loop3==1)
                {
                    System.out.println("   Menu   ");
                    System.out.println("1.Water");
                    System.out.println("2.Milk");
                    System.out.println("3.Sugar");
                    System.out.println("4.Coffee");
                    System.out.println("5.Cup");
                    System.out.println("*****************************************************");
                    System.out.println("Select what you want to fill");
                    System.out.println("*****************************************************");
                    ch1=s.nextInt();
                    switch(ch1)
                    {
                        case 1:
                        System.out.println("Fill the water what you want");
                        l=s.nextInt();
                        if(l+tankwater<=5000)
                        {
                           
                            tankwater=tankwater+l;
                            System.out.println("Total Water="+tankwater);
                        }
                        else 
                        {
                            System.out.println("Please fill the only required water ");
                        }
                        break;

                        case 2:
                        System.out.println("Fill the milk what you want");
                            c=s.nextInt();
                        if(c+tankmilk<=5000)
                        {
                            
                            tankmilk=tankmilk+c;
                            System.out.println("Total milk="+tankmilk);
                        }
                        else 
                        {
                            System.out.println("Please fill the only required milk ");
                        }
                        
                        break;

                        case 3:
                        System.out.println("Fill the Sugar what you want");
                        l=s.nextInt();
                        if(l+tanksugar<=3000)
                        {
                           
                            tanksugar=tanksugar+l;
                            System.out.println("Total Sugar="+tanksugar);
                        }
                        else 
                        {
                            System.out.println("Please fill the only required Sugar ");
                        }
                        break;

                        case 4:
                        System.out.println("Fill the coffee what you want");
                        l=s.nextInt();
                        if(l+tankcoffe<=2000)
                        {
                           
                            tankcoffe=tankcoffe+l;
                            System.out.println("Total Cup="+tankcoffe);
                        }
                        else 
                        {
                            System.out.println("Please fill the only required coffee ");
                        }
                        break;

                        case 5:
                        System.out.println("Fill the cup what you want");
                        l=s.nextInt();
                        if(l+tankcup<=50)
                        {
                            tankcup=tankcup+l;
                            System.out.println("Total Cup="+tankcup);
                        }
                        else 
                        {
                            System.out.println("You Don't fill than only required cup ");
                        }
                        break;

                        default:
                        System.out.println("Please Select Valid ");
                        

                    }
                    System.out.println("");
                    System.out.println("Do you want to continue:\n Press 1 for yes and 0 for no");
                            loop3=s.nextInt();
        

                }
                break;

                case 3:
                 total=l+c+e;
                 System.out.println("------------------------------------------");
                 if(coffee1>0)
                 {
                    System.out.println("Total quantity of Latte :-"+Latte);
                 }
                 if(coffee2>0)
                 {
                    System.out.println("Total quantity of Capichino :-"+Capichino);
                 }
                 if(coffee3>0)
                 {
                    System.out.println("Total quantity of Expesso :-"+Expesso);
                 }
                 System.out.println("------------------------------------------");
                 System.out.println("total bill="+total);
               System.out.println("Thanks for using Coffe machine...! Have a Nice Day");
               System.exit(1);
                break;

                

                default:
                System.out.println("Please Enter Valid Choice");
            }
            // System.out.println("Do you want to continue in Main menu:\n Press 1 for yes and 0 for no");
            // loop=s.nextInt();
            


        }
        
        

        
    }

    
}