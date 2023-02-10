import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateParagraph {
    private int totalWords;
    private int totalVowel;
    private int totalConsonants;

    // COUNT TOTAL WORD
    private void totalWord(String paragraph){
        String[] splitParagraph = paragraph.split("");
        totalWords = splitParagraph.length;
    }

    // VOWEL AND CONSONANT COUNTER METHOD
    private void countVowelConsonant(String paragraph){

        // PARAGRAPH OPERATION
        String[] splitParagraph = paragraph.replace(" ","").split("");
        Pattern patternAlphabet = Pattern.compile("[a-z]",Pattern.CASE_INSENSITIVE);
        Pattern patternVowel = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);

        for(String charter : splitParagraph){
            Matcher alphabetMatcher = patternAlphabet.matcher(charter);
            boolean ifAlphabet = alphabetMatcher.find();

            // CHECK ALPHABET
            if(ifAlphabet){
                Matcher vowelMatcher = patternVowel.matcher(charter);
                boolean ifVowel = vowelMatcher.find();

                // COUNT VOWEL AND CONSONANT
                if(ifVowel){
                    totalVowel = totalVowel+1;
                }else{
                    totalConsonants = totalConsonants+1;
                }
            }
        }
    }

    // ALL THE GETTERS
    public int getWord(String paragraph){
        totalWord(paragraph);
        return totalWords;
    }

    public int getVowel(String paragraph){
        countVowelConsonant(paragraph);
        totalConsonants=0;
        return totalVowel;
    }

    public int getConsonant(String paragraph){
        countVowelConsonant(paragraph);
        totalVowel=0;
        return totalConsonants;
    }

}
