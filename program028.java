import java.util.Scanner;

class program28 {

    public static void main(String A[]) {

        Scanner scanner = null;

        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;    // error

        scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        sName = scanner.next();                      // excepion (if we enter full name , it takes only first word , space cha pudhcha saglya goshti sodun dete , ani mag iAge madhe te jate ani mag input mismatch cha error yeto)

        System.out.println("enter your age : ");
        iAge = scanner.nextInt();

        System.out.println("enter your marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Welcome " + sName + " bhayyyyy.");
        System.out.println("your age is " + iAge + " years.");
        System.out.println("you have got "+ fMarks + " marks.");
    }
}


// loosy conversion in f means extra data khali padel (if we try to put 8 byte data into 4 byte , extra 4 byte harvel )