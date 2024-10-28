public class Main {
    public static void main(String[] args) {
       Meal regularMeal = new Meal();

       regularMeal.addToppings_s("Ketchup", "Avocado", "Mayo", "Bacon", "Bread");
        System.out.println(regularMeal);

        Meal specialMeal = new Meal(1.0);
        specialMeal.addToppings_s("Ketchup", "Mayo", "Bacon", "Avocado", "MUSTARD", "PICKLES");
        System.out.println(specialMeal);
    }
}