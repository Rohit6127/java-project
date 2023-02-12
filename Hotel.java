/**
 * Hotel
 */
import java.util.Scanner;
public class Hotel 
{
    public static void main(String[] args) 
    {
        int MasalaPapad=40,RoastPapad=30,FryPapad=25,Matkifry=70,Pannerchilli=90;
        int ChickenTandoor=300,BangdaFry=200,MuttonRan=250,ChickenKabab=350,BoiledEgg=30;
        int PannerTikka=190,VegMaratha=200,KajuKari=180,PalakPanner=210,PannerKabab=250;
        int ChickenCuryy=190,MuttonCurry=210,FishCurry=180,EggCuryy=160,Fishfry=170;
        int Roti=15,ButterRoti=20,Naan=30,ButterNaan=35,GarlicNaan=40;
        int IceCream=50,Basundi=50,GulabJamun=50;
        int sum=0,ch,ch1=0,ch2=0,ch3=0,ch4=0,ch5=0,ch6=0,loop=1,loop2=1,loop3=1,loop4=1,loop5=1,loop6=1,loop7=1; // loop variable
        int m1=0,m2=0,m3=0,m4=0,m5=0,Vegstartertotal=0; //Veg starter variable
        int a1=0,a2=0,a3=0,a4=0,a5=0,NonVegstartertotal=0; //Non veg Starter variable
        int b1=0,b2=0,b3=0,b4=0,b5=0,VegMaincoursetotal=0; //Veg Main Course variable
        int c1=0,c2=0,c3=0,c4=0,c5=0,NonVegMaincoursetotal=0; //Non-Veg Main Course Variable
        int d1=0,d2=0,d3=0,d4=0,d5=0,Bradetotal=0; // Brades variable
        int e1=0,e2=0,e3=0,Desertstotal=0; //Desert variable
        Scanner s=new Scanner(System.in);
        while(loop==1)
        {
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("\tRK The Classic Restaurant");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("\t\tStarter Menu");
            System.out.println("");
            System.out.println("1.Veg Starter");
            System.out.println("2.Non-Veg Starter");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("\t\tMain Course");
            System.out.println("");
            System.out.println("3.Veg Main Course");
            System.out.println("4.Non-Veg Main Course");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("\t\tBrades");
            System.out.println("");
            System.out.println("5.Brades");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("\t\tDeserts");
            System.out.println("");
            System.out.println("6.Deserts");
            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("Please Enter Your Choice :-");
            ch=s.nextInt();

            switch(ch)
            {
                case 1: //Veg Starter Case
                System.out.println("\t\tVeg Starter");
                System.out.println("");
                while(loop2==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Masala Papad\t\t="+"\t\t"+MasalaPapad);
                    System.out.println("2.Roast Papad\t\t="+"\t\t"+RoastPapad);
                    System.out.println("3.Fry Papad\t\t="+"\t\t"+FryPapad);
                    System.out.println("4.Matki Fry\t\t="+"\t\t"+Matkifry);
                    System.out.println("5.Panner Chilli\t\t="+"\t\t"+Pannerchilli);
                    System.out.println("");
                    System.out.println("Please Choose Which Starter you want :-");
                    ch1=s.nextInt();

                    switch(ch1)
                    {
                        case 1:
                        ch1=0;
                        System.out.println("");
                        System.out.println("Masala Papad");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch1=s.nextInt();
                        m1+=MasalaPapad*ch1;
                        break;

                        case 2:
                        ch1=0;
                        System.out.println("");
                        System.out.println("Roast Papad");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch1=s.nextInt();
                        m2+=RoastPapad*ch1;
                        break;

                        case 3:
                        ch1=0;
                        System.out.println("");
                        System.out.println("Fry Papad");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch1=s.nextInt();
                        m3+=FryPapad*ch1;
                        break;

                        case 4:
                        ch1=0;
                        System.out.println("");
                        System.out.println("Matki Fry");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch1=s.nextInt();
                        m4+=Matkifry*ch1;
                        break;

                        case 5:
                        ch1=0;
                        System.out.println("");
                        System.out.println("Panner Chilly");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch1=s.nextInt();
                        m5+=Pannerchilli*ch1;
                        break;

                        default:
                        System.out.println("Please Select Valid choice ...!");

                    }
                    Vegstartertotal=m1+m2+m3+m4+m5;
                    System.out.println("");
                   System.out.println("Do you want to return in Starter Menu Press 1 or Not Press 0");
                    loop2=s.nextInt();

                }

                break;

                case 2://Non Veg Starter
                System.out.println("\t\tNon-Veg Starter");
                System.out.println("");
                while(loop3==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Chicken Tandoor\t="+"\t\t"+ChickenTandoor);
                    System.out.println("2.Bangda Fry\t\t="+"\t\t"+BangdaFry);
                    System.out.println("3.Mutton Ran\t\t="+"\t\t"+MuttonRan);
                    System.out.println("4.Chicken Kabab\t\t="+"\t\t"+ChickenKabab);
                    System.out.println("5.Boilled Egg\t\t="+"\t\t"+BoiledEgg);
                    System.out.println("");
                    System.out.println("Please Choose Which Starter you want :-");
                    ch2=s.nextInt();
                    
                    switch(ch2)
                    {
                        case 1:
                        ch2=0;
                        System.out.println("");
                        System.out.println("Chicken Tandoor");
                        System.out.println("");
                        System.out.println("Please Enter Quantity:");
                        ch2=s.nextInt();
                        a1+=ChickenTandoor*ch2;
                        break;

                        case 2:
                        ch2=0;
                        System.out.println("");
                        System.out.println("Bangda Fry");
                        System.out.println("");
                        System.out.println("Please Enter Quantity:");
                        ch2=s.nextInt();
                        a2+=BangdaFry*ch2;
                        break;

                        case 3:
                        ch2=0;
                        System.out.println("");
                        System.out.println("Mutton Ran");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch2=s.nextInt();
                        a3+=MuttonRan*ch2;
                        break;

                        case 4:
                        ch2=0;
                        System.out.println("");
                        System.out.println("Chicken Kabab");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch2=s.nextInt();
                        a4+=ChickenKabab*ch2;
                        break;

                        case 5:
                        ch2=0;
                        System.out.println("");
                        System.out.println("Boiled Egg");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch2=s.nextInt();
                        a5+=BoiledEgg*ch2;
                        break;

                        default:
                        System.out.println("Please Enter Valid Choice...!");

                    }
                    NonVegstartertotal=a1+a2+a3+a4+a5;
                    System.out.println("Do you want to return in Starter Menu Press 1 or Not Press 0");
                    loop3=s.nextInt();

                }
                break;

                case 3: //Veg Main course
                System.out.println("");
                System.out.println("\t\tVeg main Course");
                System.out.println("");
                while(loop4==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Panner Tikka\t\t="+"\t\t"+PannerTikka);
                    System.out.println("2.Veg Maratha\t\t="+"\t\t"+VegMaratha);
                    System.out.println("3.Kaju Kari\t\t="+"\t\t"+KajuKari);
                    System.out.println("4.Panner Lajawab\t="+"\t\t"+PannerKabab);
                    System.out.println("5.Palak Panner\t\t="+"\t\t"+PalakPanner);
                    System.out.println("");
                    System.out.println("Please Choose which you want main course: ");
                    ch3=s.nextInt();

                    switch(ch3)
                    {
                        case 1:
                        ch3=0;
                        System.out.println("");
                        System.out.println("Panner Tikka");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity: ");
                        ch3=s.nextInt();
                        b1+=PannerTikka*ch3;
                        break;

                        case 2:
                        ch3=0;
                        System.out.println("");
                        System.out.println("Veg Maratha ");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch3=s.nextInt();
                        b2+=VegMaratha*ch3;
                        break;

                        case 3:
                        ch3=0;
                        System.out.println("");
                        System.out.println("Kaju Kari");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch3=s.nextInt();
                        b3+=KajuKari*ch3;
                        break;
                        
                        case 4:
                        ch3=0;
                        System.out.println("");
                        System.out.println("Panner Kabab");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity: ");
                        ch3=s.nextInt();
                        b4+=PannerKabab*ch3;
                        break;

                        case 5:
                        System.out.println("");
                        System.out.println("Palak Panner");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity: ");
                        ch3=s.nextInt();
                        b5+=PalakPanner*ch3;
                        break;

                        default:
                        System.out.println("Please Select valid Choice ...!");
                    }
                    VegMaincoursetotal=b1+b2+b3+b4+b5;
                    System.out.println("Do you want to contiune Veg Main Course Press 1 or Not Press 0 ");
                    loop4=s.nextInt();


                }

                break;

                case 4: // Non-Veg Main COurse
                System.out.println("\t\tNon-veg Main Course");
                System.out.println("");
                while(loop5==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Chicken Curry\t\t="+"\t\t"+ChickenCuryy);
                    System.out.println("2.Fish Curry\t\t="+"\t\t"+FishCurry);
                    System.out.println("3.Mutton Curry\t\t="+"\t\t"+MuttonCurry);
                    System.out.println("4.Egg Curyy\t\t="+"\t\t"+EggCuryy);
                    System.out.println("5.Fish Fry\t\t="+"\t\t"+Fishfry);
                    System.out.println("");
                    System.out.println("Please Select the Non-veg Main Course:-");
                    ch4=s.nextInt();

                    switch(ch4)
                    {
                        case 1:
                        ch4=0;
                        System.out.println("");
                        System.out.println("Chicken Curry");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch4=s.nextInt();
                        c1+=ChickenCuryy*ch4;
                        break;

                        case 2:
                        ch4=0;
                        System.out.println("");
                        System.out.println("Fish Curry");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch4=s.nextInt();
                        c2+=FishCurry*ch4;
                        break;

                        case 3:
                        ch4=0;
                        System.out.println("");
                        System.out.println("Mutton Curry");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch4=s.nextInt();
                        c3+=MuttonCurry*ch4;
                        break;

                        case 4:
                        ch4=0;
                        System.out.println("");
                        System.out.println("Egg Curry");
                        System.out.println("");
                        System.out.println("Please Enter The Quantity:");
                        ch4=s.nextInt();
                        c4+=EggCuryy*ch4;
                        break;

                        case 5:
                        ch4=0;
                        System.out.println("");
                        System.out.println("Fish Fry");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity: ");
                        ch4=s.nextInt();
                        c5+=Fishfry*ch4;
                        break;

                        default:
                        System.out.println("Please Select the Valid Choice ...!");

                    }
                    NonVegMaincoursetotal=c1+c2+c3+c4+c5;
                    System.out.println("Do you want to return in Non-veg Main Course Press 1 or Not Press 0");
                    loop5=s.nextInt();

                }

                break;

                case 5: // Brades
                System.out.println("\t\tBrades");
                System.out.println("");
                while(loop6==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Roti\t\t\t="+"\t\t"+Roti);
                    System.out.println("2.Butter Roti\t\t="+"\t\t"+ButterRoti);
                    System.out.println("3.Naan\t\t\t="+"\t\t"+Naan);
                    System.out.println("4.Butter Naan\t\t="+"\t\t"+ButterNaan);
                    System.out.println("5.Garlic Naan\t\t="+"\t\t"+GarlicNaan);
                    System.out.println("");
                    System.out.println("Please Select the Brade:");
                    ch5=s.nextInt();

                    switch(ch5)
                    {
                        case 1:
                        ch5=0;
                        System.out.println("");
                        System.out.println("Roti");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch5=s.nextInt();
                        d1+=Roti*ch5;
                        break;

                        case 2:
                        ch5=0;
                        System.out.println("");
                        System.out.println("Butter Roti");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch5=s.nextInt();
                        d2+=ButterRoti*ch5;
                        break;

                        case 3:
                        ch5=0;
                        System.out.println("");
                        System.out.println("Naan");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch5=s.nextInt();
                        d3+=Naan*ch5;
                        break;

                        case 4:
                        ch5=0;
                        System.out.println("");
                        System.out.println("Butter Naan");
                        System.out.println("");
                        System.out.println("Please Enter The Quantity:");
                        ch5=s.nextInt();
                        d4+=ButterNaan*ch5;
                        break;

                        case 5:
                        ch5=0;
                        System.out.println("");
                        System.out.println("Garlic Naan");
                        System.out.println("");
                        System.out.println("Enter the Quantity:");
                        ch5=s.nextInt();
                        d5+=GarlicNaan*ch5;
                        break;

                        default:
                        System.out.println("Please Select Valid Choice ...!");

                        

                    }
                    Bradetotal=d1+d2+d3+d4+d5;
                    System.out.println("Do you want to return Brades Press 1 or No Press 0");
                    loop6=s.nextInt();

                }
                break;

                case 6: //Deserts
                System.out.println("\t\tDeserts");
                System.out.println("");
                while(loop7==1)
                {
                    System.out.println("Item"+"\t\t\t\t\t"+"Price");
                    System.out.println("");
                    System.out.println("1.Ice-Cream\t\t="+"\t\t"+IceCream);
                    System.out.println("2.Basundi\t\t="+"\t\t"+Basundi);
                    System.out.println("3.Gulab Jamun\t\t="+"\t\t"+GulabJamun);
                    System.out.println("");
                    System.out.println("Please Select the Desert ");
                    ch6=s.nextInt();

                    switch(ch6)
                    {
                        case 1:
                        ch6=0;
                        System.out.println("");
                        System.out.println("Ice-Cream");
                        System.out.println("");
                        System.out.println("Please Enter the Quantity:");
                        ch6=s.nextInt();
                        e1+=IceCream*ch6;
                        break;

                        case 2:
                        ch6=0;
                        System.out.println("");
                        System.out.println("Basundi");
                        System.out.println("");
                        System.out.println("Please Enter the Quatity:");
                        ch6=s.nextInt();
                        e2+=Basundi*ch6;
                        break;

                        case 3:
                        ch6=0;
                        System.out.println("");
                        System.out.println("Gulab Jamun");
                        System.out.println("");
                        System.out.println("Pease Enter the Quantity:");
                        ch6=s.nextInt();
                        e3+=GulabJamun*ch6;
                        break;

                        default:
                        System.out.println("Please Select the Valid Choice ...!");

                    }
                    Desertstotal=e1+e2+e3;
                    System.out.println("Do you want to return in Desert Menu Press 1 or Not Press 0");
                    loop7=s.nextInt();

                }
                break;


                default:
                System.out.println("Please select valid Choice ...!");



            }System.out.println("Do you want to contiune Menu Card Press 1 or Not Press 0 ");
       loop=s.nextInt();
       sum+=Vegstartertotal+NonVegstartertotal+VegMaincoursetotal+NonVegMaincoursetotal+Bradetotal+Desertstotal;
       System.out.println("-----------------------------------------------------------------------");
       System.out.println("\tRK The Classic Restaurant");
       System.out.println("-----------------------------------------------------------------------");
       System.out.println("");
       System.out.println("Item\t\tPrice\t\tQuantity\t\tTotal");
       System.out.println("");
       if(m1>0)
       {
        System.out.println("Masala Papad"+"\t"+MasalaPapad+"\t\t" +ch1+"\t\t\t"+m1);
       }
       if(m2>0)
       {
        System.out.println("Roast Papad"+"\t"+RoastPapad+"\t\t" +ch1+"\t\t\t"+m2);
       }
       if(m3>0)
       {
        System.out.println("Fry Papad"+"\t"+FryPapad+"\t\t" +ch1+"\t\t\t"+m3);
       }
       if(m4>0)
       {
        System.out.println("Matki Fry"+"\t"+Matkifry+"\t\t" +ch1+"\t\t\t"+m4);
       }
       if(m5>0)
       {
        System.out.println("Panner Chilli"+"\t"+Pannerchilli+"\t\t" +ch1+"\t\t\t"+m5);
       }
       if(a1>0)
       {
        System.out.println("Chicken Tandoor"+"\t"+ChickenTandoor+"\t\t" +ch2+"\t\t\t"+a1);
       }
       if(a2>0)
       {
        System.out.println("Bangda Fry"+"\t"+BangdaFry+"\t\t" +ch2+"\t\t\t"+a2);
       }
       if(a3>0)
       {
        System.out.println("Mutton Ran"+"\t"+MuttonRan+"\t\t" +ch2+"\t\t\t"+a3);
       }
       if(a4>0)
       {
        System.out.println("Chicken Kabab"+"\t"+ChickenKabab+"\t\t" +ch2+"\t\t\t"+a4);
       }
       if(a5>0)
       {
        System.out.println("Boilled Egg"+"\t"+BoiledEgg+"\t\t" +ch2+"\t\t\t"+a5);
       }
       if(b1>0)
       {
        System.out.println("Panner Tikka"+"\t"+PannerTikka+"\t\t" +ch3+"\t\t\t"+b1);
       }
       if(b2>0)
       {
        System.out.println("Veg Maratha"+"\t"+VegMaratha+"\t\t" +ch3+"\t\t\t"+b2);
       }
       if(b3>0)
       {
        System.out.println("Kaju Kari"+"\t"+KajuKari+"\t\t" +ch3+"\t\t\t"+b3);
       }
       if(b4>0)
       {
        System.out.println("Panner Lajwab"+"\t"+PannerKabab+"\t\t" +ch3+"\t\t\t"+b4);
       }
       if(b5>0)
       {
        System.out.println("Palak Panner"+"\t"+PalakPanner+"\t\t" +ch3+"\t\t\t"+b5);
       }
       if(c1>0)
       {
        System.out.println("Chicken Curry"+"\t"+ChickenCuryy+"\t\t" +ch4+"\t\t\t"+c1);
       }
       if(c2>0)
       {
        System.out.println("Fish Curry"+"\t"+FishCurry+"\t\t" +ch4+"\t\t\t"+c2);
       }
       if(c3>0)
       {
        System.out.println("Mutton Curry"+"\t"+MuttonCurry+"\t\t" +ch4+"\t\t\t"+c3);
       }
       if(c4>0)
       {
        System.out.println("Egg Curry"+"\t"+EggCuryy+"\t\t" +ch4+"\t\t\t"+c4);
       }
       if(c5>0)
       {
        System.out.println("Fish Fry"+"\t"+Fishfry+"\t\t" +ch4+"\t\t\t"+c5);
       }
       if(d1>0)
       {
        System.out.println("Roti"+"\t"+Roti+"\t\t" +ch5+"\t\t\t"+d1);
       }
       if(d2>0)
       {
        System.out.println("Butter Roti"+"\t"+ButterRoti+"\t\t" +ch5+"\t\t\t"+d2);
       }
       if(d3>0)
       {
        System.out.println("Naan"+"\t"+Naan+"\t\t" +ch5+"\t\t\t"+d3);
       }
       if(d4>0)
       {
        System.out.println("Butter Naan"+"\t"+ButterNaan+"\t\t" +ch5+"\t\t\t"+d4);
       }
       if(d5>0)
       {
        System.out.println("Garlic Naan"+"\t"+GarlicNaan+"\t\t" +ch5+"\t\t\t"+d5);
       }
       if(e1>0)
       {
        System.out.println("Ice-cream"+"\t"+IceCream+"\t\t" +ch6+"\t\t\t"+e1);
       }
       if(e2>0)
       {
        System.out.println("Basundi"+"\t"+Basundi+"\t\t" +ch6+"\t\t\t"+e2);
       }
       if(e3>0)
       {
        System.out.println("Gulab Jamun"+"\t"+GulabJamun+"\t\t" +ch6+"\t\t\t"+e3);
       }
       
       System.out.println("-----------------------------------------------------------------------");
       System.out.println("Your Total Bill :-"+sum);//total bill print here
       System.out.println("-----------------------------------------------------------------------");
       System.out.println("Thanks for Coming...!Please visit Agian");

            




        }

        


        
    }

    
}