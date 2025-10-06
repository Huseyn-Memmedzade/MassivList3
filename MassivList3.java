package arraylist;

import java.util.ArrayList;

public class MassivList3 {

    public static void main(String[] args) {

        ArrayList<String> kitablar = new ArrayList<>();

        kitablar.add("Səfillər");
        kitablar.add("Cinayət və Cəza");
        kitablar.add("Don Kixot");


        System.out.println("Sizin Teleb Etdiyiniz 2-ci kitab budur : " + kitablar.get(1));
        System.out.println("Səfillər ve Don Kixot kitablarini refe geri qaytardiq");

    }


}
