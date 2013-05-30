package forestry.api.recipes;

import net.minecraftforge.liquids.LiquidStack;

/**
 * Provides an interface to the recipe manager of the still.
 * 
 * The manager is initialized at the beginning of Forestry's BaseMod.load() cycle. Begin adding recipes in BaseMod.ModsLoaded() and this shouldn't be null even
 * if your mod loads before Forestry.
 * 
 * Accessible via {@link RecipeManagers}
 * 
 * Note that this is untested with anything other than biomass->biofuel conversion.
 * 
 * @author SirSengir
 */
public interface IStillManager extends ICraftingProvider {
	/**
	 * Add a recipe to the still
	 * 
	 * @param cyclesPerUnit
	 *            Amount of work cycles required to run through the conversion once.
	 * @param input
	 *            ItemStack representing the input liquid.
	 * @param output
	 *            ItemStack representing the output liquid
	 */
	public void addRecipe(int cyclesPerUnit, LiquidStack input, LiquidStack output);
}
