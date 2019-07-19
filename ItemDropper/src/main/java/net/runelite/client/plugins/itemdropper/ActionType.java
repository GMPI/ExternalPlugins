package net.runelite.client.plugins.itemdropper;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ActionType
{
	FLEXO("Flexo"),
	MOUSEEVENTS("MouseEvents");

	private String name;

	@Override
	public String toString()
	{
		return getName();
	}
}
