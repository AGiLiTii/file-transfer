s:
	javac Sender.java
	javac Packet.java
	javac SignalManager.java
	java Sender

r:
	javac Receiver.java
	javac Packet.java
	javac SignalManager.java
	java Receiver

clean:
	rm *.class
