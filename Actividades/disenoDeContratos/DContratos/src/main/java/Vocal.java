public class Vocal {
    boolean isVowel(char letra){
        String vowels = "aeiouy&@";
        char ch = Character.toLowerCase(letra);
        return vowels.indexOf(ch) >= 0;
    }
}
