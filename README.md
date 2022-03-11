# JCommands
Java library for easier use of JDA

### Installation
Checkout releases and download the latest jar with all required dependencies.  
### Usage
```java
class Main {
    public static void main(String[] args) {
        JDA jda = JDABuilder.createDefault("Your token").build();
        JApi.init(jda, "your prefix", true);
        
        new Command("commandName", (event) -> {
            // Action that will run once command is called 
        });
    }
}
```
### Planned features
1) Slash commands - in work but not yet released
2) Better event listeners
3) Buttons
4) Better embeds
##### Contacts
> GamestationCZ#4663