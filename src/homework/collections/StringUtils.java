package homework.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringUtils {
    public List<String> getDuplicates(List<String> words) {
        List<String> dupLicates = new ArrayList<String>();
        Iterator<String> Iter = words.iterator();
        while (Iter.hasNext()) {
            String word = Iter.next();
            if (dupLicates.contains(word)) {
                dupLicates.add(word);
            } }


                return dupLicates;
        }

    public String  getLongestWord(List<String> words){
        int max = 0;
        String word="";
        for (String s : words) {
            if (s.length() > max) {
                word = s;
            }
        }
        return word;
    }

    }

