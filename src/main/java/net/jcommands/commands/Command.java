package net.jcommands.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.HashMap;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Command {
    public static HashMap<String, Consumer<MessageReceivedEvent>> commands = new HashMap<>();

    private final String name;
    public String getName() {
        return this.name;
    }

    public Command(String name, Consumer<MessageReceivedEvent> event) {
        this.name = name;
        commands.put(name, event);
    }
}
