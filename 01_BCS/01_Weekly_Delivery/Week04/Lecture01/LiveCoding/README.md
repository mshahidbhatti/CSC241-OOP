# Week 4 - Lecture 1 / L07

Topic: static members, constants, object identity and references.

## Run in Windows CMD

Open CMD in this `LiveCoding` folder (the folder containing `src`).

```bat
mkdir out
javac -encoding UTF-8 -d out src\model\*.java src\app\*.java
java -cp out app.Main
```

Run `mkdir out` only once. Alternatively, double-click `run.cmd`.

## Packages and files

| Package | File | Responsibility |
| --- | --- | --- |
| model | Student.java | Instance data, shared object counter, campus constant |
| model | CreditHours.java | Shared constants and credit validation |
| app | IdTools.java | Static ID utility methods |
| app | Main.java | Predictions, demonstrations and output |

## Live-coding order

1. L07-1: increment the counter in the `Student` constructor. Predict the
   output before running: 0 before construction, then 1, then 2.
2. L07-2: implement normalization in `IdTools`.
3. L07-3: implement the campus suffix check.
4. L07-4: implement the inclusive credit range check.
5. Draw two Student objects and the `ali`, `abdul`, `alias` references.
   Trace `alias.setName(...)` and `alias = null`. Neither creates a Student.
6. Uncomment the reassignment of `fixedReference` separately, observe the
   compile error, then restore the comment.

## Check after completing the TODOs

- Counter: 0, 1, 2; it stays 2 after alias assignment and after `alias = null`.
- `ali == alias` is true; `ali == abdul` is false.
- Updating via `alias` changes the name read via `ali`.
- Normalized ID is `CIIT/SP26-BAI-010/LHR`; LHR check is true.
- Credit checks for 0, 3, 7 are false, true, false.

The starter prints counter 0 throughout and returns placeholder utility results.
The counter means objects constructed in this run, not objects currently alive.
Setting one reference to null does not imply collection: `ali` still refers to
the object. Garbage-collection timing is not demonstrated here.
