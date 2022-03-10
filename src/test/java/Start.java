import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.jcommands.JApi;
import net.jcommands.commands.Command;
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
    }
}
