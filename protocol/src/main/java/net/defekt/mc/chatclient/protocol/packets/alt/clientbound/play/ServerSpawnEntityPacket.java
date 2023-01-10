package net.defekt.mc.chatclient.protocol.packets.alt.clientbound.play;

import java.io.IOException;

import net.defekt.mc.chatclient.protocol.io.VarInputStream;
import net.defekt.mc.chatclient.protocol.packets.Packet;
import net.defekt.mc.chatclient.protocol.packets.PacketRegistry;

@SuppressWarnings("javadoc")
public class ServerSpawnEntityPacket extends Packet {

    protected int id;
    protected int type;
    protected int x;
    protected int y;
    protected int z;

    public ServerSpawnEntityPacket(final PacketRegistry reg, final byte[] data) throws IOException {
        super(reg, data);
        final VarInputStream is = getInputStream();
        id = is.readVarInt();
        type = is.readUnsignedByte();
        x = is.readInt();
        y = is.readInt();
        z = is.readInt();

        x /= 32;
        y /= 32;
        z /= 32;
    }

    public int getType() {
        return type;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public int getId() {
        return id;
    }

}