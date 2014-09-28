package org.bukkit;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.apache.commons.lang.Validate;

import java.util.Map;

/**
 * Represents <i>all</i> patterns on a banner.
 * It is a ordered map of each pattern type and its color.
 */
public class BannerPattern {

    /**
     * Represents an individual pattern layer on a banner.<p/>
     * Names of these enums relate to the client's texture files.
     */
    public static enum Type {
        BORDER("bo"),
        BRICK("bri"),
        CIRCLE("mc"),
        CREEPER("cre"),
        CROSS("cr"),
        CURLY_BORDER("cbo"),
        DIAGONAL_LEFT("ld"),
        DIAGONAL_RIGHT("rud"),
        DIAGONAL_UP_LEFT("lud"),
        DIAGONAL_UP_RIGHT("rd"),
        FLOWER("flo"),
        GRADIENT("gra"),
        GRADIENT_UP("gru"),
        HALF_HORIZONTAL("hh"),
        HALF_HORIZONTAL_BOTTOM("hhb"),
        LEFT_HALF("vh"),
        LEFT_HALF_RIGHT("vhr"),
        MOJANG("moj"),
        RHOMBUS("mr"),
        SKULL("sku"),
        SMALL_STRIPES("ss"),
        SQUARE_BOTTOM_LEFT("bl"),
        SQUARE_BOTTOM_RIGHT("br"),
        SQUARE_TOP_LEFT("tl"),
        SQUARE_TOP_RIGHT("tr"),
        STRAIGHT_CROSS("sr"),
        STRIPE_BOTTOM("bs"),
        STRIPE_CENTER("cs"),
        STRIPE_DOWN_LEFT("dls"),
        STRIPE_DOWN_RIGHT("drs"),
        STRIPE_LEFT("ls"),
        STRIPE_MIDDLE("ms"),
        STRIPE_RIGHT("rs"),
        STRIPE_TOP("ts"),
        TRIANGLE_BOTTOM("bt"),
        TRIANGLE_TOP("tt"),
        TRIANGLES_BOTTOM("bts"),
        TRIANGLES_TOP("tts");

        private final String code;
        private final static Map<String, Type> BY_CODE = Maps.newHashMap();

        private Type(String code) {
            this.code = code;
        }

        /**
         * Gets the internal code of this banner pattern
         * @return The 2/3 character pattern code
         * @deprecated Magic value
         */
        @Deprecated
        public String getCode() {
            return code;
        }

        /**
         * Gets a pattern by the code
         * @param code 2/3 character pattern code
         * @return Banner pattern
         * @deprecated Magic value
         */
        @Deprecated
        public static Type getByCode(String code) {
            return BY_CODE.get(code);
        }

        static {
            for (Type type : Type.values()) {
                BY_CODE.put(type.code, type);
            }
        }
    }

    /**
     * Construct a builder for a BannerPattern.
     *
     * @return BannerPattern Builder
     */
    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        ImmutableMap.Builder<Type, DyeColor> layers = ImmutableMap.builder();

        /**
         * Adds a colored layer to the banner.
         * @param type Pattern for this layer
         * @param color Color of the layer
         * @return This object, for chaining
         * @throws IllegalArgumentException If type is null
         * @throws IllegalArgumentException If color is null
         */
        public Builder layer(Type type, DyeColor color) throws IllegalArgumentException {
            Validate.notNull(type, "Cannot have null type");
            Validate.notNull(color, "Cannot have null color");
            layers.put(type, color);

            return this;
        }

        /**
         * Creates a {@link BannerPattern} from the contents of this builder.
         * @return The built BannerPattern
         */
        public BannerPattern build() {
            return new BannerPattern(layers.build());
        }
    }

    private final ImmutableMap<Type, DyeColor> layers;


    BannerPattern( ImmutableMap<Type, DyeColor> layers) {
        this.layers = layers;
    }

    /**
     * Get the layers of this pattern. <br/>
     * <b>Note:</b> The returned {@link ImmutableMap} has a reliable iteration order, starting from the bottom layer.
     * @return The layers of this pattern
     */
    public Map<Type, DyeColor> getLayers() {
        return layers;
    }

}