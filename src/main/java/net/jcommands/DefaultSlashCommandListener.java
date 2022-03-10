package net.jcommands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.jcommands.commands.SlashCommand;
import org.jetbrains.annotations.NotNull;

public class DefaultSlashCommandListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        SlashCommand.slashCommands.forEach((action) ->{
            if (event.getName().equals(action.getName())) {
                action.getConsumerInteraction().accept(event);
            }
        });
    }
}
