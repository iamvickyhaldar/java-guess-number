import java.util.Scanner;
class GuessNumber
{
    public static void main(String[] args)
    {
        // demo
        Scanner sc = new Scanner(System.in);

        int myNumber = (int)(Math.random()*100);

        int userNumber = 0;
        do{
            System.out.println("Guess My Number(1-100)");
            userNumber = sc.nextInt();


            if(myNumber == userNumber)
            {
                System.out.println("You're Correct");
                break;
            }
            else if(myNumber > userNumber)
            {
                System.out.println("Your number is too Smaller");
            }
            else if(myNumber < userNumber)
            {
                System.out.println("Your number is too larger");
            }
        }
        while(userNumber >= 0);
        System.out.println("My number was : " + myNumber);
    } 
}