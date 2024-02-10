package DesignPatterns.IteratorPattern.Menus;


import DesignPatterns.IteratorPattern.MenuItem.MenuItem;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
