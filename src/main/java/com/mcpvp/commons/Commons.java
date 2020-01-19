package com.mcpvp.commons;

import com.mcpvp.commons.commands.CommandManager;

public class Commons
{
    private static CommandManager commandManager;

    public static CommandManager getCommandManager()
    {
        if(commandManager == null)
            commandManager = new CommandManager();
        return commandManager;
    }
}
