public class DriverApplication {
    public static void main(String[] args) {
        //DriverApplication-- Driver program to test built random sentences
        //CSIS 312-BO3
        //Assignment heading
        System.out.println("Stanley Soman - Assignment 4\n"); // Heading

        //create Sentence object and call its getSentence
        Sentence createSentence = new Sentence();

        //for loop to call getSentence 20 times
        for (int i = 0; i<=19;i++) {
            createSentence.getSentence();
        }
        //end for loop
    } //end main

} //end DriverApplication
