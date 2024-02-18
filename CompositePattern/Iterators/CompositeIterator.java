package DesignPatterns.CompositePattern.Iterators;

import DesignPatterns.CompositePattern.MenuComponents.Menu;
import DesignPatterns.CompositePattern.MenuComponents.MenuComponent;

import java.util.*;

public class CompositeIterator implements Iterator {
    // we are using stack to print elements
    // bottom up in tree structure
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            // if the current iterator has got no items next
            // go for the next item in stack. i.e. next iterator
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            // if the flow comes here that means
            // we still have items left to iterate in current iterator
            else {
                return true;
            }
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
