package com.mcpvp.commons.playerdata;

import com.google.common.base.Stopwatch;
import com.mcpvp.commons.commons.manager.PlayerManager;
import com.mcpvp.commons.commons.time.Bang;
import com.mcpvp.commons.playerdata.database.iPlayerDataLoader;
import com.mcpvp.commons.playerdata.database.iPlayerDataSaver;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.InetAddress;
import java.util.UUID;

public class PlayerDataManager extends PlayerManager<PlayerData>
{
    private iPlayerDataLoader playerdataLoader;
    private iPlayerDataSaver playerdataSaver;

    public PlayerDataManager(JavaPlugin plugin, iPlayerDataLoader playerdataLoader, iPlayerDataSaver playerdataSaver)
    {
        super(plugin, true);

        this.playerdataLoader = playerdataLoader;
        this.playerdataSaver = playerdataSaver;
    }

    public void randomSave(PlayerData playerData)
    {
        this.playerdataSaver.savePlayerData(playerData);
    }

    @Override
    public PlayerData onPlayerCreation(UUID uniquieId, String username, InetAddress ipAddress)
    {
        //load from db
        Bang loadTime = new Bang("loadPlayerData").start();
        PlayerData playerData = this.playerdataLoader.loadPlayerData(username, uniquieId);
        loadTime.stop();

        return playerData;
    }

    @Override
    public boolean onPlayerDestruction(PlayerData playerData)
    {
        //Save to db

        Bang saveTime = new Bang("savePlayerData").start();
        this.playerdataSaver.savePlayerData(playerData);
        saveTime.stop();

        return true;
    }
}
