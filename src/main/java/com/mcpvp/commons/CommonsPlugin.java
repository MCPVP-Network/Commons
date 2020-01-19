package com.mcpvp.commons;

import com.mcpvp.commons.playerdata.PlayerDataManager;
import com.mcpvp.commons.playerdata.database.impli.PlayerDataLoader;
import com.mcpvp.commons.playerdata.database.impli.PlayerDataSaver;
import org.bukkit.plugin.java.JavaPlugin;

public class CommonsPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        PlayerDataManager playerDataManager = new PlayerDataManager(this, new PlayerDataLoader(), new PlayerDataSaver());


    }

    @Override
    public void onDisable()
    {

    }
}
