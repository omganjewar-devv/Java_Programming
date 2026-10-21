import java.util.Scanner;

class program62
{
    public static void main(String A[])
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        Iteration iteration = new Iteration();

        System.out.println("enter the no of time you want to print : ");
        iValue = scanner.nextInt();

        iteration.Display(iValue);

    }
}

class Iteration
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            System.out.println("-----------------------");
            System.out.println(iCnt + " Ganpati Bappa Morya...");
            System.out.println("-----------------------");
        }
    }
}

