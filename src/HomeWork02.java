public class HomeWork02 {
    public static void main(String[] args) {

        String frase = "Java Core";
        String[] words = {"first", "true", "world", "boss", "car", "crocodile", "cucumber"};
        char[] fraseMas = stringToMas(frase);
        System.out.println(fraseMas);
        System.out.println(longWord(words));
        System.out.println(shortWord(words));
    }

    public static char[] stringToMas (String s1) {
        String one = s1.toUpperCase();
        String two = one.replace(" ", "_");
        char[] result = two.toCharArray();
        return result;
    }

    public static String shortWord (String[] mas){
        String min=mas[0];
       for (int i=0; i<mas.length; i++){
           if (mas[i].length()<min.length())
               min=mas[i];
       }

        return min;
    }

    public static String longWord (String[] mas){
        String max= new String();
        for (int i=0; i<mas.length; i++){
            if (mas[i].length()>max.length())
                max=mas[i];
        }

        return max;
    }
}
