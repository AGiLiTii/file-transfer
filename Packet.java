import java.io.Serializable;

public class Packet implements Serializable {
    public String fileName;
    public String protocolType;
    public int packetSize;
    public double fileSize;

    public Packet(String fileName, String protocolType, int packetSize, double fileSize) {
        this.fileName = fileName;
        this.protocolType = protocolType;
        this.packetSize = packetSize;
        this.fileSize = fileSize;
    }
}