package com.itea.pim.hanna_styslo;

import com.itea.pim.hanna_styslo.user.User;

public class Application {
    public static void main(String[] args) {
        User userFirst = new User();
        userFirst.setName("Tom");
        userFirst.setSurname("Mot");
        userFirst.setEmail("tom@mot.uy");
        userFirst.setLogin("onefirst");
        userFirst.setPassword("fewfeww");
        userFirst.displayInfo();

        User userSecond = new User();
        userSecond.setName("Polo");
        userSecond.setSurname("Marco");
        userSecond.setEmail("polo@marco.uy");
        userSecond.setLogin("twosecond");
        userSecond.setPassword("evevevve");
        userSecond.displayInfo();

        User userThird = new User();
        userThird.setName("Alex");
        userThird.setSurname("Xela");
        userThird.setEmail("alex@xela.uy");
        userThird.setLogin("threethird");
        userThird.setPassword("evevefve");
        userThird.displayInfo();

         User user4 = new User("Polo","Loop","vssai@sxn.uy","dassa","swdxqsd");
         User user5 = new User("Polo","Loop","vssai@sxn.uy","dassa","swdxqsd");


    }

}
