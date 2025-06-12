# Java Quiz Application

A desktop quiz application developed in Java using Swing. This project provides a timed, multiple-choice question-based quiz interface with features such as user login, hints, score tracking, and a result display.

## Features

- User login screen to enter unique ID
- Rules screen with quiz instructions
- Multiple-choice quiz with:
  - 10 predefined questions
  - 30-second timer per question
  - Hint functionality to eliminate two incorrect options
- Final score calculation based on correct answers
- Result screen with score display and retry option

## Project Structure

QuizApp/
├── Quiz_Images/ # UI images (CU_LOGO.jpg, score.png, etc.)
├── src/
│ ├── Login.java # Login interface
│ ├── Rules.java # Quiz rules screen
│ ├── Quiz.java # Main quiz logic, timer, UI handling
│ └── Score.java # Final score display and retry functionality
└── README.md

## Prerequisites

- Java Development Kit (JDK 8 or higher)
- IDE or text editor for Java development
- Ensure all image resources are placed correctly in the `Quiz_Images/` folder

## How to Compile and Run

1. Clone or download the repository.
2. Place the required images (`CU_LOGO.jpg`, `Uni_Temp.jpg`, `score.png`, etc.) inside the `Quiz_Images/` directory.
3. Compile all `.java` files from the `src/` directory:
   ```bash
   javac src/*.java
4. Run the application starting from the Login screen:
   ```bash
   java src.Login

## Customization
1. Questions and Answers: Modify the arrays in Quiz.java to add or edit questions and answers.
2. Timer: Change the default timer value by editing the timer variable in Quiz.java.
3. Scoring logic: Adjust the score variable handling in the actionPerformed method of Quiz.java.

## Future Improvements
1. Dynamic loading of questions from external files (e.g., JSON or CSV)
2. User authentication and score history
3. Improved UI layout with layout managers
4. Support for multiple categories or difficulty levels

## License
This project is released under the MIT License.

## Author
Developed by Ronald Jacob. This application was created as part of a practice project to demonstrate Java Swing capabilities and basic quiz logic implementation.
