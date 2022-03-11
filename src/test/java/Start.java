import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.jcommands.JApi;
import net.jcommands.commands.Command;
import net.jcommands.commands.SlashCommand;
import net.jcommands.exceptions.JApiException;

import javax.security.auth.login.LoginException;

@SuppressWarnings({"unused"})
public class Start {
    public static void main(String[] args) throws LoginException, JApiException, InterruptedException {
        JDA jda = JDABuilder.createDefault("TOKEN").build();

        JApi.init(jda, ">", true);

        new Command("build", (event -> {
            // Whatever
        }));
        new SlashCommand("ping", "test command", new OptionData[] {
            new OptionData(OptionType.STRING, "NameOfOption", "Description of option"),
            new OptionData(OptionType.MENTIONABLE, "NameOfOption2", "Description of option2"),
        }, (event) -> {
            // Do this whenever someone interacts with "ping" command
        });
    }
}
