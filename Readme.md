# Reproduce a maven error
```
~/eclipse-workspace/demo (master|…1) ✔ $ java -version
openjdk version "1.8.0_272"
OpenJDK Runtime Environment (build 1.8.0_272-8u272-b10-0ubuntu1~20.04-b10)
OpenJDK 64-Bit Server VM (build 25.272-b10, mixed mode)
~/eclipse-workspace/demo (master|…1) ✔ $ mvn --version
Apache Maven 3.6.3
Maven home: /usr/share/maven
Java version: 1.8.0_272, vendor: Private Build, runtime: /usr/lib/jvm/java-8-openjdk-amd64/jre
Default locale: en_CA, platform encoding: UTF-8
OS name: "linux", version: "5.4.0-52-generic", arch: "amd64", family: "unix"
```
```
demo$ mvn clean package
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.github:demo >---------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ demo ---
[INFO] Deleting /home/bo/eclipse-workspace/demo/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ demo ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ demo ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/bo/eclipse-workspace/demo/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/bo/eclipse-workspace/demo/src/main/java/demo/Demo.java:[19,60] cannot find symbol
  symbol:   variable line
  location: class java.lang.Object
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.995 s
[INFO] Finished at: 2020-11-02T23:09:52-05:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project demo: Compilation failure
[ERROR] /home/bo/eclipse-workspace/demo/src/main/java/demo/Demo.java:[19,60] cannot find symbol
[ERROR]   symbol:   variable line
[ERROR]   location: class java.lang.Object
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```
