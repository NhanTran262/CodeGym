package compare;

import entity.Human;

import java.util.Comparator;

public class CompareDepTrai implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getDoDepTrai() - o2.getDoDepTrai();
    }
}
