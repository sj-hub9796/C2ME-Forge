package net.sjhub.c2meforged;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(C2MEForgedMod.MODID)
public class C2MEForgedMod {

    public static final String MODID = "c2meforged";
    private static final Logger LOGGER = LogUtils.getLogger();

    public C2MEForgedMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
