package vg.civcraft.mc.namelayer.commands;

import java.util.Collections;
import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import vg.civcraft.mc.civmodcore.command.CivCommand;
import vg.civcraft.mc.civmodcore.command.StandaloneCommand;
import vg.civcraft.mc.namelayer.NameAPI;
import vg.civcraft.mc.namelayer.listeners.PlayerListener;

@CivCommand(id="nllci")
public class ListCurrentInvites extends StandaloneCommand {

	@Override
	public boolean execute(CommandSender sender, String[] args) {
		Player p = (Player) sender;
		p.sendMessage(PlayerListener.getNotificationsInStringForm(NameAPI.getUUID(p.getName())));
		return true;
	}
	public List<String> tabComplete(CommandSender sender, String[] args) {
		return Collections.emptyList();
	}

}