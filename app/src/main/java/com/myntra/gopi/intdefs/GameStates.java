package com.myntra.gopi.intdefs;

import android.support.annotation.StringDef;


@StringDef(value = {
        GameStates.NORMAL, GameStates.FLIPPED,
        GameStates.GUESSED_CORRECTLY
})
public @interface GameStates {
    String NORMAL = "NORMAL";
    String FLIPPED = "FLIPPED";
    String GUESSED_CORRECTLY = "GUESSED_CORRECTLY";
}
