🚭 Smoke-Free Journey
Smoke-Free Journey is a desktop application designed to help users track their progress and stay motivated during their journey to quit smoking. It aims to facilitate the transition to a healthier lifestyle.

📖 Overview
This project is a Java-based smoking cessation tracking system. Users can log their daily cigarette consumption, set health goals, and monitor their progress.

🛠️ Key Features
User Management: Register new accounts and log in with existing users.
Progress Tracking: Enables users to log daily cigarette consumption.
Motivational Data Visualization: Displays the benefits of quitting smoking and tracks cost savings.
Smoking Cessation Plan: Generates a tailored quitting plan based on user inputs.

📂 Project Structure
Account: Manages user information and smoking cessation plans.
AccountDb: Stores user data and performs user authentication.
Application: The entry point of the application.
CigarettePackage: Contains cigarette package details and price calculations.
SmokeQuitPlan: Manages the user's quit smoking plan, including daily targets and progress visualization.
Menus and Their Variants: Provide an interactive menu system for the application:
MainMenu: Main navigation menu.
LoginMenu: User login interface.
RegisterMenu: Handles user registration, including initial data input for quitting plans.
DialogMenu: Guides users to log daily usage and provides feedback.
MenuExitException: Handles menu exit scenarios.

📋 How It Works
Registration:
Users input their daily cigarette consumption, cost, and target quitting period in days.
A personalized quitting plan is generated.
Login and Progress Tracking:
Users log in to their accounts to record daily cigarette usage.
The system provides feedback on their progress and displays cost savings.
Visualization:
Daily goals are outlined, and users can track their adherence to the plan.
Final results are displayed upon completion of the quitting period.
