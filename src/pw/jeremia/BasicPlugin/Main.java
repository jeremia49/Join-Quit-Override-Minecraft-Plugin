package pw.jeremia.BasicPlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        super.onEnable();
        getServer().getPluginManager().registerEvents(this,this);
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        event.setJoinMessage(null);
        event.getPlayer().sendMessage("Halo "+ event.getPlayer().getDisplayName() +", ");
        event.getPlayer().sendMessage("Selamat Datang di server ini ^^ ");
        getServer().broadcastMessage(ChatColor.AQUA+"[ Join ] "+ ChatColor.WHITE+ event.getPlayer().getDisplayName() + " telah bergabung !");

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        event.setQuitMessage(null);
        getServer().broadcastMessage(ChatColor.RED+"[ Leave ] " + ChatColor.WHITE + event.getPlayer().getDisplayName() + " telah keluar !");
    }
}
