package net.jcommands;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.jcommands.exceptions.JApiException;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public final class JApi {

    private static JDA api;
    private static boolean apiInitialized = false;
    public static String prefix;
    private static boolean slashCommandsAssigned;
    private static boolean slashCommandsEnabled;

    private static void checkForInitialization() throws JApiException {
        if (!apiInitialized)
            throw new JApiException("API not initialized.");
    }

    public static JDA getJDA() {
        return api;
    }
    public static String getPrefix() { return prefix; }

    /**
     * Initializes default API.
     *
     * @param jda JDA interface
     * @param _prefix Default prefix that is bot going to use, can be changed later
     * @param assignListenersAutomatically If true, it will use default pre-made command listener
     * @throws JApiException Will be thrown if API is already initialized
     *
     * @see #createSlashCommandSupport(boolean, ListenerAdapter)
     */
    public static void init(JDA jda, String _prefix , boolean assignListenersAutomatically) throws JApiException, InterruptedException {
        if (apiInitialized) {
            throw new JApiException("API already initialized.");
        }
        apiInitialized = true;
        api = jda;
        prefix = _prefix;
        if (assignListenersAutomatically) {
            api.addEventListener(new DefaultEventListener());
        }
        api.awaitReady();
    }
    public static void setPrefix(String newPrefix) throws JApiException {
        checkForInitialization();
        prefix = newPrefix;
    }

    /**
     * <p>Creates support for slash commands to be used.</p>
     *
     * @param useAutomaticListener if true it will use default pre-made slash command listener.
     * @param adapter leave null if useAutomaticListener is true.
     * @throws JApiException if JApi is not initialized.
     *
     * @see #init(JDA, String, boolean)
     */
    public static void createSlashCommandSupport(boolean useAutomaticListener, ListenerAdapter adapter) throws JApiException {
        checkForInitialization();
        if (!useAutomaticListener)
            api.addEventListener(adapter);
        else
            api.addEventListener(new DefaultSlashCommandListener());
    }
    public static void addEventListener(ListenerAdapter adapter) throws JApiException {
        checkForInitialization();
        api.addEventListener(adapter);
    }
    public static void updateCommands(String guildId) {

    }
    public static void updateCommands() {

    }
}
