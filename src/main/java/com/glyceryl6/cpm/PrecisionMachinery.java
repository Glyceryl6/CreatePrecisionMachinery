package com.glyceryl6.cpm;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(PrecisionMachinery.MOD_ID)
public class PrecisionMachinery {

    public static final String MOD_ID = "precision_machinery";

    public PrecisionMachinery() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}