package Composite.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList<MenuComponent> menuItems;
    private String name;
    private String description;
    // we only need one iterator per Menu
    Iterator iterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.menuItems = new ArrayList<>();
    }

    /*
     * Modifikasi code menambahkan method iterator //Here we’re using a new iterator
     * called //CompositeIterator. It knows how to iterate over any composite.
     */
    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(MenuComponent.iterator());
        }
        return iterator;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuItems.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        int index = menuItems.indexOf(menuComponent);
        if (index > 0) {
            menuItems.remove(index);
        }
    }

    @Override
    public MenuComponent getChild(int index) {
        if (index < menuItems.size())
            return menuItems.get(index);
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("Name " + getName());
        System.out.println("Description " + getDescription());
        // Iterator
        Iterator<MenuComponent> iterator = menuItems.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
