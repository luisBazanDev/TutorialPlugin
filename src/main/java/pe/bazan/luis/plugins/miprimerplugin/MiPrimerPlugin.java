package pe.bazan.luis.plugins.miprimerplugin;

import org.bukkit.plugin.java.JavaPlugin;
import pe.bazan.luis.plugins.miprimerplugin.commands.HelloCommand;
import pe.bazan.luis.plugins.miprimerplugin.events.PlayerBlockEvents;

public final class MiPrimerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hello").setExecutor(new HelloCommand());
        getServer().getPluginManager().registerEvents(new PlayerBlockEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
