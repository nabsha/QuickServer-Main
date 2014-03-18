package org.quickserver.test;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.quickserver.net.AppException;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.QuickServer;

public class QuickServerTest {
  public static void main(String arg[]) throws InterruptedException, AppException {
    QuickServer qs = new QuickServer(new ClientCommandHandler() {
      @Override
      public void handleCommand(ClientHandler handler, String command) throws SocketTimeoutException, IOException {
        System.out.println("command=" + command);
      }
    }, 9999);
    qs.startServer();
  }
}
