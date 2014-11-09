package org.bukkit.entity;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.*;
import org.bukkit.permissions.Permissible;
import org.bukkit.title.Title;
import org.bukkit.title.TitleOptions;

/**
 * Represents a human entity, such as an NPC or a player
 */
public interface HumanEntity extends LivingEntity, AnimalTamer, Permissible, InventoryHolder {

    /**
     * Returns the name of this player
     *
     * @return Player name
     */
    public String getName();

    /**
     * Get the player's inventory.
     *
     * @return The inventory of the player, this also contains the armor
     *     slots.
     */
    public PlayerInventory getInventory();

    /**
     * Get the player's EnderChest inventory
     *
     * @return The EnderChest of the player
     */
    public Inventory getEnderChest();

    /**
     * If the player currently has an inventory window open, this method will
     * set a property of that window, such as the state of a progress bar.
     *
     * @param prop The property.
     * @param value The value to set the property to.
     * @return True if the property was successfully set.
     */
    public boolean setWindowProperty(InventoryView.Property prop, int value);

    /**
     * Gets the inventory view the player is currently viewing. If they do not
     * have an inventory window open, it returns their internal crafting view.
     *
     * @return The inventory view.
     */
    public InventoryView getOpenInventory();

    /**
     * Opens an inventory window with the specified inventory on the top and
     * the player's inventory on the bottom.
     *
     * @param inventory The inventory to open
     * @return The newly opened inventory view
     */
    public InventoryView openInventory(Inventory inventory);

    /**
     * Opens an empty workbench inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *     location is used.
     * @param force If false, and there is no workbench block at the location,
     *     no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     *     opened.
     */
    public InventoryView openWorkbench(Location location, boolean force);

    /**
     * Opens an empty enchanting inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *     location is used.
     * @param force If false, and there is no enchanting table at the
     *     location, no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     *     opened.
     */
    public InventoryView openEnchanting(Location location, boolean force);

    /**
     * Opens an inventory window to the specified inventory view.
     *
     * @param inventory The view to open
     */
    public void openInventory(InventoryView inventory);

    /**
     * Force-closes the currently open inventory view for this player, if any.
     */
    public void closeInventory();

    /**
     * Returns the ItemStack currently in your hand, can be empty.
     *
     * @return The ItemStack of the item you are currently holding.
     */
    public ItemStack getItemInHand();

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was holding.
     *
     * @param item The ItemStack which will end up in the hand
     */
    public void setItemInHand(ItemStack item);

    /**
     * Returns the ItemStack currently on your cursor, can be empty. Will
     * always be empty if the player currently has no open window.
     *
     * @return The ItemStack of the item you are currently moving around.
     */
    public ItemStack getItemOnCursor();

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was moving. Will always be empty if the player currently has no
     * open window.
     *
     * @param item The ItemStack which will end up in the hand
     */
    public void setItemOnCursor(ItemStack item);

    /**
     * Returns whether this player is slumbering.
     *
     * @return slumber state
     */
    public boolean isSleeping();

    /**
     * Get the sleep ticks of the player. This value may be capped.
     *
     * @return slumber ticks
     */
    public int getSleepTicks();

    /**
     * Gets this human's current {@link GameMode}
     *
     * @return Current game mode
     */
    public GameMode getGameMode();

    /**
     * Sets this human's current {@link GameMode}
     *
     * @param mode New game mode
     */
    public void setGameMode(GameMode mode);

    /**
     * Check if the player is currently blocking (ie with a sword).
     *
     * @return Whether they are blocking.
     */
    public boolean isBlocking();

    /**
     * Get the total amount of experience required for the player to level
     *
     * @return Experience required to level up
     */
    public int getExpToLevel();

    /**
     * Removes the title from the player's view. This does not reset the values
     * the player sees.
     */
    public void clearTitle();

    /**
     * Resets the title settings for this player. Sets their {@link org.bukkit.title.TitleOptions}
     * back to defaults and removes their currently set {@link org.bukkit.title.Title}.
     */
    public void resetTitle();

    /**
     * Gets the title currently set on the player
     *
     * @return the current title
     */
    public Title getTitle();

    /**
     * Sets the title to be shown to the player. Upon setting, the title will
     * be shown.
     *
     * @param title the title to show the player
     */
    public void setTitle(Title title);

    /**
     * Gets the player's current title options.
     *
     * @return the current title options
     */
    public TitleOptions getTitleOptions();

    /**
     * Sets the player's title options. Upon setting, the new options will be
     * sent to the player. Setting this to null will result in the default
     * settings being applied.
     *
     * @param options the new options for the player
     */
    public void setTitleOptions(TitleOptions options);
}
