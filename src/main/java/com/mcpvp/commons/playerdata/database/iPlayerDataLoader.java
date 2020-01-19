package com.mcpvp.commons.playerdata.database;

import com.mcpvp.commons.playerdata.PlayerData;

import java.util.UUID;

public interface iPlayerDataLoader
{
    public PlayerData loadPlayerData(String username);
    public PlayerData loadPlayerData(String username, UUID uniqueId);
}
