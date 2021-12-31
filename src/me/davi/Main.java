package me.davi;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main pl;

	@Override
	public void onEnable() {
		pl = this;
	}

	@Override
	public void onDisable() {
		pl = null;
	}
}
