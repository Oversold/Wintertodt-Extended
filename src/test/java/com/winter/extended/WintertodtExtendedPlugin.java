package com.winter.extended;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.wintertodt.WintertodtPlugin;

public class WintertodtExtendedPlugin
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WintertodtPlugin.class);
		RuneLite.main(args);
	}
}