
# Email Generator

The email generator is a simple Java project that allows users to generate new email addresses for new employees in a company.

## Installation

1. First, clone this repository to your local machine using `https://github.com/mickg77/emailGenerator.git`.
2. Open the project in your favorite IDE (like IntelliJ IDEA, Eclipse).
3. Make sure you have JDK and Maven installed in your machine. If not, please follow the respective official guides to install JDK and Maven.

## Usage

To use the email generator:

1. Create a new instance of the `newCustomer` class, providing the first name and the last name of the new employee. For example:

   ```java
   newCustomer customer = new newCustomer("John", "Doe");

Depending on the employee's department and preferred mailbox size, call the setDepartment and setMailbox methods respectively. The setDepartment method accepts an integer representing the department (1 for Computing, 2 for Engineering, 3 for None), and the setMailbox method accepts an integer representing the desired mailbox size.

To generate a new email address, call the setEmailAddress method.

The methods getDepartment, getPassword, getMailbox, and getEmailAddress can be used to retrieve the employee's department, generated password, mailbox size, and email address respectively.

Contributing
We welcome contributions to this project! To contribute:

Fork the project.
Create your feature branch (git checkout -b feature/AmazingFeature).
Commit your changes (git commit -m 'Add some AmazingFeature').
Push to the branch (git push origin feature/AmazingFeature).
Open a pull request.
License
Distributed under the MIT License. See LICENSE for more information.

Contact
Michael Griffiths - mickg77hotmail.com

Project Link: https://github.com/mickg77/emailGenerator
