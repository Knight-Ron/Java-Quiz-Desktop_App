# 🧠 Java Quiz Desktop Application

A simple yet engaging **multiple-choice quiz desktop application** built using **Java Swing**. It features a timed question system, user login, hints, score calculation, and a final result display — all packed in a clean GUI.

---

## 🚀 Features

* 🔐 User login with ID entry
* 📋 Quiz rules screen
* 📝 10 fixed MCQs with:

  * ⏱ 30-second countdown timer per question
  * 💡 One-time hint to eliminate 2 wrong options
* 🧲 Real-time score tracking
* 🏁 Final score screen with retry option

---

## 🗂️ Project Structure

```
Java-Quiz-Desktop_App/
├── Quiz_Images/         # Image assets (CU_LOGO.jpg, score.png, etc.)
├── src/
│   ├── Login.java       # Login screen
│   ├── Rules.java       # Instructions display
│   ├── Quiz.java        # Core quiz logic + UI
│   └── Score.java       # Result and retry interface
└── README.md
```

---

## ✅ Prerequisites

* Java JDK 8 or higher
* A Java IDE (e.g. IntelliJ IDEA, Eclipse) or terminal access
* All images placed in the `Quiz_Images/` directory

---

## 💻 How to Run

1. **Clone or download** the repository.
2. Ensure the following images are in `Quiz_Images/`:

   * `CU_LOGO.jpg`
   * `Uni_Temp.jpg`
   * `score.png`
3. Open terminal and compile:

   ```bash
   javac src/*.java
   ```
4. Launch the app:

   ```bash
   java src.Login
   ```

---

## 🛠️ Customization

* **Questions & Answers**: Update the arrays in `Quiz.java`.
* **Timer duration**: Modify the timer setting in `Quiz.java`.
* **Scoring logic**: Tweak the `actionPerformed()` method for custom rules.

---

## 🌱 Future Enhancements

* Load questions from external files (JSON/CSV)
* Add user profiles and score history
* Better UI using Layout Managers
* Quiz categories or difficulty levels

---

## 📝 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

Made by [**Ronald Jacob**](https://www.linkedin.com/in/ronald-jacob-20380a304/)
