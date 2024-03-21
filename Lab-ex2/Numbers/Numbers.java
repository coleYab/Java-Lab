public class Program{
    public int num1;
    public int num2;
    public int num3;
    public int ex_no;

    public Program3(int num1, int num2, int num3)
    {
        this.ex_no = 1;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public boolean checkIfPossible()
    {
        return ((num1 + num2 == num3) || (num1 == num2 + num3) ||
                (num2 == num1 + num3));
    }
    public Program3(int num1, int num2) {
        this.ex_no = 2;
        this.num1 = num1;
        this.num2 = num2;
    }

    private int abs(int val) {
        return ((val >= 0) ? (val) : (-1 * val));
    }
    public int checkNearest(){
        return ((num1 == num2 || num1 == -1 * num2) ? (0) :(
                this.abs((100 - num1)) > abs((100 - num2))
                ) ? (num2) : (num1));
    }
    public boolean checkRightmostDigit(){
        return ((num1 + num2 == num3) || (num1 == num2 + num3));
    }

    public static void question3(){
        char check = 'y';
        Scanner cin = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int num1 = cin.nextInt();
            System.out.print("Enter a number:");
            int num2 = cin.nextInt();
            System.out.print("Enter a number:");
            int num3 = cin.nextInt();

            Program3 demo = new Program3(num1, num2, num3);

            System.out.println("Result " + demo.checkRightmostDigit());

            System.out.print("Do you want to continue\n Enter y or Y: ");
            check = cin.next().charAt(0);
        } while (check == 'y' || check == 'Y');
    }

    public static void question4(){
        char check = 'y';
        Scanner cin = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int num1 = cin.nextInt();
            System.out.print("Enter a number:");
            int num2 = cin.nextInt();

            Program3 demo = new Program3(num1, num2);

            System.out.println("Result " + demo.checkNearest());

            System.out.print("Do you want to continue\n Enter y or Y: ");
            check = cin.next().charAt(0);
        } while (check == 'y' || check == 'Y');
    }
    public static void question2(){
        char check = 'y';
        Scanner cin = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int num1 = cin.nextInt();
            System.out.print("Enter a number:");
            int num2 = cin.nextInt();
            System.out.print("Enter a number:");
            int num3 = cin.nextInt();

            Program3 demo = new Program3(num1, num2, num3);

            System.out.println("Result " + demo.checkIfPossible());

            System.out.print("Do you want to continue\n Enter y or Y: ");
            check = cin.next().charAt(0);
        } while (check == 'y' || check == 'Y');
    }

    public static void main(String []args) {
        int choice;
        Scanner cin = new Scanner(System.in);

        System.out.println("Demo for question2, 3, 4");
        System.out.print("Enter the number of the question for demo: ");
        choice = cin.nextInt();
        switch (choice) {
            case 2:
                Main.question2();
                break;
            case 3:
                Main.question3();
                break;
            case 4:
                Main.question4();
                break;
            default:
                System.out.printf("%d is invalid number\n Rerun the program again\n", choice);
        }
    }
}

}
