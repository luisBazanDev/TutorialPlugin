package pe.bazan.luis.plugins.miprimerplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class HelloCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Logica del comando
        sender.sendMessage("Hello world from my command");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        // Logic tabcomplete
        List<String> completer = new ArrayList<>();

        // /hello mu
        // mundo
        // mundito
        // world

        if (args.length == 1) {
            String arg0 = args[0];

            String[] words = new String[]{"world", "mundo", "mundito"};
            for (String search : words) {
                if (search.startsWith(arg0)) {
                    completer.add(search);
                }
            }
        }

        return completer;
    }
}
