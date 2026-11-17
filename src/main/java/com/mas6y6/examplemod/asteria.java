package com.mas6y6.examplemod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(asteria.MODID)
public class asteria {
    public static final String MODID = "asteria";
    public static final Logger LOGGER = LogUtils.getLogger();

    public asteria(IEventBus modEventBus, ModContainer modContainer) {
    }
}
