package pe.bazan.luis.plugins.miprimerplugin;

import org.bukkit.plugin.java.JavaPlugin;
import pe.bazan.luis.plugins.miprimerplugin.commands.HelloCommand;

public final class MiPrimerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
