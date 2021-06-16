public class StringTask {
    public static void main(String[] args) {
        String firstName="vasya";
        String secondName="petrenko";
        System.out.println(createFullName(firstName,secondName));
        System.out.println(generateUID(firstName,secondName));


    }

    public static String createFullName (String s1, String s2) {
        String one = String.join(" ", s1.toUpperCase(), s2.toUpperCase());
        return one;
    }
    public static String generateUID (String s1, String s2) {
        String one = String.join("", s1.toUpperCase(), s2.toUpperCase());
        int id=one.length();
        String temp=Integer.toString(id);
        String two = String.join("_", s1.toUpperCase(), s2.toUpperCase(), temp);

        return two;
    }
}
