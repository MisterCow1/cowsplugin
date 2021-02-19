package me.mistercow1.cowsplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class CowsPlugin extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("CowsPlugin enabled");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("CowsPlugin disabled");
    }
}