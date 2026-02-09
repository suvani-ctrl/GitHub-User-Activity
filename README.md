# GitHub-User-Activity

![alt text](image.png)


GitHub Activity Tracker
A  Java command-line interface (CLI) tool that fetches and summarizes recent activity for any GitHub user using the GitHub Events API.

Features
Real-time Fetching: Connects directly to api.github.com.

JSON Parsing: Uses Google's Gson library to transform raw JSON into human-readable summaries.

Error Handling: Manages invalid usernames and connection issues gracefully.

Maven Powered: Automated dependency management and build lifecycle.

Prerequisites
Java 17 or higher

Maven 3.6+

Installation & Setup
Clone the repository:

Bash
git clone https://github.com/suvani-ctrl/GithubActivityTracker.git
cd GithubActivityTracker
Project Structure: Ensure your files are in the standard Maven layout: src/main/java/GithubActivityTracker/

How to Run
Use Maven to clean, compile, and execute the application in one go:

Bash
mvn clean compile exec:java -Dexec.mainClass="GithubActivityTracker.Main"
When prompted, enter a GitHub username (e.g., suvani-ctrl) to see their recent activity summary.

Architecture
Main.java: Handles user input and coordinates the flow.

Api.java: Manages the HTTP connection and requests.

Parser.java: Contains the logic for filtering specific GitHub Event types.
