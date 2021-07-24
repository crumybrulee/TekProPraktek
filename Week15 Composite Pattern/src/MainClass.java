package Composite.src;

public class MainClass {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast menu", "Breakfast");
        MenuComponent lunchMenu = new Menu("Tandoori", "Lunch");
        MenuComponent dinnerMenu = new Menu("South Indian", "Dinner");

        // memanggil method print pada class Menu
        MenuComponent allMenus = new Menu("All menus", "All menu combined together");
        // memanggil method print pada class Menu dengan menambahkan deklarasi
        // dari method main class breakfast,lunch dan diner
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        MenuComponent boiledEgg = new MenuItem("Boiled Egg", "Boiled white egg", "10", false);
        MenuComponent pannerTikka = new MenuItem("Panner Tikka", "Spicy cottage cheese tikka", "110", true);

        // memenggail methood print pada menu Item dengan deklarasi dan paramter
        // di class MainClass menu brackfast dan lunch
        breakfastMenu.add(boiledEgg);
        lunchMenu.add(pannerTikka);

        allMenus.print();
    }
}
