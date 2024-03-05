package src.exo22;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {
    int n;
    int n1;
    int rangActuel;
    int borne;

    
    
    public FiboIterator(int borne) {
        this.borne = borne;
        n=0;
        n1=1;
        rangActuel=0;
    }

    @Override
    public boolean hasNext() {
        return rangActuel < borne;
    }

    @Override
    public Integer next() {
        int n2 = n1 + n;
        int ret = n;
        n = n1;
        n1 = n2;
        return ret;
    }
    
}
