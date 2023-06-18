package _007.adapter.iteratorToEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator<Object> {
    Enumeration<?> enumeration;
    public EnumerationAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() { // we cant support remove as enumeration doesn't, so we give up
        throw new UnsupportedOperationException();
    }

}
