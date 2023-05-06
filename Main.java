import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HelloPrint();
        TwoString();
        Compare();
        SumAvg();
       operations();
        int array[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = array.length;
        int k = 3;
        System.out.println(Unique(array, n, k));
        vowels();
        splitStr();


    }

    public static void HelloPrint(){
        System.out.println("Hello World");
    }

    public static void TwoString() {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please Enter Two Strings: ");
        String S1= scanner.nextLine();
        String S2= scanner.nextLine();
        System.out.println(S1+" "+S2);
    }

    public static void TowString2(String S1, String S2)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Please Enter Two Strings: ");
        String x= scanner.nextLine();
        String y= scanner.nextLine();

        x=S1;
        y=S2;
        System.out.println(S1+ " "+ S2);
    }

    public static void Compare (){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 3 Numbers To Compare Them: ");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int compare1= Math.max(n1,n2);
        int compare2= Math.max(compare1,n3);
        System.out.println("The Greatest Number IS: "+ compare2);



    }

        public static void SumAvg()
        {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter 3 Numbers To Get There AVG + SUM: ");
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            int n3=scanner.nextInt();
           int sum=n1+n2+n3;
           int avg = sum/3;
            System.out.println("The Sum is : "+ sum + "\nThe Avg Is: "+ avg);


        }

        public static void operations()
        {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter 2 Numbers To Do An Operations: ");
            int n1=scanner.nextInt();
            int n2=scanner.nextInt();
            int sum=n1+n2;
            int avg = sum/2;
            int mult = n1*n2;
            int divide =n1/n2;
            int power = n1^n2;
            System.out.println("Select The Operation You Want");
            System.out.println("(1): Sum\n(2): AVG\n(3): Multiply\n(4): Divide\n(5): Power");
            int op = scanner.nextInt();
            switch (op){

                case 1:
                {
                    System.out.println("The Sum Result is: "+ sum);
                    break;
                }

                case 2:
                {
                    System.out.println("The Avg Result is: "+ avg);
                    break;

                }
                case 3:
                {
                    System.out.println("The Multiply Result is: "+ mult);
                    break;

                }
                case 4:
                {
                    System.out.println("The Divide Result is: "+divide);
                    break;

                }
                case 5:
                {
                    System.out.println("The Power Result is: "+power);
                    break;
                }
                default:
                    System.out.println(" Wrong choice");

            }


        }

    static int Unique(int array[], int n, int k)
    {

        byte sizeof_int = 4;
        int INT_SIZE = 8 * sizeof_int;
        int count[] = new int[INT_SIZE];


        for (int i = 0; i < INT_SIZE; i++)
            for (int j = 0; j < n; j++)
                if ((array[j] & (1 << i)) != 0)
                    count[i] += 1;


        int res = 0;
        for (int i = 0; i < INT_SIZE; i++)
            res += (count[i] % k) * (1 << i);


        res = res / (n % k);

        return res;
    }


        public static void vowels()

        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the string you want to count vowels in: ");
            String str = scanner.nextLine();
            int count=0;
            for (int i=0; i<str.length(); i++)
            {
                char ch=str.charAt(i);
                if(ch=='i'|| ch=='o'||ch=='a'||ch=='e'||ch=='u')
                {
                    count++;
                }
            }
            System.out.println("Number of vowels in your String is "+count);
        }

        public static void splitStr()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the string you want to Split (put spaces between letters): ");
            String str = scanner.nextLine();
            String[] arr = str.split(" ", 0);

            for (String x : arr)
                System.out.println(x);
        }

}















