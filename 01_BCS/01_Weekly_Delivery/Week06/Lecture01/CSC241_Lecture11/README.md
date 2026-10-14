# CSC241 — Lecture 11: CinemaCity, enums, ragged arrays and UML

This is a complete **plain Java** project (no package names, external libraries, or IDE dependencies). Put every `.java` file in the **same folder**. Tested with JDK 21; suitable for JDK 25.

## Suggested Windows location
`C:\Teaching\Fall2026\CSC241-OOP\LiveCoding\Lecture11_CinemaCity\`

## Compile and run (Command Prompt or terminal opened inside this folder)
```bat
javac *.java
java CinemaCityDemo
```
If using PowerShell, these commands also work when Java is installed and on PATH.

## File order for teaching
1. `SeatType.java` — enum for STANDARD / PREMIUM / VIP.
2. `ScreenType.java` — enum for REGULAR / THREE_D / IMAX.
3. `Seat.java` — seat properties, auto-generated labels, service availability (NOT booking).
4. `Screen.java` — **ragged Seat[][]** array; constructs and owns seats.
5. `Cinema.java` — constructs and owns Screen objects in a Screen[].
6. `CinemaCity.java` — directory holds references to independent Cinema objects.
7. `CinemaCityDemo.java` — run this class; shows creation, search, layout, enums, references.

## What is entered by user vs. what is automatically generated?
- Cinema administrator provides the *row lengths*, for example `{4,6,8,5}`, plus optional seat categories and accessibility flags.
- The **Screen constructor automatically creates all Seat objects** with labels A1-A4, B1-B6, C1-C8, D1-D5.
- A seat cannot be renamed through a public setter; its `rowLetter` and `seatNumber` fields are `final`.
- Seat labels are unique *within each Screen*, not necessarily city-wide. To identify a physical seat globally, qualify it by cinema and auditorium.

## Example output concepts
The main method prints a directory, a seating map, the row lengths, invalid-seat lookup A6, reference identity comparisons, and SeatType enum values.

## Relationships for UML
- `CinemaCity o-- Cinema` = aggregation. An already created Cinema is added to a directory. A cinema may exist independently of the directory.
- `Cinema *-- Screen` = composition. `Cinema.addScreen` calls `new Screen(...)` itself.
- `Screen *-- Seat` = composition. Each Screen constructs and owns its `Seat` objects.
- `Screen --> ScreenType`, `Seat --> SeatType` = attributes typed using enums.

The diagrams in `.puml` and `.mmd` match the Java classes. `Screen` is an *auditorium*, not the physical projection surface. Example seat prices are illustrative PKR amounts, not real rates. A physical seat's serviceability does not represent its reservation status; showtime-based booking is out of scope.

## Design refinement from an earlier conceptual diagram
A `WHEELCHAIR` value has not been added to SeatType. Accessibility is a separate boolean attribute, because comfort category and accessibility are **different dimensions** (e.g. a PREMIUM seat may also be wheelchair accessible). This avoids redundant or contradictory state. The Java UML also shows that `Cinema` *creates* Screen objects, rather than merely accepting externally created instances, to make the composition intent clearer.
