public class Vocal {

    /**
     *
     * @param letra PRE: Letra : {'a'-'z' , 'A'-'Z'}
     * @return POST: true si letra {a, e, i ,o, u, A, E, I, O, U}
     */
    boolean isVowel(char letra){
        //String vowels = "aiouy&@";
        String vowels = "aouy";// en este caso ahora , e esta perdido.
        char ch = Character.toLowerCase(letra);
        return vowels.indexOf(ch) >= 0;
    }
}
