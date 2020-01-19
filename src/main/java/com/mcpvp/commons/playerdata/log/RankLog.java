package com.mcpvp.commons.playerdata.log;

import com.mcpvp.commons.rank.Rank;

public class RankLog
{
    public long issuerId;
    public long startTime,
                 expireTime;
    public Rank rank;
    public boolean active;

    public RankLog(long issuerId, long startTime, long expireTime, Rank rank, boolean active)
    {
        this.issuerId = issuerId;
        this.startTime = startTime;
        this.expireTime = expireTime;
        this.rank = rank;
        this.active = active;
    }

    public long getIssuerId()
    {
        return issuerId;
    }

    public long getStartTime()
    {
        return startTime;
    }

    public long getExpireTime()
    {
        return expireTime;
    }

    public Rank getRank()
    {
        return rank;
    }

    public boolean isActive()
    {
        return active;
    }
}
