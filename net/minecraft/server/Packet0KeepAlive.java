package net.minecraft.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Packet0KeepAlive extends Packet {

    public int a;

    public Packet0KeepAlive() {}

    public Packet0KeepAlive(int i) {
        this.a = i;
    }

    public void handle(Connection connection) {
        connection.a(this);
    }

    public void a(DataInputStream datainputstream) {
        this.a = datainputstream.readInt();
    }

    public void a(DataOutputStream dataoutputstream) {
        dataoutputstream.writeInt(this.a);
    }

    public int a() {
        return 4;
    }

    public boolean e() {
        return true;
    }

    public boolean a(Packet packet) {
        return true;
    }

    public boolean a_() {
        return true;
    }
}
