package Assignments;

interface FoodMenu {
    void starters();
}

interface DrinksMenu {
    void beverages();
}

interface FullMenu extends FoodMenu, DrinksMenu {
    void desserts();
}

class Staff {
    void staffDetails() {
        System.out.println("Staff: Chefs, Waiters, Managers");
    }
}

class Restaurant extends Staff implements FullMenu {
    public void starters() {
        System.out.println("Starters: Spring Rolls, Garlic Bread, Caesar Salad");
    }

    public void beverages() {
        System.out.println("Beverages: Coffee, Tea, Soft Drinks, Cocktails");
    }

    public void desserts() {
        System.out.println("Desserts: Ice Cream, Brownie, Cheesecake");
    }

    public void restaurantInfo() {
        System.out.println("Restaurant: Open 10AM to 11PM, Location: Main Street");
    }
}

public class test7 {
    public static void main(String[] args) {
        Restaurant res = new Restaurant();
        Staff staff = new Staff();

        res.restaurantInfo();
        res.starters();
        res.beverages();
        res.desserts();
        staff.staffDetails();
    }
}
