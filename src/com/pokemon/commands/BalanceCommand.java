package com.pokemon.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.utils.MessageUtil;

public class BalanceCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		
		if (!(sender instanceof Player)) {
			
			sender.sendMessage(MessageUtil.getErrorPrefix()
					+ MessageUtil.getMessagePrimaryColor()
					+ " Console cannot check balance.");

			return true;
		}
		
		OnlinePokemonPlayer player = new OnlinePokemonPlayer((Player) sender);
		
		player.getPlayer().sendMessage(
				MessageUtil.getInfoPrefix()
						+ MessageUtil.getMessagePrimaryColor()
						+ " PokeDollars: "
						+ MessageUtil.getMessageSecondaryColor()
						+ player.getBalance() + MessageUtil.getPeriod());

		return true;
	}

}
