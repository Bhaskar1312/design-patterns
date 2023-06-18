package _009.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(position >= list.length || list[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position++;
        return menuItem;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
