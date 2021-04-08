package mc.pl0shka.CameraHeightChange.proxy;

import mc.pl0shka.CameraHeightChange.CameraHeightChangeHandler;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy
   extends CommonProxy
 {
   public static KeyBinding hotkey;
   public static KeyBinding hotkey2;
   public static KeyBinding hotkey3;
   
   public void preInit(FMLPreInitializationEvent event) {
     super.preInit(event);
   }
 
 
   
   public void init(FMLInitializationEvent event) {
	 hotkey3 = new KeyBinding("Default position", 36, "CamHeightChange");
	 hotkey2 = new KeyBinding("Down", 35, "CamHeightChange");
     hotkey = new KeyBinding("Up", 34, "CamHeightChange");
        
     ClientRegistry.registerKeyBinding(hotkey);
     ClientRegistry.registerKeyBinding(hotkey2);
     ClientRegistry.registerKeyBinding(hotkey3);
     
     FMLCommonHandler.instance().bus().register(new CameraHeightChangeHandler());
     
     super.init(event);
   }
   
  public void postInit(FMLPostInitializationEvent event) {
     super.postInit(event);
   }
 }


