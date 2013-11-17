package edu.smcm.gamedev.butterseal;

public enum BSAssets {
    TITLE(718, 546, _asset("data/images/flame.png")), // flame
    HOUSE(-1, -1, _asset("data/maps/house.tmx")),
    ICE_CAVE(-1, -1, _asset("data/maps/ice-cave.tmx")),
    PLAYER_WALK_UP   (64, 64, _asset("data/spritesheets/player_walk_up.png")),
    PLAYER_WALK_DOWN (64, 64, _asset("data/spritesheets/player_walk_down.png")),
    PLAYER_WALK_LEFT (64, 64, _asset("data/spritesheets/player_walk_left.png")),
    PLAYER_WALK_RIGHT(64, 64, _asset("data/spritesheets/player_walk_right.png")),
    PLAYER_IDLE_STATE(64, 64, _asset("data/spritesheets/player_idle_state.png")),
    ICE_CAVE_ENTRY(-1, -1, _asset("data/maps/ice-cave-entry.tmx"));
	
    private static String _asset(String p) {
        return p;
        //return String.format("data/../../../assets/%s", p);
    }
	
    /**
     * Intended height of this sprite in pixels 
     */
    private final int height;
    /**
     * Intended width of this sprite in pixels
     */
    private final int width;
    /**
     * file path of the sprite
     */
    private final String assetPath;

    /**
     * Creates a new SpriteDimension
     * @param height the intended height of this sprite in pixels
     * @param width the intended width of this sprite in pixels
     */
    BSAssets(int width, int height, String assetPath) {
        this.height = height;
        this.width = width;
        this.assetPath = assetPath;
    }

    public String getAssetPath() {
        return assetPath;
    }
}
// Local Variables:
// indent-tabs-mode: nil
// End:
