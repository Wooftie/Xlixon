package net.minecraft.src.ic2.api;

/**
 * For internal usage only.
 *
 * @see IEnergySink
 * @see IEnergySource
 * @see IEnergyConductor
 */
public interface IEnergyTile {
	/**
	 * Determine if this tile entity has been added to the energy network
	 * 
	 * @return Whether the tile entity has been added
	 */
	boolean isAddedToEnergyNet();
}

