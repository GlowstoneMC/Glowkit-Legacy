package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Thrown when a non-player entity (such as an Enderman) tries to teleport
 * from one location to another.
 */
public class EntityTeleportEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private Location from;
    private Location to;
    private TeleportCause cause;

    /**
     * @deprecated Use {@link #EntityTeleportEvent(Entity, Location, Location, TeleportCause)} instead
     */
    @Deprecated
    public EntityTeleportEvent(Entity what, Location from, Location to) {
        this(what, from, to, TeleportCause.UNKNOWN);
    }

    public EntityTeleportEvent(Entity what, Location from, Location to, TeleportCause cause) {
        super(what);
        this.from = from;
        this.to = to;
        this.cancel = false;
        this.cause = cause;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the location that this entity moved from
     *
     * @return Location this entity moved from
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Sets the location that this entity moved from
     *
     * @param from New location this entity moved from
     */
    public void setFrom(Location from) {
        this.from = from;
    }

    /**
     * Gets the location that this entity moved to
     *
     * @return Location the entity moved to
     */
    public Location getTo() {
        return to;
    }

    /**
     * Sets the location that this entity moved to
     *
     * @param to New Location this entity moved to
     */
    public void setTo(Location to) {
        this.to = to;
    }

    /**
     * Gets the cause for this entity teleportation
     *
     * @return Cause this entity teleported for
     */
    public TeleportCause getCause() {
        return cause;
    }

    public enum TeleportCause {
        /**
         * Indicates the teleportation was caused by an Enderman teleporting
         * himself
         */
        ENDERMAN,
        /**
         * Indicates the teleportation was caused by an entity entering a
         * Nether portal
         */
        NETHER_PORTAL,
        /**
         * Indicates the teleportation was caused by an entity entering an End
         * portal
         */
        END_PORTAL,
        /**
         * Indicates the teleportation was caused by an event not covered by
         * this enum
         */
        UNKNOWN,
        ;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}