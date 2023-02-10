public class Main {
    public static void main(String[] args) {

        String myParagraph = "My Name is dwip Sarker. I am a student. how are you?";

        CalculateParagraph calculateParagraph = new CalculateParagraph();
        System.out.println("Number of vowel is :"+ calculateParagraph.getVowel(myParagraph));
        System.out.println("Number of Consonant is :"+ calculateParagraph.getConsonant(myParagraph));
        System.out.println("Number of words is :"+ calculateParagraph.getWord(myParagraph));




    }

}