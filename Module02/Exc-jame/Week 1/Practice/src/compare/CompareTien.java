package compare;

import entity.Human;

import java.util.Comparator;

public class CompareTien implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getTien() - o2.getTien();
    }
}
