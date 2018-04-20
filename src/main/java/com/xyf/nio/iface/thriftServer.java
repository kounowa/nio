package com.xyf.nio.iface;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;

import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

import com.xyf.nio.iface.IUserService.Iface;
import com.xyf.nio.iface.IUserService.Processor;


public class thriftServer {
	public static void main(String[] args) {
        try {
            // 设置服务器端口
            TNonblockingServerSocket serverTransport = new TNonblockingServerSocket(9090);
            // 设置二进制协议工厂
            Factory protocolFactory = new TBinaryProtocol.Factory();
            // 处理器关联业务实现
            Processor<IUserService.Iface> processor = new IUserService.Processor<IUserService.Iface>(
                    new userIfaceImpl());
            
            
            TNonblockingServer.Args argss = new TNonblockingServer.Args(serverTransport)
                    .processor(processor)
                    .protocolFactory(protocolFactory);
            
            TServer server = new TNonblockingServer(argss);
            System.out.println("开启thrift服务器，监听端口：9090");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

}
