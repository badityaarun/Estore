# E-Store: User and Product Management System

## 1. Project Overview

E-Store is a database-driven Java web application developed to manage
product information and support customer shopping workflows. The
application provides separate administrator and customer functionality.
Administrators can maintain product records, while customers can
register, log in, browse available products, and place orders.

The project demonstrates the application of object-oriented programming,
CRUD operations, server-side request processing, and relational database
connectivity in a Java web environment.

## 2. Key Features

### Administrator Module

-   Administrator login and dashboard.
-   Add new products with product details.
-   View available product records.
-   Update existing product information.
-   Delete product records.

### Customer Module

-   Customer registration and login.
-   Customer dashboard.
-   Browse available products and view product details.
-   Select a product and specify the required quantity.
-   View order confirmation and the total amount.
-   Log out of the application.

## 3. Technology Stack

-   **Java:** Application logic and object-oriented programming.
-   **Java Servlets:** HTTP request processing and coordination of
    application workflows.
-   **JSP (JavaServer Pages):** Dynamic server-rendered web pages.
-   **JDBC:** Connectivity between Java application code and the
    database.
-   **Oracle Database:** Relational data storage.
-   **PreparedStatement:** Parameterized SQL execution.
-   **HTML and CSS:** Web page structure and user interface styling.

## 4. Application Architecture

The application separates responsibilities across JavaBeans, DAO
classes, Servlets, JSP pages, and the database.

-   **Bean layer (`com.estore.bean`):** Represents application data,
    including administrator, customer, and product information.
-   **DAO layer (`com.estore.dao`):** Encapsulates database operations
    for product management, customer registration and login, and
    purchasing.
-   **Servlet layer (`com.estore.servlet`):** Processes HTTP requests
    and coordinates application operations.
-   **Presentation layer (`src/main/webapp`):** Contains HTML forms and
    JSP pages used by administrators and customers.
-   **Database layer:** Stores and retrieves application data through
    JDBC and Oracle Database.

## 5. Main Workflows

**Administrator workflow:**\
Log in → Open dashboard → Add, view, update, or delete products → Log
out.

**Customer workflow:**\
Register or log in → Browse products → Select a product → Enter quantity
→ View order confirmation → Log out.

## 6. Implementation Highlights

-   Implemented CRUD operations for product administration.
-   Organized application code into JavaBeans, DAO classes, and Servlets
    to separate data representation, database access, and request
    processing.
-   Integrated Java application components with Oracle Database using
    JDBC.
-   Used `PreparedStatement` for parameterized SQL operations.
-   Developed separate administrator and customer workflows.
-   Created dynamic web pages using JSP, HTML, and CSS.

## 7. Project Structure

The application uses the following primary packages and web resources:

``` text
Estore/
└── src/
    └── main/
        ├── java/
        │   └── com/estore/
        │       ├── bean/
        │       ├── dao/
        │       └── servlet/
        └── webapp/
            ├── css/
            ├── META-INF/
            ├── WEB-INF/
            ├── HTML pages
            └── JSP pages
```

## 8. Database Configuration

The application uses Oracle Database for persistent data storage.
Database-related functionality is organized in the DAO layer. The
project includes `DBConnect.java` and `DBInfo.java` in the
`com.estore.dao` package; consult these classes to identify the
connection setup and database configuration used by the current
implementation.

To run the application, configure the required Oracle Database
connection settings, JDBC driver, and database schema for the local
environment. Do not publish database passwords or other sensitive
credentials in a public repository.

## 9. Setup and Execution

### Prerequisites

-   A JDK compatible with the project.
-   Eclipse IDE or another compatible Java IDE.
-   Apache Tomcat compatible with the Servlet API used by the
    application.
-   Oracle Database and the appropriate JDBC driver.

### Steps

1.  Clone or download the repository.
2.  Import the project into Eclipse using **File → Import → General →
    Existing Projects into Workspace**.
3.  Verify the project's JDK and Java build path.
4.  Configure a compatible Tomcat server and associate the project with
    its runtime.
5.  Configure the Oracle Database connection settings used by the
    project.
6.  Ensure the required database schema and JDBC driver are available.
7.  Start the application on Tomcat.
8.  Open the application using the context path configured in the
    server. For example, a local setup may use
    `http://localhost:8080/Estore/`; the actual port and context path
    may differ.

## 10. Potential Enhancements

-   Product search and category filtering.
-   Customer order history and order status.
-   Improved server-side validation and error handling.
-   Secure password hashing and authorization checks.
-   Transaction-safe stock updates during purchases.
-   Automated testing and externalized configuration.

## 11. Author

**Baditya Arun**

------------------------------------------------------------------------
