import java.util.logging.Logger;
import net.minecraft.server.player.EntityPlayerMP;
import plugins.PluginBase;

public class Plugin_HelloWorld extends PluginBase {
    public void onServerStartup(Logger l) {
        System.out.println("Hello World From Example Plugin!");
        this.minecraftLogger = l;
    }

    @Override
    public void onPlayerJoined(EntityPlayerMP player) {
        this.server.configManager.sendChatMessageToPlayer(player.username, "to our server Powered by Umby24!");
        this.server.configManager.sendChatMessageToPlayer(player.username, "hope you enjoy your stay at " + this.server.serverName + "!");
    }
}
