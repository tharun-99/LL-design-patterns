package DesignPatterns.IteratorPattern.TestDrive;

import DesignPatterns.IteratorPattern.Menus.CafeMenu;
import DesignPatterns.IteratorPattern.Menus.DinerMenu;
import DesignPatterns.IteratorPattern.Menus.Menu;
import DesignPatterns.IteratorPattern.Menus.PancakeHouseMenu;
import DesignPatterns.IteratorPattern.Waitress.Waitress;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}