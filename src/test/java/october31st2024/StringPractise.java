package october31st2024;

import java.lang.constant.Constable;

public class StringPractise {
    public static void main(String[] args) {



        String a = "This my first string that iam learning \n";
     // System.out.println(a.charAt(15));
     // System.out.println(a.charAt(31));

        System.out.println(a.startsWith("my",5));
        //System.out.println(a.startsWith(8,8));

        System.out.println(a.replace("first","second"));

        System.out.println(a.replace("FIRST","Second"));

        System.out.println(a.substring(6));
        System.out.println(a.substring(15));
       // Throws stringsIndexoutofbounds exception
        //System.out.println(a.substring(500));
        System.out.println(a.substring(10,20));
        System.out.println(a.substring(15,30));

        //Throws stringsindexoutof bounds exception
        //System.out.println(a.substring(30,15));

        System.out.println(a.repeat(6));

        System.out.println(a.indexOf("iam"));

        //Unmodifable string //
        Constable s= "Hemanth";

        String s3= "Police";
        s3.describeConstable();
        System.out.println(s3);

        //Prints the AsCII value of character at particular index position of the string
        System.out.println(s3.codePointAt(4));

        String s6 = "i am an automation test engieer in infosys ";

        //from the second index position ,it checks whether the string starts with "am" whose legth is 2
        System.out.println(s6.regionMatches(2,"am",0,2));

        // Print 6 spaces start of the string
        System.out.println(s6.indent(6));







    }
}