import java.util.*;

public class PhraseOMatic {
    public static void main(String[] args) {
        
        // make three sets of words choose from.Add your own!
        String[] wordListOne = {"agnostic", "opinionated",
                                "voice activated","haptically driven","extensible",
                                "reactive","agent based","functional","AI enabled",
                                "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous",
                                "event driven","pub-sub","IoT","cloud native",
                                "service oriented","containerized","serverless",
                                "microserces","distributed ledger"};
        String[] wordListThree = {"framework","library","DSL","REST API","repository",
                                "pipeline","service mesh","architecture","perspective","design",
                                "orientation"};
        
        // find out how words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random RandomGenerator = new java.util.Random();
        int rand1 = RandomGenerator.nextInt(oneLength);
        int rand2 = RandomGenerator.nextInt(twoLength);
        int rand3 = RandomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out phrase
        System.out.println("What we need is a " + phrase);
    }
}
