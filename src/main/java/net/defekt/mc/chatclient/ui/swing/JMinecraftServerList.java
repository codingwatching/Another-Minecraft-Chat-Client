package net.defekt.mc.chatclient.ui.swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ListSelectionModel;

import net.defekt.mc.chatclient.ui.Main;
import net.defekt.mc.chatclient.ui.ServerEntry;

/**
 * Minecraft-like server list<br>
 * It shows informations about all servers it contains (their names, motd,
 * version, players and even an icon).<br>
 * by default it uses custom cell renderer -
 * {@link MinecraftServerListRenderer}.
 * 
 * @see ServerEntry
 * @see MinecraftServerListRenderer
 * @author Defective4
 *
 */
public class JMinecraftServerList extends JMemList<ServerEntry> {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public JMinecraftServerList() {
		setOpaque(true);
		setBackground(new Color(0, 0, 0, 0));
		setCellRenderer(new MinecraftServerListRenderer());
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

	@Override
	public void paintComponent(Graphics g) {
		for (int x = 0; x <= getWidth() / 64; x++)
			for (int y = 0; y <= getHeight() / 64; y++) {
				g.drawImage(Main.bgImage, x * 64, y * 64, 64, 64, null);
			}
		super.paintComponent(g);
	}
}