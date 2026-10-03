# Scenario: borrowing one library book copy

A library member asks to borrow an available physical copy of a book.
A book has a title. A copy has its own copy ID and availability.
A copy can have at most one active loan. A successful request creates a
loan that links the member to the copy and records a start date, due date
and ACTIVE status. If the copy is unavailable, the request fails without
creating a loan or changing the member's record.

For this classroom implementation, each member keeps one current loan.
Date strings are supplied. Returning books and loan history are extensions.

Discuss before coding:

1. Underline nouns. Which are classes, and which are fields or values?
2. Circle verbs. Which object should own each action or rule?
3. Why do Book and BookCopy need separate classes?
4. What responsibilities and collaborators belong on each CRC card?
5. Trace a successful borrow request as numbered messages between objects.
6. Identify exactly which values change, and which stay the same.
7. What must happen if another member requests the same unavailable copy?

Implementation:

Complete the TODOs in model.BookCopy.tryBorrow() and app.LibraryDesk.borrow().
Use the supplied constructors and reference fields. Compile and run app.Main.
Explain each change in its before/after output. No arrays or collections are
needed for the domain code.
