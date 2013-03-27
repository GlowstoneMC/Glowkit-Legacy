package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when an entity is saddled.
 */
public class EntitySaddleEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private Player player;

    public EntitySaddleEvent(final Entity entity, final Player player) {
        super(entity);
        this.player = player;
    }

    /**
     * Gets the player that equipped the saddle on the entity, if any.
     *
     * @return the player that equipped the saddle, or null if no player involved
     */
    public Player getPlayer(){
    	return player;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
