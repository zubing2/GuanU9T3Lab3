import java.util.ArrayList;

public class Comedian extends Performer {
    private ArrayList<String> jokes;

    // EXERCISE 1: try swapping the two lines of code
    // below so that the call to super() comes AFTER
    // the initialization of jokes. Does it work?
    // What does the compiler error tell you?
    // Swap it back so that it compiles.
    public Comedian(String name, int age, Agent agent) {
        super(name, age, agent);
        jokes = new ArrayList<String>();
    }

    public void writeJoke(String joke) {
        jokes.add(joke);
    }

    // EXERCISE 2: Override the callAgent() method below so that
    // instead of printing "I am calling my agent! Siri, dial 646-555-5555"
    // it prints: "Let me run this new joke past my agent! Siri, dial 646-555-5555"
    // Then uncomment test code for Exercise 2 in Main.java and test

    public void callAgent() {
        System.out.println("Let me run this new joke past my agent! Siri, dial " + getAgent().getCellPhoneNum());
    }

    // EXERCISE 3: as you saw in exercise 1, when calling a superclass' CONSTRUCTOR from
    // a subclass' constructor, super MUST be the first line of code; is that the case for
    // calls to non-constructor methods in the superclass?
    //
    // In the code below, try swapping the two lines of code; does it compile
    // or do you get the same error as in exercise 1?
    // If it does compile, run test code for Exercise 3 to test
    @Override
    public void printInfo() {
        System.out.println("I will make you laugh!");
        super.printInfo(); // this calls the SUPERCLASS version of printInfo
    }

    // Exercise 4: Override the perform() method so that the output for
    // the Exercise 4 test code in Main.java prints:
    // "Performing for an audience! Performance #1"
    // followed by EACH joke on a NEW line

    public void perform() {
        super.perform();
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    // Exercise 5: PREDICT what this will print when
    // the Exercise 5 test code in Main.java is executed;
    // THEN uncomment and run the test code to see... any surprises?
    // which calls to callAgent produce the same result?  how about to rehearse?
    public void randomMethod() {
        super.callAgent();
        this.callAgent();
        callAgent();

        super.rehearse();
        this.rehearse();
        rehearse();
    }

    //EXERCISE 6:  Write an OVERLOADED version of the inherited
    //    rehearse() method with a boolean parameter performAfter;
    //    the method should do the standard rehearsal,
    //    followed by perform if performAfter is true.

    public void rehearse(boolean performAfter) {
        rehearse();
        if (performAfter) {
            perform();
        }
    }

}