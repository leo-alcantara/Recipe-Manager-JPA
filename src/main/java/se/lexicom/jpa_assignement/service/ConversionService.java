package se.lexicom.jpa_assignement.service;

import org.springframework.stereotype.Component;
import se.lexicom.jpa_assignement.dto.*;
import se.lexicom.jpa_assignement.form.*;
import se.lexicom.jpa_assignement.model.*;

import java.util.ArrayList;

@Component
public class ConversionService {

    //INGREDIENT CONVERTER
    public Ingredient toIngredient(IngredientFormDto formDto){
        return new Ingredient(0, formDto.getIngredientName());
    }

    public IngredientDto toIngredientDto(Ingredient ingredient){
        return new IngredientDto(ingredient.getIngredientId(), ingredient.getIngredientName());
    }

    //RECIPE CATEGORY CONVERTER
    public RecipeCategory toRecipeCategory(RecipeCategoryFormDto formDto){
        return new RecipeCategory(0, formDto.getCategory(), new ArrayList<>());
    }

    public RecipeCategoryDto toRecipeCategoryDto(RecipeCategory recipeCategory){
        return new RecipeCategoryDto(recipeCategory.getRecipeCategoryId(), recipeCategory.getCategory(), new ArrayList<>());
    }

    //RECIPE INGREDIENT CONVERTER
    public RecipeIngredient toRecipeIngredient(RecipeIngredientFormDto formDto){
        return new RecipeIngredient(0, formDto.getIngredient(), formDto.getAmount(),
                formDto.getMeasurement(), formDto.getRecipe());
    }

    public RecipeIngredientDto toRecipeIngredientDto(RecipeIngredient recipeIngredient){
        return new RecipeIngredientDto(recipeIngredient.getRecipeIngredientId(), recipeIngredient.getIngredient(),
                recipeIngredient.getAmount(), recipeIngredient.getMeasurement(), recipeIngredient.getRecipe());
    }

    //RECIPE INSTRUCTION CONVERTER
    public RecipeInstruction toRecipeInstruction (RecipeInstructionFormDto formDto){
        return new RecipeInstruction(0, formDto.getRecipeInstructions());
    }

    public RecipeInstructionDto toRecipeInstructionDto(RecipeInstruction recipeInstruction){
        return new RecipeInstructionDto(recipeInstruction.getRecipeInstructionId(), recipeInstruction.getRecipeInstructions());
    }

    //RECIPE CONVERTER
    public Recipe toRecipe(RecipeFormDto formDto){
        return new Recipe(0, formDto.getRecipeName(), formDto.getIngredients(),
                formDto.getInstructions(), formDto.getCategories());
    }

    public RecipeDto toRecipeDto(Recipe recipe){
        return new RecipeDto(recipe.getRecipeId(), recipe.getRecipeName(), recipe.getIngredients(),
                recipe.getInstructions(), recipe.getCategories());
    }
}