package com.mcpvp.commons.rank;

import com.mcpvp.commons.commons.CC;

public enum Rank 
{
	ADMIN(CC.red, "Admin"),
	MOD_PLUS(CC.dPurple + CC.i, "Mod+"),
	MOD(CC.lPurple, "Mod"),
	FAMOUS(CC.black, "Famous"),

	PRO(CC.gold, "Pro"),
	MVP(CC.blue, "MVP"),
	VIP(CC.green, "VIP"),
	NORMAL(CC.gray, "");
	
	String tagColor;
	String displayName;

	Rank(String tag, String displayName)
	{
		this.tagColor = tag;
		this.displayName = displayName;
	}

	public String getTagColor()
	{
		return tagColor;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public boolean hasPermissionsOf(Rank rank)
	{
		return this.compareTo(rank) <= 0;
	}

	public boolean hasRank(Rank rank)
	{
		return  this.hasPermissionsOf(rank);
	}

	
	public String getColouredDisplayName()
	{
		return this.getTagColor() + this.displayName + CC.reset;
	}
	
	public static Rank toRank(String rankStr)
	{
		rankStr = rankStr.toUpperCase();
		Rank rank = Rank.valueOf(rankStr);
		if(rank == null)
		{
			rank = Rank.NORMAL;
			try {
				throw new Exception("Unknown rank '" + rankStr + "'");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rank;
	}
}
