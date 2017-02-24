package net.piotrl.jvm.outofmemory;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> list = new ArrayList();
        while (true) {
            list.add(new Object());
        }
    }
}
