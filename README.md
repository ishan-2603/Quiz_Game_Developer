# Quiz Game Project

# Overview
The Quiz Game is a Java-based console application that challenges players with multiple-choice questions on various topics. It features three difficulty levels: Easy, Medium, and Hard, and uses object-oriented programming principles for flexible design. The game aims to provide a fun and educational experience while demonstrating core Java skills.

# Features
Multiple Difficulty Levels: Players can choose from Easy, Medium, or Hard questions.
Randomized Question Selection: Questions are randomly selected to add variety.
Hints: Each question type (Easy, Medium, Hard) offers hints to help players.
Scoring System: Correct answers increase the score, encouraging players to improve.
Interactive Gameplay: Players receive instant feedback and can choose to continue or exit.

# Workflow
Start the Game: Players select a difficulty level (Easy, Medium, Hard).
Answer Questions: A question is presented with four answer options. Players can request a hint if needed.
Score Tracking: Correct answers increase the score, and feedback is provided for each response.
Continue or Exit: Players decide whether to attempt more questions or end the game.
Game End: The final score is displayed.

# Object-Oriented Design
Abstraction: A base Question class defines common attributes and methods.
Inheritance: Subclasses (EasyQuestion, MediumQuestion, HardQuestion) extend the base class to provide specific functionality.
Polymorphism: Methods are overridden to customize behaviors across question types.
Encapsulation: Class attributes are kept private and accessed via public methods.

# Java Skills Demonstrated
Class Design and Composition: Uses multiple classes to organize the game structure.
Method Overriding and Abstract Classes: Demonstrates OOP principles through inheritance and method overriding.
User Input Handling: Uses the Scanner class for interactive gameplay.
Randomization: Incorporates the Random class to shuffle and select questions.
Game Loop: Implements a loop to manage repeated gameplay.
