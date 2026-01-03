#  College Management System (Java)

A console-based Java application designed to manage Courses, Faculties, Batches, and Students using core Object-Oriented Programming (OOP) concepts. The system provides a menu-driven interface and follows a layered architecture.

---

##  Features

- Add and view Courses  
- Add and view Faculties linked with Courses  
- Add and view Batches linked with Faculties  
- Add and view Students linked with Batches  
- Menu-driven console interface  
- In-memory data storage using Collections  
- Input validation with exception handling  

---

##  Technologies Used

- Java (Core Java)
- Collections Framework
- Object-Oriented Programming (OOP)
- Eclipse / IntelliJ IDEA
- Git & GitHub

---

##  OOP Concepts Implemented

- **Encapsulation** – Private variables with getters and setters  
- **Abstraction** – Service interface (`Aes`)  
- **Association & Aggregation** – Real-world entity relationships  
- **Polymorphism** – Interface-based implementation  
- **Exception Handling** – Safe user input handling  

---

##  Project Structure

```bash
src/
├── com.aes.collegeMangement.model
│ ├── Course.java
│ ├── Faculty.java
│ ├── Batch.java
│ └── Student.java
│
├── com.aes.collegeMangement.service
│ └── Aes.java
│
├── com.aes.collegeManagement.serviceImpl
│ └── ServiceImpl.java
│
└── com.aes.collegeMangement.ui
└── Ui.java

```
---

##  How to Run the Project

1. Clone the repository  
   ```bash
   git clone https://github.com/your-username/college-management-system.git
   
2. Open the project in Eclipse / IntelliJ IDEA

3. Navigate to:
src → com.aes.collegeMangement.ui → Ui.java

4. Right-click on Ui.java
→ Run As
→ Java Application

---

## Author

Sarvesh Bamane
Aspiring Java Full-Stack Developer
