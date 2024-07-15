E-commerce Application
This project is an E-commerce application built using Java. It includes features for customer management and verification, utilizing both email and Google login services.

Project Structure
Abstracts
CustomerCheckService.java: Interface for customer verification services.
CustomerService.java: Interface for customer-related operations.
VerificationService.java: Interface for verification services.
Concretes
CustomerCheckManager.java: Implements customer verification logic.
CustomerManager.java: Manages customer operations.
MailVerificationManager.java: Manages email verification.
Adapters
GoogleLoginAdapter.java: Adapter for Google login service.
Data Access
CustomerDao.java: Interface for customer data access operations.
HibernateCustomerDao.java: Implements customer data access using Hibernate.
Entities
Customer.java: Represents the customer entity.
Entity.java: Base class for entities.

Setup
Clone the repository

git clone https://github.com/yourusername/ecommerce-application.git

Open the project in your preferred IDE.
Ensure you have Java JDK and necessary dependencies installed.
Run the application.
Usage
Register new customers and manage existing ones.
Verify customer emails or log in using Google.
View and manage customer data.
Contribution
Feel free to contribute by creating pull requests or opening issues.

License
This project is licensed under the MIT License.
