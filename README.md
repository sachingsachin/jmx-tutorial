# jmx-tutorial

Reference: [https://docs.oracle.com/javase/tutorial/jmx/mbeans/standard.html](https://docs.oracle.com/javase/tutorial/jmx/mbeans/standard.html)

Run as:
```bash
mvn exec:java \
    -Dcom.sun.management.jmxremote \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dcom.sun.management.jmxremote.ssl=false \
    -Dexec.mainClass="com.prismoskills.tutorials.jmx.Main"  \
    -Dcom.sun.management.jmxremote.port=16700
```

And then run `jconsole` in another terminal.


