/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.ArrayList;

/**
 *
 * @author osman
 */
public class Refactored {

    public static void main(String[] args) {
        String description =  "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " + "\n"
                + "Donec efficitur purus at leo bibendum feugiat. " + "\n"
                + "Duis dictum tempus libero, et iaculis augue blandit non. " + "\n"
                + "Duis ac metus imperdiet, lobortis libero vel, tincidunt turpis. " + "\n"
                + "Aenean iaculis risus in sapien imperdiet posuere. " + "\n"
                + "Orci varius natoque penatibus et magnis dis parturient montes, nascetur." + "\n";
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        recipes.add(new Recipe("Spaghetti", new ArrayList<Ingredient>(){{
            add(new Ingredient("Water", IngredientUnit.Liter, 1.5, 0.0));
            add(new Ingredient("Oil", IngredientUnit.Liter, 0.2, 120.0));
            add(new Ingredient("Salt", IngredientUnit.Kilogram, 0.01, 0.0));
            add(new Ingredient("Pasta", IngredientUnit.Kilogram, 0.250, 200.0));
        }}, description));
        
        
         recipes.add(new Recipe("Menemen", new ArrayList<Ingredient>(){{
            add(new Ingredient("Oil", IngredientUnit.Liter, 0.2, 120.0));
            add(new Ingredient("Salt", IngredientUnit.Kilogram, 0.01, 0.0));
            add(new Ingredient("Pepper", IngredientUnit.Piece, 3.0, 0.25));
            add(new Ingredient("Tomato", IngredientUnit.Piece, 4.0, 0.40));
            add(new Ingredient("Egg", IngredientUnit.Piece, 3.0, 250.0));
             
        }}, description));
        
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString() + "\n");
        }
    }
}

class Recipe {
    
    private String cook_name;
    private ArrayList<Ingredient> ingredients;
    private String cooking_description;
    private Double total_calory = 0.0;

    public Recipe(String cook_name,ArrayList<Ingredient> ingredients ,String cooking_description) {
        this.cook_name = cook_name;
        this.ingredients = ingredients;
        this.cooking_description = cooking_description;
    }
    
    private void calculateTotalCalory(Double calory){
        this.total_calory += calory;
    }
    
    private String listIngredients(){
        String ingString = "";
        for (Ingredient ingredient : ingredients) {
            this.calculateTotalCalory(ingredient.getCalory());
            ingString += ingredient.toString() + "\n";
        }
        
        return ingString;
    }

    @Override
    public String toString() {
        return "Cook name : " + this.cook_name + "\n\n"
                + listIngredients() + "\n"
                + "Cooking Description : \n"
                + this.cooking_description + "\n"
                + "Total Calory : " + this.total_calory + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
}

class Ingredient{
    private String ingredient_name;
    private IngredientUnit unit_type;
    private Double amount;
    private Double calory;

    public Ingredient(String ingredient_name, IngredientUnit unit_type, Double amount, Double calory) {
        this.ingredient_name = ingredient_name;
        this.unit_type = unit_type;
        this.amount = amount;
        this.calory = calory;
    }

    public Double getCalory() {
        return calory;
    }
    
    

    @Override
    public String toString() {
        return this.ingredient_name + " "
                + this.amount + " "
                + this.unit_type.getUnitName() + " "
                + this.calory + " calory"; //To change body of generated methods, choose Tools | Templates.
    }   
}

enum IngredientUnit{
    Kilogram("kg"),
    Liter("Liter"),
    Piece("Piece");
    
    private final String unitName;

    private IngredientUnit(String unitName) {
        this.unitName = unitName;
    }
    
    public String getUnitName(){
        return this.unitName;
    }
    
}
