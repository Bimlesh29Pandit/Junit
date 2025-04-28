# 📚 JUnit Testing in Spring Boot

This document explains the basics of **JUnit 5 testing** in **Spring Boot** applications, including important annotations, examples, and best practices.

---

## 🛠 What is JUnit?

**JUnit** is a popular **Java testing framework** used to write and run **repeatable unit tests**.  
In Spring Boot, JUnit (especially **JUnit 5**, also known as **Jupiter**) is widely used for **testing services, controllers, repositories, etc.**

---

## 🎯 Why JUnit Testing?

- ✅ Test code quality and correctness
- ✅ Catch bugs early
- ✅ Automate repetitive testing
- ✅ Improve maintainability and confidence in code

---

## 🚀 Basic Example

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
```

---

## 🧠 Important JUnit Annotations

| Annotation     | Description                                    | Example                         |
| -------------- | ---------------------------------------------- | ------------------------------- |
| `@Test`        | Marks a method as a test case                  | `@Test void testMethod() {}`    |
| `@BeforeEach`  | Runs **before** each test                      | Setup code                      |
| `@AfterEach`   | Runs **after** each test                       | Cleanup code                    |
| `@BeforeAll`   | Runs once **before all tests** (static method) | Init DB                         |
| `@AfterAll`    | Runs once **after all tests** (static method)  | Close resources                 |
| `@Disabled`    | Skip a test                                    | `@Disabled("Reason")`           |
| `@Nested`      | Group tests logically in inner classes         | Organize big tests              |
| `@DisplayName` | Add custom names for tests                     | `@DisplayName("Addition test")` |

---

## 🧹 Common Assertions

| Assertion                                 | Purpose                         | Example                                             |
| ----------------------------------------- | ------------------------------- | --------------------------------------------------- |
| `assertEquals(expected, actual)`          | Check if two values are equal   | `assertEquals(5, sum);`                             |
| `assertNotNull(object)`                   | Check if object is not null     | `assertNotNull(user);`                              |
| `assertThrows(Exception.class, () -> {})` | Check if an exception is thrown | `assertThrows(IllegalArgEx.class, () -> method());` |
| `assertTrue(condition)`                   | Check if condition is true      | `assertTrue(user.isActive());`                      |
| `assertFalse(condition)`                  | Check if condition is false     | `assertFalse(user.isBanned());`                     |

---

## 🧩 Example with `@BeforeEach` and `@AfterEach`

```java
import org.junit.jupiter.api.*;

class SampleTest {

    @BeforeEach
    void setup() {
        System.out.println("Setting up before test...");
    }

    @Test
    void testOne() {
        System.out.println("Running test one");
        Assertions.assertTrue(true);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up after test...");
    }
}
```

**Output**:

```
Setting up before test...
Running test one
Cleaning up after test...
```

---

## 🧪 Spring Boot Testing Annotations (Special ones)

| Annotation                           | Purpose                                                           |
| ------------------------------------ | ----------------------------------------------------------------- |
| `@SpringBootTest`                    | Load full Spring Boot context for integration testing             |
| `@WebMvcTest`                        | Test only controller layer                                        |
| `@DataJpaTest`                       | Test only repository layer (JPA layer)                            |
| `@MockBean`                          | Add mock objects to Spring context                                |
| `@Autowired`                         | Inject real beans in test classes                                 |
| `@ExtendWith(SpringExtension.class)` | Integrate Spring with JUnit 5 (automatically done in Spring Boot) |

---

## ✨ Best Practices

- Write **small and focused tests**.
- Use **`@BeforeEach`** to set up **reusable** objects.
- Avoid **shared states** between tests.
- Prefer **`assertThrows`** for exception testing.
- Mock external services like APIs or databases.

---

## 🔥 Useful Tips

- Always name your test methods clearly, e.g., `shouldAddTwoNumbersCorrectly()`.
- Use `@DisplayName` for **readable reports**.
- Break larger tests into **nested classes** using `@Nested`.
- Combine **JUnit** with **Mockito** for **Mocking dependencies**.

---

## 📚 Further Learning

- **Mockito** for Mocking
- **MockMvc** for Controller testing
- **TestContainers** for Database testing
- **AssertJ** for advanced assertions

---

> **✅ With JUnit, your Spring Boot project will be more reliable, maintainable, and production-ready!**

---

Would you also like me to create a **sample real-world JUnit + Mockito test** for a service or controller? 🚀  
It will help you even more! 📖✨  
(Just say "Yes")
