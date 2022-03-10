package net.jcommands.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import java.util.ArrayList;
import java.util.function.Consumer;

@SuppressWarnings({"unused"})
public class SlashCommand {

    public static ArrayList<SlashCommand> slashCommands = new ArrayList<>();

    private final String name;
    private final String description;
    private final ArrayList<OptionData[]> options = new ArrayList<>();
    private final Consumer<SlashCommandInteractionEvent> consumerInteraction;

    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public ArrayList<OptionData[]> getOptions() {
        return this.options;
    }
    public Consumer<SlashCommandInteractionEvent> getConsumerInteraction() {
        return this.consumerInteraction;
    }

    public SlashCommand(String name, String description, OptionData[] options, Consumer<SlashCommandInteractionEvent> event) {
        this.name = name;
        this.description = description;
        this.options.add(options);
        this.consumerInteraction = event;
        slashCommands.add(this);
    }
}
