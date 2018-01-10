package aroski.meeseeksmod;

import aroski.meeseeksmod.proxy.CommonProxy;
import aroski.meeseeksmod.tab.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MeeSeeksMod.MODID, version = MeeSeeksMod.VERSION, name = MeeSeeksMod.NAME)
public class MeeSeeksMod
{
    public static final String MODID = "meeseeksmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Mr. MeeSeeks Mod";

    @SidedProxy(clientSide = "aroski.meeseeksmod.proxy.ClientProxy", serverSide = "aroski.meeseeksmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MeeSeeksMod instance;

    public static CreativeTab tab;

    @EventHandler
    public void preInit(FMLInitializationEvent event) {
        tab = new CreativeTab(CreativeTabs.getNextID(), "tab");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event) {
        proxy.postInit(event);
    }
}
