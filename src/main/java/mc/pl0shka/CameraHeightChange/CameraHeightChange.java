package mc.pl0shka.CameraHeightChange;
 
import mc.pl0shka.CameraHeightChange.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 
@Mod(modid = "camheightchange", name = "CamHeightChange", version = "1.0", acceptedMinecraftVersions = "[1.12.2]")
public class CameraHeightChange
{
public static final String MODID = "camheightchange";
public static final String NAME = "CamHeightChange";
public static final String VERSION = "1.0";
public static final String MC_VERSION = "[1.12.2]";
@SidedProxy(clientSide = "mc.pl0shka.CameraHeightChange.proxy.ClientProxy")
public static CommonProxy proxy;
@Instance
public static CameraHeightChange instance = new CameraHeightChange();
   
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
    proxy.preInit(event);
}
  
 @EventHandler
  public void init(FMLInitializationEvent event) {
     proxy.init(event);
  }
   
 @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    proxy.postInit(event);
  }
}
