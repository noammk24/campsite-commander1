# Campsite Commander 

## Overview

Campsite Commander is an Android mobile application developed using Kotlin in Android Studio.

The application helps campers organize and manage camping equipment before a trip by allowing users to:

- Add camping gear
- Categorize equipment
- Record quantities
- Add comments and notes
- View a complete camping checklist
- Calculate the total number of packed items

---

## Features

 Splash Screen

 Add Gear Functionality

 View Checklist Functionality

 Parallel Arrays

 Loops and Functions

 Total Items Packed Calculation

 Activity Navigation

 Input Validation

Dark Camping Theme

---

## Technologies Used

- Kotlin
- Android Studio
- XML
- GitHub

---

## Application Screenshots

### Splash Screen

![Splash Screen](screenshots/splash_screen.png)

### Main Screen

![Main Screen](screenshots/main_screen.png)

### Add Gear Screen

![Add Gear Screen](screenshots/add_gear_screen.png)

### Detailed View Screen

![Detailed View Screen](screenshots/detailed_view_screen.png)

---

## Flowchart

```mermaid
flowchart TD

A[Start Application] --> B[Splash Screen]

B --> C[Wait 3 Seconds]

C --> D[Main Activity]

D --> E[Calculate Total Items]

E --> F{Select Option}

F -->|Add Gear| G[Add Gear Screen]

G --> H[Save Gear Item]

H --> D

F -->|View Checklist| I[Detailed View]

I --> J[Display Items Using Loop]

J --> K[Back To Base]

K --> D

D --> L[Exit Application]
```

---

## Pseudocode

```text
START

Display Splash Screen

Wait 3 seconds

Open Main Activity

Calculate Total Items

FOR each quantity
    Add quantity to total
NEXT

IF Add Gear selected
    Save item details
ENDIF

IF View Checklist selected
    Display checklist
ENDIF

END
```

---

## Installation

1. Download the project.
2. Open Android Studio.
3. Select Open Project.
4. Run the application using an emulator or Android device.

---


## Author

Name: MULENGA NOAM 

Student Number: ST10517736

Module: IMAD

---

## References

Android Developers (2025). Android Developers Documentation. Available at: https://developer.android.com

JetBrains (2025). Kotlin Documentation. Available at: https://kotlinlang.org/docs/home.html

GitHub (2025). GitHub Documentation. Available at: https://docs.github.com
