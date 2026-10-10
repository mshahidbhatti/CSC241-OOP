CSC241 - Object-Oriented Programming
Lecture 09 Case Study: Card Game
BCS Section

Files:
- Suit.java
- Rank.java
- Card.java
- Deck.java
- Player.java
- Game.java
- Main.java

Concepts demonstrated:
- enum
- classes and objects
- object references
- object arrays
- HAS-A relationships
- passing objects to methods
- returning objects from methods
- composition
- shared references
- array traversal
- swapping references during shuffle

Compile:
    javac *.java

Run:
    java Main

Recommended classroom coding sequence:
1. Suit.java
2. Rank.java
3. Card.java
4. Create a small Card[] manually in Main
5. Deck.java
6. dealCard()
7. Player.java
8. Player[] in Main
9. Game.java
10. shuffle()
11. Draw the complete object graph

Important teaching note:
Card[] and Player[] store references to objects, not copies of objects.
