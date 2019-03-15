package com.restep.ch06;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author restep
 * @date 2019/3/15
 */
public class SingleThreadWebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            Socket connection = socket.accept();
            handleRequest(connection);
        }
    }

    private static void handleRequest(Socket connection) {

    }
}
