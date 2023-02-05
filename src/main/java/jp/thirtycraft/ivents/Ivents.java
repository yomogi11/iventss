package jp.thirtycraft.ivents;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ivents extends JavaPlugin {

    private static JavaPlugin plugin;
    private Listeners listeners;

    @Override
    public void onEnable() {
        //プラグインが起動したときの処理
        super.onEnable();
        this.listeners = new Listeners();
        Bukkit.getPluginManager().registerEvents(this.listeners, this);

    }

    @Override
    public void onDisable() {
        //プラグインが終了したときの処理
        super.onDisable();
    }
    public static JavaPlugin getPlugin(){
        return plugin;
    }


}
