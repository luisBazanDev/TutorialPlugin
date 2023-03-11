package pe.bazan.luis.plugins.miprimerplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Logica del comando
        sender.sendMessage("Hello world from my command");
        return true;
    }
}
