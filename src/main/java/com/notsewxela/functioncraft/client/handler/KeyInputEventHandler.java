package com.notsewxela.functioncraft.client.handler;

import com.notsewxela.functioncraft.client.settings.KeyBindings;
import com.notsewxela.functioncraft.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.settings.KeyBinding;

public class KeyInputEventHandler
{
    private static Key getPressedKeybindings()
    {
        if (KeyBindings.changemode.isPressed())
        {
            return Key.CHANGEMODE;
        }
        //Else if goes here but same as above

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {

    }
}
