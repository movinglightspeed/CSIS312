public class Sentence {

    //Sentence-- Used to build sentence and capital first letter
    //CSIS 312-BO3
    Word word = new Word();

    //getSentence method
    public void getSentence() {

        //select a word at random from each array
        StringBuilder word1 = new StringBuilder(word.getArticle());
        StringBuilder word2 = new StringBuilder(word.getNoun());
        StringBuilder word3 = new StringBuilder(word.getVerb());
        StringBuilder word4 = new StringBuilder(word.getPreposition());
        StringBuilder word5 = new StringBuilder(word.getArticle());
        StringBuilder word6 = new StringBuilder(word.getNoun());

        //Create Capital first letter string
        String word1Capital = word1.toString().substring(0,1).toUpperCase();

        //Delete first smaller case letter
        word1.delete(0,1);

        //Insert capital letter in its place
        word1.insert(0,word1Capital);

        //Print out StringBuilder variables
        System.out.printf("%s%n",word1.append(" ").append(word2).append(" ")
                .append(word3).append(" ").append(word4).append(" ").append(word5).append(" ").append(word6).append("."));
    } //end getSentence method
} //end class Sentence
