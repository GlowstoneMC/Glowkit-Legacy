package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import java.util.HashMap;
import java.util.Map;

public class PlayerResourcePackStatusEvent extends PlayerEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Status status;
    private final String hash;

    public PlayerResourcePackStatusEvent(final Player player, final Status status, final String hash) {
        super(player);
        this.status = status;
        this.hash = hash;
    }

    public Status getStatus() { return status; }

    public String getHash() { return hash; }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public enum Status {
        /*
         * The resource pack download has succeeded, and the client is now using the resource pack sent to it.
         * This occurs after the resource pack has been downloaded and applied.
         */
        SUCCESS(0),

        /*
         * The client declined the download.
         * This occurs when the user clicks 'No' at the download prompt.
         */
        DECLINED(1),

        /*
         * The client encountered an error when downloading the specified resource pack.
         * This occurs when the user clicks 'Yes' at the download prompt, but an error occurs.
         */
        FAILED_DOWNLOAD(2),

        /*
         * The client accepted the resource pack, but it has not been downloaded yet.
         * This occurs when the user clicks 'Yes' at the download prompt, but an error occurs.
         */
        ACCEPTED(3);

        private int value;
        private static Map<Integer, Status> valueLookup = new HashMap<Integer, Status>();

        Status(int value) {
            this.value = value;
        }

        static {
            for (Status s: Status.values()) {
                valueLookup.put(s.value, s);
            }
        }

        public static Status valueOf(int value) {
            return valueLookup.get(value);
        }


    }
}
