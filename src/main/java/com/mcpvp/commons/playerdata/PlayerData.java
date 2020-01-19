package com.mcpvp.commons.playerdata;

import com.mcpvp.commons.commons.player.MCPlayer;
import com.mcpvp.commons.playerdata.log.RankLog;
import com.mcpvp.commons.rank.Rank;

import java.util.List;
import java.util.UUID;

public class PlayerData extends MCPlayer
{
    private long id;

    private Rank displayRank = Rank.NORMAL;
    private Rank activeRank = Rank.NORMAL;

    private List<RankLog> rankLog;

    public PlayerData(String username, UUID uniqueId)
    {
        super(uniqueId, username);
    }

    public boolean hasPermission(Rank rank)
    {
        return this.activeRank.hasPermissionsOf(rank);
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Rank getDisplayRank()
    {
        return displayRank;
    }

    public void setDisplayRank(Rank displayRank)
    {
        this.displayRank = displayRank;
    }

    public Rank getActiveRank()
    {
        return activeRank;
    }

    public void setActiveRank(Rank activeRank)
    {
        this.activeRank = activeRank;
    }

    public List<RankLog> getRankLog()
    {
        return rankLog;
    }

    public void setRankLog(List<RankLog> rankLog)
    {
        this.rankLog = rankLog;
    }
}
