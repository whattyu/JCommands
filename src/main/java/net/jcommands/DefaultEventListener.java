package net.jcommands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.jcommands.commands.Command;
import org.jetbrains.annotations.NotNull;

public class DefaultEventListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Command.commands.keySet().forEach((cmdName) -> {
            if (event.getMessage().getContentRaw().startsWith(JApi.prefix+cmdName)) {
                Command.commands.get(cmdName).accept(event);
            }
        });
    }
}
