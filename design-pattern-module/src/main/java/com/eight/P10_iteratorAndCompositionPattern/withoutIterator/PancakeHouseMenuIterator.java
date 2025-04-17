package com.eight.P10_iteratorAndCompositionPattern.withoutIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.items.size() || this.items.get(this.position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) this.items.get(this.position);
        this.position++;
        return menuItem;
    }
}
