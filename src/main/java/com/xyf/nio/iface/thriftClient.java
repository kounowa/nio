package com.xyf.nio.iface;

import java.io.IOException;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

public class thriftClient {
	
	public static void main(String[] args) throws IOException {
		try {
			TFramedTransport transport = new TFramedTransport(new TSocket("localhost", 9090, 10000));
			transport.open();
			TProtocol prot = new TBinaryProtocol(transport);
			IUserService.Client client = new IUserService.Client(prot);
			User user = new User();
			user.setEmail("hhhhh");
			client.add(user);
		} catch (TException e) {
			e.printStackTrace();
		}
	}
}
