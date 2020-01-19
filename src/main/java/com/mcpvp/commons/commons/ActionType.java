package com.mcpvp.commons.commons;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableCollection;
import org.bukkit.event.block.Action;

public enum ActionType 
{
	RIGHT(Action.RIGHT_CLICK_AIR,  Action.RIGHT_CLICK_BLOCK),
	LEFT(Action.LEFT_CLICK_AIR,  Action.LEFT_CLICK_BLOCK),

	BLOCK(Action.RIGHT_CLICK_BLOCK, Action.LEFT_CLICK_BLOCK),
	AIR(Action.LEFT_CLICK_AIR, Action.RIGHT_CLICK_AIR),
	PHYSICAL(Action.PHYSICAL);
	
	private final List<Action> actions;
	
	ActionType(Action... actions)
	{
		this.actions = Arrays.asList(actions);
	}
	
	public boolean containsAction(Action action)
	{
		return this.actions.contains(action);
	}
}
