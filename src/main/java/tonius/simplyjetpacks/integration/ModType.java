package tonius.simplyjetpacks.integration;

import tonius.simplyjetpacks.SimplyJetpacks;

public enum ModType {
	SIMPLY_JETPACKS(SimplyJetpacks.MODID),
	ENDER_IO("enderio"),
	THERMAL_EXPANSION("thermalexpansion"),
	REDSTONE_ARSENAL("redstonearsenal"),
	THERMAL_DYNAMICS("thermaldynamics"),
	REDSTONE_REPOSITORY("redstonerepository");

	public final String[] modids;
	public final boolean loaded;

	private ModType(String... modids) {
		this.modids = modids;

		for (String s : this.modids) {
			if (!Loader.isModLoaded(s)) {
				this.loaded = false;
				return;
			}
		}
		this.loaded = true;
	}
}