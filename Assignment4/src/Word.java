//import Random generator
import java.util.Random;
public class Word {
        //Word-- Used to generate random words
        // CSIS 312-BO3

        //four word arrays
        String[] article ={"the","a","one","some","any"};
        String[] noun = {"boy","girl","dog","town","car"};
        String[] verb = {"drove","jumped","ran","walked","skipped"};
        String[] preposition = {"to","from","over","under","on"};

        //Generates random number up to number of values in array
        int randomgenerator() {
            Random randomGenerator = new Random();

            //Obtain a number between [0-4]
            int random = randomGenerator.nextInt(5);
            return random;
        }

        //getter methods
        //i is a value 0-4 in the String array
        public String getArticle() {
            int i = randomgenerator();
            return article[i];
        }
       //i is a value 0-4 in the String array
        public String getNoun() {
            int i = randomgenerator();
            return noun[i];
        }
        //i is a value 0-4 in the String array
        public String getVerb() {
            int i = randomgenerator();
            return verb[i];
        }
         //i is a value 0-4 in the String array
        public String getPreposition() {
            int i = randomgenerator();
            return preposition[i];
        }

} // end Word class
