package personalizedmealplangenerator;

// Main Class to Test the Implementation
public class MealPlanGenerator {
    public static void main(String[] args) {
        // Generate and display different meal plans
        Meal<VegetarianMeal> vegMeal = Meal.generateMeal(new VegetarianMeal());
        vegMeal.displayMealPlan();

        Meal<VeganMeal> veganMeal = Meal.generateMeal(new VeganMeal());
        veganMeal.displayMealPlan();

        Meal<Keto> ketoMeal = Meal.generateMeal(new Keto());
        ketoMeal.displayMealPlan();

        Meal<HighProtein> highProteinMeal = Meal.generateMeal(new HighProtein());
        highProteinMeal.displayMealPlan();
    }
}
