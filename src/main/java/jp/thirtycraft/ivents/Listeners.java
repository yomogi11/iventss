package jp.thirtycraft.ivents;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Listeners implements Listener {

    //opを持っていたら、prefixが、[Admin』になるこーど
    //ダイアモンドブロックをこわしたら、壊せなくなるコード

    @EventHandler
    public void onChatPrefixAdmins(AsyncPlayerChatEvent e) {

        e.setCancelled(true);
        //ましチャットが送信されたら、キャンセルする
        //つまりチャットが表示されなくなる
        if (e.getPlayer().isOp())
        {
            Bukkit.broadcastMessage(ChatColor.GOLD + "[Admin]" + ChatColor.WHITE + e.getPlayer().getName() + ChatColor.GREEN + ": " + ChatColor.WHITE + e.getMessage());
        }
        else {
            Bukkit.broadcastMessage(e.getPlayer().getName() + ChatColor.WHITE + ": " + ChatColor.GREEN + e.getMessage());
        }


    }

    @EventHandler
    public void onBreakDiamondBlock(BlockBreakEvent e ) {

        if(e.getBlock().getType() == Material.DIAMOND_ORE)
        {
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.AQUA + e.getPlayer().getName() + "さんが、ダイアモンドを破壊しました");
        }

    }



}
