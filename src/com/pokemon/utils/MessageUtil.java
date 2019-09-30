package com.pokemon.utils;

import org.bukkit.ChatColor;

public final class MessageUtil {

	public static ChatColor getPrefixPrimaryColor() {

		return ChatColor.RED;
	}

	public static ChatColor getPrefixSecondaryColor() {

		return ChatColor.DARK_GRAY;
	}

	public static ChatColor getMessagePrimaryColor() {

		return ChatColor.GRAY;
	}
	
	public static ChatColor getMessageSecondaryColor() {
		
		return ChatColor.RED;
	}
	
	public static String getPeriod() {
		
		return ChatColor.GRAY + ".";
	}

	public static String getNoPermissionMessage() {

		return (getErrorPrefix() + getMessagePrimaryColor() + " You do not have the required rank to use this function.");
	}

	public static String getDefaultPrefix() {

		return (getPrefixSecondaryColor() + "[" + getPrefixPrimaryColor()
				+ "Pokemon" + getPrefixSecondaryColor() + "]");
	}

	public static String getErrorPrefix() {

		return (getPrefixSecondaryColor() + "[" + getPrefixPrimaryColor()
				+ "Error" + getPrefixSecondaryColor() + "]");
	}

	public static String getInfoPrefix() {

		return (getPrefixSecondaryColor() + "[" + getPrefixPrimaryColor()
				+ "Info" + getPrefixSecondaryColor() + "]");
	}

	public static String getNewsPrefix() {

		return (getPrefixSecondaryColor() + "[" + getPrefixPrimaryColor()
				+ "News" + getPrefixSecondaryColor() + "]");
	}

}
