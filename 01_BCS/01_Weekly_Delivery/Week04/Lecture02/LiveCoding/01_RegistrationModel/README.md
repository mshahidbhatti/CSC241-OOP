# 01_RegistrationModel

Packages: `model` (domain classes) and `app` (coordinator and driver).
Open CMD in this folder, create `out` once, then run:

```bat
mkdir out
javac -encoding UTF-8 -d out src\model\*.java src\app\*.java
java -cp out app.Main
```

Or double-click `run.cmd`. Use a JDK, not only a JRE. No external libraries.
Compile each project separately: all use the entry point `app.Main`.

Complete TODOs in order. Placeholder results are intentional.

The registration demo supports two named seats and one current enrollment
per student. The library demo supports one current loan per member. This is
a bounded teaching model: expand storage after learning arrays/collections.
Only the required Java entry-point parameter `String[] args` uses array syntax;
the exercise never reads or manipulates that parameter.
