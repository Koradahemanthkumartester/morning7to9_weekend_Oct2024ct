package nov1st2024;

public class PreandPostincrements {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int total = x++ + ++y + z++ + ++x + y++;
        //1(2)+3+3(4)+3+3=13
        System.out.println(total);

    }
}
