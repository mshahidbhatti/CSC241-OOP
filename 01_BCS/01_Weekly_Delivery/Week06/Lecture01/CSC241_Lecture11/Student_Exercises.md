# CSC241 Lecture 11 — Student Exercises

1. Predict the number and labels of seats for `new int[]{3,5,2}`. What are the values of `getRowCount()`, `getSeatCountInRow('B')`, and `countAllSeats()`?
2. Why does `Screen` hold `Seat[][]` rather than `Seat[]`? Why can't you use `seats[0].length` as the count for every row?
3. Change row D seat 2 from VIP to STANDARD. Print the seating map. Does its label change?
4. Mark B3 out of service, then confirm that `isAvailableForUse()` returns false.
5. Add a second screen with `new int[]{2,4,6}`. Explain its object relationships using a UML class diagram.
6. Draw diamonds at the correct ends of the CinemaCity-Cinema, Cinema-Screen, and Screen-Seat relationships. Why is only the first one modeled as aggregation?
7. Explain why `SeatType` is an enum but `rowLetter` and `seatNumber` are not.
8. Challenge: add a method `countUsableSeats()` to Screen. It counts seats not out of service, but it must NOT claim to count unbooked seats.

## Instructor pointers
- Possible `countUsableSeats()` implementation uses nested loops and checks `seat.isAvailableForUse()`.
- Do not confuse `new Seat[4][]` (array of four row references) with creation of actual `Seat` objects.
- Accessibility is independent of comfort class: a STANDARD seat can be wheelchair accessible.
- A seat label, e.g. A1, is only unique within an auditorium.
- `0..*` at the Cinema end of the UML aggregation is a deliberate modeling choice: the directory could list none or several cinemas, and a venue could be listed in more than one directory.
