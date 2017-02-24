### Challange
Create Java program that throws OutOfMemoryError in runtime

### Howto run
`mvn exec:java`

### Solution

- Keeps adding elements to array in infinite loop
- Garbage Collector can't remove old references as they are still achievable
- Profit

```
List<Object> list = new ArrayList();
while (true) {
    list.add(new Object());
}
```

After over 70.000.000 elements added to list (*took some time*), exception is thrown.


```

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3210)
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at net.piotrl.jvm.outofmemory.Application.main(Application.java:15)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

```