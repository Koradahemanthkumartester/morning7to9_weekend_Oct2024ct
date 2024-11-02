package nov1st2024;

public class LoopingConcepts {
    public static void main(String[] args) {
        // Loops are used to execute a set of statements multiple times
        //Keeps on running until the condition is satisfied

        //Diffrent loops in Java
        //1.for loop
        //2.While loop
        //3.Do while loop
        //

     int  a=200;
     int  b=300;
     String  c="Automation Training";


        while(a<b)
        {
            System.out.println(a);
            System.out.println(b);
            while(b%2==0)

            {
                System.out.println(c.subSequence(b%b,c.length()));
               // c=c.substring(b%b,c.length()-1)+c.concat("");
                break; //come out of loop immediately
            }
            b=b-1;
            a=a+1;
        }
        System.out.println("**********************************************************");

        a=30;

        do {
            System.out.println("Value pf a:  +" + a);
            a=a+1;
        }
         while(a<20);

           a=300;
            do {
                System.out.println("value of a: "+ a);
                a=a-1;
            }
            while (a>250);
        System.out.println("**************************************************");

        a=500;
         do{
             System.out.println("value of a: "+ a );
             a=a-1;

         }
         while (a%2!=0);

        int x = 3;
        int y = x++ + ++x;
               // 3+5 =8
        System.out.println(y);



        System.out.println("***********************************************************");
        int m = 2;
        int n = m++ * 2 + ++m;
               //2 *2+ 4 = 8
        System.out.println(n);


        int h = 1;
        int k = 2;
        int i = h++ + ++k + h++;
               // 1+3+2=6
        System.out.println(i);

        int l = 0;
        int j = 0;
        int result = l++ + ++j + l++ + ++j + l++;
        //           o+1+1+2+2=6
        System.out.println(result);


        int z = 5;
        int o = 10;
        int g = z++ + ++o + z++ + o++ + ++z;
               //5(6)+11+6(7)+11+8g
              // 5+11+6+11+8=41
        System.out.println(g);




        // https://docs.google.com/document/d/153Ltaqy5kAYtaKaqV6Sm4dI_IcrB6E_jlTtRt4gbih8/edit?usp=sharing

        }

    }


