public class Lesson04 {
    public static void main(String[] args) {
        String id = "UX-45528-AB";
        System.out.println(extractNumberFrom(id));
        System.out.println(replaceDashes(id));
    }

    public static int extractNumberFrom(String s1){
        int one=s1.indexOf("-");
        int two=s1.lastIndexOf("-");
        String number = s1.substring(one+1,two);
         int extract = Integer.valueOf(number);
        return extract;
    }

    public static String replaceDashes(String s1){
        String replace = s1.replace("-","_");
        return replace;
    }
}
