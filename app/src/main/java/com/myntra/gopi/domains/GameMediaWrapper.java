package com.myntra.gopi.domains;

import com.google.gson.annotations.SerializedName;

/**
 * .
 */

public class GameMediaWrapper {

    @SerializedName("media")
    private GameItem gameItem;

    public GameItem getGameItem() {
        return gameItem;
    }

    public void setGameItem(GameItem gameItem) {
        this.gameItem = gameItem;
    }
}
