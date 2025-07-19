import java.util.Scanner;
class grade {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR MARKS ");
        Scanner md = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS IN ENGILSH : ");
        int a = md.nextInt();
        System.out.println("ENTER YOUR MARKS IN MATHS : ");
        int b = md.nextInt();
        System.out.println("ENTER YOUR MARKS IN SCIENCE : ");
        int c = md.nextInt();
        int SUM = a+b+c;
        float percent=SUM/3f;
        System.out.println("*****REPORT CARD *****");
        System.out.println("YOUR TOTAL MARKS IS :"+SUM);
        System.out.println("YOUR PERCENTAGE IS :"+percent);
        md.close();



    }
}

