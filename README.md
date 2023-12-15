---------------------------
AADP Lab Soccer Simulator
---------------------------

Welcome to the AADP Lab Soccer Simulator! This application is a Java-based simulation for managing soccer teams and simulating matches.

Team Members:
- Victor Silva (2021259)
- Joelma Rodrigues (2023246)
- Alessandra Cabelliero (2021258)

Features:
- Enter a new player to a team.
- View the roster of players on a team.
- Simulate soccer matches between teams.

Prerequisites:
- Java 8 or above installed on your machine.
- MySQL database server running and accessible.

Installation:
1. Ensure Java and MySQL are installed on your system.
2. Place the 'AADP_Lab_SoccerSimulator.jar' in a directory on your system.

Running the Application:
To run the application, navigate to the folder containing the JAR file in your terminal and execute:
java -jar AADP_Lab_SoccerSimulator.jar

Ensure you have the MySQL JDBC driver in your classpath. If not, include it when running the application using the following command:
java -cp "AADP_Lab_SoccerSimulator.jar;path_to_mysql_connector.jar" aadp_lab_soccersimulator.AADP_Lab_SoccerSimulator

Configurations:
The database URL, username, and password are set to default values. Change these in the source code if necessary or manage them via a configuration file or environment variables.

Usage:
Follow the on-screen prompts to interact with the system after launching the application.

Contributing:
Please fork the repository, make changes, and submit a pull request for any contributions.

Support:
For support, please contact the development team or open an issue in the project repository.

License:
This project is licensed under the MIT License.
