package second;

import java.util.ArrayList;

public class CatList extends ArrayList<Cats> {

    public void printAll() {
        for (Cats cat : this) {
            System.out.println(cat);
        }
    }

}
