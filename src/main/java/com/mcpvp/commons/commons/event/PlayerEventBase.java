package com.mcpvp.commons.commons.event;

import org.bukkit.entity.Player;

public class PlayerEventBase extends EventBase
{
	private Player player;

	public PlayerEventBase(Player player)
	{
		this.player = player;
	}

	public Player getPlayer()
	{
		return player;
	}
}
