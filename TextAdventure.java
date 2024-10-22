import java.util.Scanner;
public class TextAdventure {
    public static void main(String[] args){
            int trust =50;
            int happiness = 50;
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to my game! Please select a name.");
            String name = sc.nextLine();
           
            boolean nameFinished = false;
            while(nameFinished==false){

                System.out.println("Your name is "+ name+ " right? Press 1 if this is the case, and input anything else if you wish to reselect your name");
                String check = sc.nextLine();
                if ("1".equals(check)) {
                    nameFinished=true;
                }
                else{
                    System.out.println("Please select a name.");
                     name = sc.nextLine();
                }
            
            }
            System.out.println("Nice to meet you "+name+". In this game, you will write and receive letters from");

    }

}
