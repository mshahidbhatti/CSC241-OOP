# CSC241 Lecture 08 - BCS live coding

Copy these three project folders under:
`C:\Teaching\Fall2026\CSC241-OOP\00_Course_Master\01_Lectures\Week04\L08\LiveCoding`

The PowerPoint folder links point to that exact location. The slides can be
stored under `L08\Slides`. On a different machine/path, right-click each
underlined folder link in PowerPoint, choose Edit Link and select its folder.
In Slide Show, click the link. After coding, Alt+Tab returns to the slides.
If a folder link does not open, use the printed path in the speaker notes or
open File Explorer at the LiveCoding folder before starting class.

1. `01_RegistrationModel`: class scaffolding and four TODOs.
2. `02_RegistrationCompleted`: the working version and scenario output.
3. `03_LibraryBorrowing`: transfer exercise with two TODOs.

No arrays or ArrayList are needed for the domain implementation. `String[] args`
is only the supplied Java entry-point signature. All projects have `model`
and `app` packages and work independently.

Registration after completion: before Student B's request, firstStudent is
DEMO-01, secondStudent is null, enrolled is 1 and B's currentEnrollment is null.
After success: secondStudent is DEMO-02, enrolled is 2, hasSeat is false and
B's currentEnrollment refers to an ACTIVE Enrollment. Capacity stays 2.
Repeated and full-section requests return null and leave state unchanged.

Library after completing the TODOs: copy.available changes true to false;
member.currentLoan changes null to an ACTIVE Loan. Loan links member/copy
and stores the provided date strings. A second member's request fails while
the copy is unavailable. Return and loan history are later extensions.

All DEMO identifiers describe fictional classroom data.
