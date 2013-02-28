package recipe3;

/**
 *
 * @author John
 */
public class Recipe {
    private String title;
    private String[] mainIngredients;
    private double[] quantities;
    private String[] altIngredients;
    private double[] altQuantities;
    private String[] instructions;
    private int prepTime;
    private int category;
    private int subCategory;
    private String[] comments;
    private int rating;
    
    /**
     * This method takes the user's input (all input variables signified by the
     * name "in___") and assigns it to the class variables above.
     */
    public void add(String inTitle, String[] inMainIngredients, double[] inQuantities,
            String[] inAltIngredients, double[] inAltQuantities, 
            String[] inInstructions, int inPrepTime, int inCategory, int inSubCategory, 
            String[] inComments, int inRating){
        title = inTitle;
        mainIngredients = inMainIngredients;
        quantities = inQuantities;
        altIngredients = inAltIngredients;
        altQuantities = inAltQuantities;
        instructions = inInstructions;
        prepTime = inPrepTime;
        category = inCategory;
        subCategory = inSubCategory;
        comments = inComments;
        rating = inRating;
    }
    
    @Override
    public String toString(){
        String output = "" + title + "";    //ADD MORE HERE LATER
        return output;
    }
}

/**
 * add(String title, String[] mainIngredients, double[] quantities,
            String[] altIngredients, double[] altQuantities, 
            String[] instructions, int prepTime, int category, int subCategory, 
            String[] comments, int rating){
 */