package second;

import java.util.ArrayList;

public class PetList extends ArrayList<Pets> {

    public void printAll() {
        for (Pets cat : this) {
            System.out.println(cat);
        }
    }

}
