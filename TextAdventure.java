import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        int trust = 50;
        int happiness = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my game! Please select a name.");
        String name = sc.nextLine();

        boolean nameFinished = false;
        while (nameFinished == false) {

            System.out.println("Your name is " + name
                    + " right? Press 1 if this is the case, and input anything else if you wish to reselect your name");
            String check = sc.nextLine();
            if ("1".equals(check)) {
                nameFinished = true;
            } else {
                System.out.println("Please select a name.");
                name = sc.nextLine();
            }

        }
        System.out.println("Nice to meet you " + name
                + ". In this game, you will write and receive letters from August, a 21 year old college student who you became pen pals with after meeting online. \n You will have the option as to how to respond to these letters, and your choices will affect the outcome of the story. You will now receive the first letter.");
        System.out.print("\n \n \n");
        System.out.println("Dear " + name + ", \n"
                + "It's nice to meet you! I'm August. I've never had a pen pal before, so forgive me if my letters aren't of the best quality. Although school and my job mostly keeps me busy, I like to surf, scuba dive, and collect fountain pens in my free time.");
        System.out.println(
                "I recently got into writing physical letters through the same friend that got me into collecting fountain pens; I've probably spent too much money on them, but they're quite fun to write with. I like art, so I get a bit of use out of them there when I do calligraphy, but they're TREMENDOUS wastes of money.");
        System.out.println(
                "But that's enough about me. I'd like to get to know you better- although if you want to know more about me feel free to ask.");
        boolean outputFinished = false;
        String check = new String();
        boolean aboutSelf = false;
        while (outputFinished == false) {
            System.out.println("Press 1 to ask more about August. Press 2 to tell them about yourself");
            check = sc.nextLine();
            if (check.equals("1")) {
                happiness += 5;
                outputFinished = true;
                aboutSelf = true;

            }
            if (check.equals("2")) {
                trust += 5;
                outputFinished = true;
            }

        }
        outputFinished = false;
        System.out.println(" \n \n \n ");
        System.out.println("Two weeks pass before you recieve your next letter.");

        if (aboutSelf) {
            System.out.println("Dear " + name
                    + ",\n You wrote that you wanted to know more about me. I dont think I have too many interesting points, aside from what I've already told you, but I do like to read quite a bit- I especially like Russian literature.");
            System.out.println(
                    "What interests do you have? I'd like to get to know more about you- I think I've said enough about myself");
        }
        if (!aboutSelf) {
            System.out.println(
                    "It's nice to get to know more about you! Over the past two weeks, I've been reading a lot- one of the classes I'm taking requires me to. Do you have a favorite book?");

        }
        while (outputFinished == false) {
            System.out.println("Press 1 to ask about August's favorite book. Press 2 to tell them about yours");
            check = sc.nextLine();
            if (check.equals("1")) {
                happiness += 5;
                outputFinished = true;
                aboutSelf = true;

            }
            if (check.equals("2")) {
                trust += 5;
                outputFinished = true;
            }

        }
        outputFinished = false;
        System.out.println(
                "There's more to this letter, like how their classes are going, but none of it is really interesting, and is mostly there to fill space");
        System.out.print("\n \n \n");
        outputFinished = false;
        boolean inCompetition = false;
        if (trust >= 60) {
            System.out.println("Dear " + name
                    + ",\n Recently, I recieved an opportunity to enter an art competition. One of my friends referred me for it- I guess they thought I was good enough.");
            System.out.println(
                    "I haven't really done anything similar to it before, but even so, I'd be embarassed if my stuff wasn't well received. Plus, school's been pretty overwhelming lately");
            System.out.println(
                    "On the other hand, I don't really know when I'd get the chance to do something like this again. Do you think I should enter?");
            while (outputFinished == false) {
                System.out.println("Press 1 to encourage them to join the competition. Press 2 to dissuade them.");
                check = sc.nextLine();
                if (check.equals("1")) {
                    happiness += 5;
                    trust += 5;
                    outputFinished = true;
                    inCompetition = true;

                }
                if (check.equals("2")) {

                    happiness -= 5;
                    outputFinished = true;
                }
                System.out.println("END OF DEMO.");
            }

        } else {
            System.out.println(
                    "August shoots you a quick note about being too busy to communicate frequently until midterms are over, but promises to stay in touch. The next time you hear from them will be in a while, but they promise to send you a long update.");
            System.out.println("END OF DEMO.");
        }

    }
}