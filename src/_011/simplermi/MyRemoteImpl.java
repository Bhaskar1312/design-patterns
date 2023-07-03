package _011.simplermi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;
    public MyRemoteImpl() throws RemoteException {
    }
    public String sayHello() {
        return "Server says 'hey!'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 * rmiregistry
 * javac -d bin -sourcepath src _011/simplermi/MyRemoteImpl.java
 * */
