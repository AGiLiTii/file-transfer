import java.io.ObjectInputStream;
import java.net.Socket;

public class SignalManager implements Runnable {

    ObjectInputStream in;
    Socket tcpSocket;

    SignalManager(ObjectInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {

        while (true) {
            try {

                String signal = (String) in.readObject();

                if (signal.equals("DONE")) {
                    Sender.pause();
                    Receiver.done = true;
                    System.out.println("done = TRUE");
                } else {
                    Sender.pause();
                    Receiver.amountReceived = Integer.parseInt(signal);
                    Receiver.sent = true;
                    System.out.println("Amount sent from server = " + Receiver.amountReceived);
                }

            } catch (Exception e) {
                break;
            }
        }

    }

}
