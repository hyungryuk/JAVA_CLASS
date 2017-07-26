package chap18.sec07.exam01_serversocket_socket.rw.level2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//ServerSocket����
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			//serverSocket = new ServerSocket(5001);
			while(true) {
				System.out.println( "Server [���� ��ٸ�]");
				//Ŭ���̾�Ʈ�κ����� ��û�� �����ϰ�, Ŭ���̾�Ʈ�� ����� �����
				//Socket ��ü�� �������ش�. 
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				//������ Ŭ���̾�Ʈ�� IP �ּҸ� �˾Ƴ�
				System.out.println("Server [���� ������] " + isa.getHostString());
				
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				String message = "��� Ŭ���̾�Ʈ";
				dos.writeUTF(message);
				dos.flush();
				System.out.println( "[������ ������ ����]");
				
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				System.out.println("Client -> Server : [������ �ޱ� ����]: " + dis.readUTF());

				dis.close();
				dos.close();
				socket.close();
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {}
		}
	}
}