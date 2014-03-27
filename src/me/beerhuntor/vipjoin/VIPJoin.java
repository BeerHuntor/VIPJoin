/*
* author of this plugin is BeerHuntor.  All code is considered open source. 
*/
package me.BeerHuntor.VIPJoin;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class VIPJoin extends JavaPlugin
{
  Logger log = Logger.getLogger("Minecraft");

  public void onEnable()
  {
getServer().getPluginManager().registerEvents(new VIPJoinPlayerListener(this), this);
    logMessage(" Has been enabled.");
  }

  public void onDisable()
  {
    logMessage(" Has been disabled.");
  }

  protected void logMessage(String msg)
  {
    PluginDescriptionFile pdFile = getDescription();
    this.log.info(" [ " + pdFile.getName() + " ] " + "Version " + pdFile.getVersion() + ": " + msg);
  }
}