package nov1st2024;

public class ForLoopConcepts {
    public static void main(String[] args) {
        //For loop : Loop Keeps on running until the condition is satisfied

        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i is: " + i);

        }
        System.out.println(("*********************************************"));
        for(int j=0;j<200;j=j+2)
        {
         if(j==100)
         {
             System.out.println("Inner loop");
             int k=0;
             while(k<20)
             {
                 System.out.println(k);
                 k= k++ + ++k + --k;
             }
             System.out.println("***************************");
         }
         else
             System.out.println(j);

        }
        String s3= "Three students are partaking in the class";
        //Since we have notgiven any iteration part ,so it will go to infinite loop
         for(int j=0;j<s3.length();){

             System.out.println(s3);
             break;
         }

        System.out.println("***************************************");

         for (int j=1,k=10;j<100 && k<200 ;j=j*2,k=k+3)
         {
             System.out.println(j+k);
         }
        System.out.println("****************************************");


    //// Infinite loop - very important interview question

     for(;;){
         System.out.println("Dummy");
         break;

     }
        System.out.println("*************");

     //Ternary Operator
     //syntax: (condition) ? value1 :value2
        // if the condition is true ,value1 will be printed
        //if the condition is false , value 2 will be printed

        int j=10;
        j = (j==10) ? 20 :30;
        System.out.println(j);
        System.out.println("****************************");

        for(int k=0;k<1000;k=(k!=0) ? k*10 :k+10)
        {
            System.out.println(k);
        }







    }
}









