Java File I/O and Stream Operations - Project
Project Overview
This project is a collection of Java programs that demonstrate various file input/output (I/O) operations using different types of streams and buffers. The programs cover tasks such as reading from and writing to files, working with byte and data streams, handling file metadata, and performing basic file manipulations.

The project is organized into separate Java packages based on different assignments, each focusing on a specific topic from the slides or the provided tasks.

Structure
The project is divided into multiple packages located in the src folder.
Each task is implemented in its own package, with a main Java file for each specific question.
An App.java file is included, which acts as the main entry point and calls all the individual tasks for execution.
Folder Structure
bash
Copy code
src/
 ├── app/
 │    └── App.java                  # Main entry point of the project.
 ├── compileexamples/               # Package for examples from the slides.
 ├── slideexamples/                 # Package for I/O and File handling examples.
 ├── test_files/                    # Folder for placing test files (e.g., .txt, .jpg, .zip)
 └── README.md                      # Project documentation.
Prerequisites
Before running the project, make sure you have the following:

Java Development Kit (JDK) installed (version 8 or above).
IDE like Visual Studio Code or Eclipse (optional but recommended).
Command Line tools if you prefer to compile and run manually.
How to Run the Project
Using an IDE (e.g., Visual Studio Code):
Open the project in your preferred IDE (Visual Studio Code or Eclipse).
Navigate to the src/app/App.java file.
Right-click on App.java and choose Run (or press F5 in VS Code).
The program will execute all the tasks sequentially, displaying the results in the console.
Using Command Line:
Navigate to the Project Directory: Open a terminal or command prompt and navigate to the root folder of the project.

Compile the Project: Compile the Java files using the following commands:

bash
Copy code
javac src/app/*.java
javac src/compileexamples/*.java
javac src/slideexamples/*.java
Run the App Class: Once the files are compiled, run the App.java class:

bash
Copy code
java app.App
Test Files
Some of the programs in this project require test files for their operations (e.g., .txt files, .zip files, .jpg images). These test files should be placed in the test_files directory. If the test files are missing or not available, the programs that depend on them will throw errors or fail to execute properly.

Expected Output
Once the program is executed, it will sequentially perform the following tasks:

Reading and writing to files.
Manipulating arrays.
Displaying results such as file sizes, contents, and processing speeds.
Showing how data is read/written using different I/O streams (e.g., buffered streams, byte arrays, file outputs, etc.).
The output will be printed to the console.

Project Files
Below is a brief description of the main files in the project:

App.java: The main driver program that calls all tasks.
BuffInput.java, BuffInputFile.java, ByteArrayIOApp.java, etc.: Individual Java programs that implement different file I/O operations.
test_files/: Folder for required test files (e.g., b.txt, a.txt, github.png, test.zip).
License
This project is provided as-is for educational purposes. You are free to use and modify it for learning and experimentation.

Contact
For any questions or issues, feel free to reach out to me.
