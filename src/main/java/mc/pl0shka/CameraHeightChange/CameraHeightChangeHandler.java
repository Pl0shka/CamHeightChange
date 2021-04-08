 package mc.pl0shka.CameraHeightChange;
 
import mc.pl0shka.CameraHeightChange.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

 public class CameraHeightChangeHandler
{
	 
  @SideOnly(Side.CLIENT)
  @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
   public void onEvent(InputEvent.KeyInputEvent event) {
     KeyBinding hotkey = ClientProxy.hotkey;
     KeyBinding hotkey2 = ClientProxy.hotkey2;
     KeyBinding hotkey3 = ClientProxy.hotkey3;
     Minecraft mc = Minecraft.getMinecraft();
     double i;
     i = mc.player.eyeHeight;
    
    if (hotkey.isPressed()) {
    			i += 0.5;
    			mc.player.eyeHeight = (float) i;
    		}
    if (hotkey2.isPressed()) {
    			i -= 0.5;
    			mc.player.eyeHeight = (float) i;
    }
    if (hotkey3.isPressed()) {
    			mc.player.eyeHeight = (float) 1.6200000047683716;
    	}
  	}   
}