package party.liyin.socketchannel.notification;

public class OnUDPDataArrived extends BaseNotification {
    private String host;
    private int port;
    private byte[] obj;

    public OnUDPDataArrived(String host, int port, byte[] obj) {
        this.host = host;
        this.port = port;
        this.obj = obj;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public byte[] getObj() {
        return obj;
    }
}
