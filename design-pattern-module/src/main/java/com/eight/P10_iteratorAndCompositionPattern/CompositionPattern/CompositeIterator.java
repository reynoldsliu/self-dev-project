package com.eight.P10_iteratorAndCompositionPattern.CompositionPattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();

            // If it's a composite, push its iterator to go deeper
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }

        Iterator<MenuComponent> iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }
}
