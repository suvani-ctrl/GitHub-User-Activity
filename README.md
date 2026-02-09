![alt text](image.png)
# GitHub Activity Tracker

A Java command-line application that fetches and summarizes recent public activity of any GitHub user using the GitHub Events API.

This tool connects directly to GitHub, parses raw JSON responses, and presents readable activity summaries in the terminal.

---

## Features

* **Live GitHub Data**
  Fetches real-time public events from `api.github.com`.

* **Structured JSON Parsing**
  Uses Google Gson to convert raw API responses into readable summaries.

* ** Error Handling**
  Handles invalid usernames, empty activity, and connection issues.

* **Maven-Based Project**
  Clean dependency management and standard build lifecycle.

---

## Prerequisites

* Java 17 or higher
* Maven 3.6 or higher
* Internet connection

---

## Installation

Clone the repository:

```bash
git clone https://github.com/suvani-ctrl/GithubActivityTracker.git
cd GithubActivityTracker
```

Ensure the project follows the standard Maven structure:

```
src/
 └── main/
     └── java/
         └── GithubActivityTracker/
```

---

## How to Run

Compile and execute the application using Maven:

```bash
mvn clean compile exec:java -Dexec.mainClass="GithubActivityTracker.Main"
```

When prompted, enter a GitHub username (for example: `suvani-ctrl`) to view their recent activity.

---

## Project Architecture

* **Main.java**
  Handles user input and controls the application flow.

* **Api.java**
  Manages HTTP connections and GitHub API requests.

* **Parser.java**
  Filters and formats GitHub event types into readable output.

---

## Notes

* Only public GitHub activity is accessible.
* Rate limits apply according to GitHub’s API policy.
* Authentication is not required for basic usage.
