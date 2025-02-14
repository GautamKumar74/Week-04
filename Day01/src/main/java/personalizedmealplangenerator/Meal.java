package personalizedmealplangenerator;

// Generic Class for Meals
class Meal<T extends MealPlan> {
    private T meal;

    // Constructor
    public Meal(T meal) {
        this.meal = meal;
    }

    // Display Meal Details
    public void displayMealPlan() {
        System.out.println(meal.mealDetails());
    }

    // Generic Method to Validate and Generate Meal
    public static <T extends MealPlan> Meal<T> generateMeal(T mealType) {
        System.out.println("Generating a personalized meal plan...");
        return new Meal<>(mealType);
    }
}