package com.mcpvp.commons.commons.player;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SimpleMCPlayer
{
	private UUID uniquieId;
	private String username;

	public SimpleMCPlayer(UUID uniquieId, String username)
	{
		this.uniquieId = uniquieId;
		this.username = username;
	}

	public SimpleMCPlayer(UUID uniquieId)
	{
		this.uniquieId = uniquieId;
	}

	public UUID getUniquieId()
	{
		return uniquieId;
	}

	public void setUniquieId(UUID uniquieId)
	{
		this.uniquieId = uniquieId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public Player getPlayer()
	{
		return Bukkit.getPlayer(this.getUniquieId());
	}
}
