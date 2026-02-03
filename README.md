# Java Rock Paper Scissors Game

A simple command-line version of the classic Rock, Paper, Scissors game built with Java.

## Description
This is a console-based application where a user plays against the computer. The program validates user input, randomly generates a move for the computer, determines the winner based on game logic, and offers the option to play again after a loss.

## Features
- **Input Validation:** Ensures the user only enters "rock", "paper", or "scissors".
- **Randomized Opponent:** Uses the `java.util.Random` class to simulate the computer's choice.
- **Game Loop:** Utilizes a `do-while` loop to allow continuous gameplay.
- **Case Insensitivity:** Automatically converts user input to lowercase for better user experience.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed.
2. Save the code in a file named `Main.java`.
3. Open your terminal or command prompt.
4. Compile the code:
   ```bash
   javac Main.java