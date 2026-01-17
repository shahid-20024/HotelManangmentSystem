# Hotel Management System (Defensive & Refactored Version)

## Project Overview

This project is a robust Java-based **Hotel Management System** designed with a focus on **Defensive Programming** and **Code Refactoring**. It manages the lifecycle of hotel operations, including infrastructure setup, guest profiles, reservations, and financial transactions.

## Key Features

* **Defensive Design**: Extensive input validation using `IllegalArgumentException` and state checking with `IllegalStateException` to prevent system crashes.
* **Data Integrity**: Prevents logical errors such as double-booking rooms or setting check-out dates before check-in dates.
* **Encapsulation**: Fields are marked `final` where possible to ensure immutability and data consistency.
* **Robust Exception Handling**: Uses `try-catch` blocks within the `HotelChain` and `Main` classes to handle errors gracefully without interrupting the entire system flow.

## Building and Running the Project

### Prerequisites

* **Java Development Kit (JDK)**: Version 8 or higher.
* **IDE**: Visual Studio Code, IntelliJ IDEA, or Eclipse.
* **JUnit 4**: Required for running the test suite.

### Steps to Run

1. **Clone the Repository**:
git clone (https://github.com/shahid-20024/HotelManangmentSystem)

2. **Compile the Source Code**:
Open your terminal in the project root directory and run:
javac *.java

3. **Execute the Main Class**:
Run the application to see the defensive checks and system flow in action:
java Main

## Executing Tests

The project includes a comprehensive suite of unit tests to verify both successful operations and defensive error handling.

### Running Tests in VS Code

1. Navigate to the **Testing** tab in the Activity Bar (left side).
2. Click the **Run Tests** button (Play icon) at the top of the testing tree.
3. Alternatively, open any test file (e.g., `HotelchainTest.java`) and click **Run Test** above the method signature.

### Testing Scenarios Included

* **Success Cases**: Verifying full reservation flows from infrastructure setup to checkout.
* **Defensive Checks**: Testing that the system correctly throws exceptions when provided with:
* Empty guest names or addresses.
* Invalid credit card formats (missing hyphens).
* Invalid reservation dates (end date before start date).
* Booking requests for hotels with no available rooms.

## Project Structure

| Class               | Responsibility                                                           |
| ------------------- | ----------------------------------------------------------------------   |
| `Main`              | Entry point; demonstrates system features and error handling.            |
| `HotelChain`        | Manages multiple hotels and coordinates reservations/check-ins.          |
| `Hotel`             | Manages rooms, room types, and availability logic.                       |
| `Reservation`       | Validates stay dates and finalizes booking records.                      |
| `ReserverPayer`     | Handles customer profiles and payment detail validation.                 |
| `Room` / `RoomType` | Manages physical room data and pricing constraints.                      |
| `Guest`             | Validates and manages individual occupant profiles and personal details. |

Developd by Shahid Sohail