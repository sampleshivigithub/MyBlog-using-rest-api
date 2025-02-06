# MyBlog-using-rest-api
MyBlog - REST API
A Spring Boot REST API for managing a blogging platform, allowing users to create, read, update, and delete blog posts with authentication and authorization.

Blog REST API - Project Overview
This project is a Spring Boot-based REST API for a blogging platform. It allows users to perform CRUD (Create, Read, Update, Delete) operations on blog posts, categories, and comments while ensuring authentication and authorization using Spring Security and JWT.

Key Features:
✅ User Authentication & Authorization – Secure login and signup using JWT.
✅ CRUD Operations – Manage blog posts, categories, and comments with RESTful endpoints.
✅ Role-Based Access Control – Restrict access for normal users and admins.
✅ Exception Handling – Custom error responses using BlogAPIException.
✅ Pagination & Sorting – Efficient data retrieval with flexible queries.
✅ Database Integration – Uses MySQL/PostgreSQL with Spring Data JPA.
✅ API Documentation – Swagger UI for testing API endpoints.

Technology Stack:
Spring Boot – Backend Framework
Spring Security & JWT – Authentication & Authorization
Spring Data JPA & Hibernate – ORM & Database Handling
MySQL/PostgreSQL – Database
Swagger UI – API Documentation

1. Clone the Repository
git clone https://github.com/your-username/myblog-api.git
cd myblog-api

3. Configure Database
Update application.properties or application.yml with your MySQL/PostgreSQL database credentials:

properties-
spring.datasource.url=jdbc:mysql://localhost:3306/myblog
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3. Install Dependencies & Run the Project
mvn clean install
mvn spring-boot:run

4. API Endpoints
Method	Endpoint	Description	Access
POST  -	/api/auth/register	Register a new user	Public
POST	 - /api/auth/login	User login (JWT Token)	Public
GET -	/api/posts	Get all blog posts	Public
POST	- /api/posts	Create a new post	Admin
PUT	 - /api/posts/{id}	Update a post	Admin
DELETE	- /api/posts/{id}	Delete a post	Admin
GET	 - /api/posts/{id}/comments	Get comments for a post	Public
POST	- /api/posts/{id}/comments	Add a comment	Authenticated Users

5. Authentication
Uses JWT (JSON Web Token) for secure API access.
After login, include the token in the Authorization header:
Authorization: Bearer your_jwt_token

7. API Documentation
Once the project is running, access Swagger UI:
📌 http://localhost:8080/swagger-ui/

Contributing
Feel free to fork this project and submit pull requests for improvements.
