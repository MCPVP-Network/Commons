package com.mcpvp.commons.playerdata;

import com.mcpvp.commons.rank.Rank;

import java.util.UUID;

public class PlayerData
{
    private String username;
    private UUID uniqueId;

    private Rank displayRank = Rank.NORMAL;
    private Rank activeRank = Rank.NORMAL;

    public PlayerData(String username, UUID uniqueId)
    {
        this.username = username;
        this.uniqueId = uniqueId;
    }
}
