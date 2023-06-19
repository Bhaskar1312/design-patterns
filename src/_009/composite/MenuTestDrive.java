package _009.composite;

import java.util.Calendar;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent panCakeMenu = new Menu("PAN CAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUs", "All menus combined");
        allMenus.add(panCakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add menu items here
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with a flakey crust", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
