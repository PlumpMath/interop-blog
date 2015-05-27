javac -classpath target/classes -sourcepath src-main -d target/classes src-main/interop/example/TestMain.java
java -classpath /Users/michael/.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar:target/classes interop.example.TestMain 100
