package com.mcpvp.commons.playerdata.database.impli;

import com.mcpvp.commons.commons.utils.MCAPIUtils;
import com.mcpvp.commons.playerdata.PlayerData;
import com.mcpvp.commons.playerdata.database.iPlayerDataLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.UUID;

public class PlayerDataLoader implements iPlayerDataLoader
{


    @Override
    public PlayerData loadPlayerData(String username)
    {
        //load uniqueId
        UUID uniqueId = null;
        try {
            uniqueId = MCAPIUtils.getUUID(username);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null;
        }

        return this.loadPlayerData(username, uniqueId);
    }

    @Override
    public PlayerData loadPlayerData(String username, UUID uniqueId)
    {


        return null;
    }
}
