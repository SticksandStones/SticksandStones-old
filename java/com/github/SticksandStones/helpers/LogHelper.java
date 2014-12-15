package com.github.SticksandStones.helpers;

import org.apache.logging.log4j.Level;

import com.github.SticksandStones.Reference;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {
	
	private static final String name = Reference.modid;
	
	public static void info(String message) {
		FMLLog.log(name, Level.INFO, message);
		}

	public static void debug(String message) {
		FMLLog.log(name, Level.DEBUG, message);
		}

	public static void warn(String message) {
		FMLLog.log(name, Level.WARN, message);
		}

	public static void error(String message) {
		FMLLog.log(name, Level.ERROR, message);
		}

	public static void fatal(String message) {
		FMLLog.log(name, Level.FATAL, message);
		}
	
	public static void fatalWarning(String message) {
		FMLLog.log(name, Level.FATAL, "-------------------------------------------------------------------------------------------");
		FMLLog.log(name, Level.FATAL, message);
		FMLLog.log(name, Level.FATAL, "-------------------------------------------------------------------------------------------");
	}
}