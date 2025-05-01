# Level 2: AssertJ - Assertion Exercises with Java and AssertJ

## 📄 Description - Exercise Statement
This project contains a series of exercises aimed at learning and practicing the use of the AssertJ library for writing assertions in Java unit tests. Each exercise represents a common situation that can be validated through assertions, such as value equality, collection order, or presence of keys in maps.

## 💻 Technologies Used
- Java 17 or higher (compatible up to Java 24)
- JUnit 5 (JUnit Jupiter)
- AssertJ 3.25.3
- Maven (dependency manager)
- IntelliJ IDEA (recommended IDE)

## 📋 Requirements
- Java Development Kit (JDK) 17 or higher
- Apache Maven installed
- IntelliJ IDEA or any IDE compatible with Maven and JUnit 5

## 🛠️ Installation
1. Clone or download the project repository:
```bash
git clone https://github.com/anaberod/S1.04_Testing_LV2.git
```
2. Open the project in IntelliJ IDEA as a Maven project.
3. Wait for Maven to download all dependencies.

## ▶️ Execution
- Run the tests from IntelliJ by right-clicking the test class > "Run Test"
- Or from terminal:
```bash
mvn test
```

## 🌐 Deployment
This project does not require deployment as it consists of educational unit tests.

## 🤝 Contributions
1. Fork the repository
2. Create a branch with your improvement: `git checkout -b improve-exercise4`
3. Make your changes and commit
4. Submit a pull request explaining your improvement

---

# 📘 Exercises

## ✅ Exercise 1
Write one assertion that confirms two integer values are equal, and another that confirms they are not.

## ✅ Exercise 2
Create one assertion verifying that two object references point to the same object, and one verifying they are different.

## ✅ Exercise 3
Write an assertion that checks two arrays of integers are identical.

## ✅ Exercise 4
Create an ArrayList with various object types and:
- Assert the order matches insertion.
- Assert the objects exist regardless of order.
- Assert one object is included only once.
- Assert a certain object is not present in the list.

## ✅ Exercise 5
Create a map and assert that it contains a specific key.

## ✅ Exercise 6
Force an ArrayIndexOutOfBoundsException and assert that the exception is thrown.

## ✅ Exercise 7
Create an empty Optional and assert that it is empty.

---

✉️ For any questions or suggestions, feel free to reach out or contribute via pull requests. Thanks for checking out this educational project!