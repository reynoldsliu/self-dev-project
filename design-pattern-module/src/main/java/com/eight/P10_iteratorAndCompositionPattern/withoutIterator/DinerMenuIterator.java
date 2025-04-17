package com.eight.P10_iteratorAndCompositionPattern.withoutIterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.items.length || this.items[this.position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = this.items[this.position];
        this.position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (this.position < 0) {
            throw new IllegalStateException("You can't remove an element until you've done at least ont next()");
        }
        if (this.items[this.position - 1] != null) {
            for (int i = this.position - 1; i < (this.items.length - 1); i++) {
                this.items[i] = this.items[i + 1];
            }
            this.items[this.position - 1] = null;
        }
    }
}
