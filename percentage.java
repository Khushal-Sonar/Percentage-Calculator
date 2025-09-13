import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\t• PERCENTAGE CALCULATOR •\n \n \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Subjects: ");
        int total_sub = sc.nextInt();
        System.out.println();
       System.out.print("Enter the Max Marks of Subject: ");
        int max_Marks = sc.nextInt();
        System.out.println();
        int total = (total_sub * max_Marks);
        System.out.printf("Enter your subjects & marks obtained (Out of %d): \n\n", max_Marks);
        int sum = 0;
        for(int i=0; i<total_sub ; i++){
            System.out.print("Subject: ");
            String sub = sc.next();
            System.out.print("Marks obtained: ");
            int sub1 = sc.nextInt();
            if(sub1 <= max_Marks){
                sum = sum + sub1;
            }else {
                System.out.println("Enter valid Marks!");
            }
        }
        float percentage = sum * 100.00f / total;
        
            System.out.println("\n\n\n\n \t • RESULT •");
        System.out.print("Your Score is: " + percentage + "%");
    }
}