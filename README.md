# 📸 Image Upload and Download Project

This is a Spring Boot application that allows users to upload images and view/download them from a MySQL database.

---

## 🚀 Features

- Upload images and store in database (LONGBLOB format)
- Retrieve and display/download images by ID
- Uses REST APIs
- Easy to test with Postman or any REST client

---

## 🛠 Technologies Used

- Java 17+
- Spring Boot 3+
- Spring Web
- Spring Data JPA
- MySQL Database
- Maven
- Postman (for API testing)

---

## ⚙️ How to Setup

1. **Clone this repository**:
   git clone https://github.com/your-username/your-repo-name.git

2. **Create Database in MySQL**:
CREATE DATABASE imagedb;

3. **Configure application.properties**:

    - spring.datasource.url=jdbc:mysql://localhost:3306/imagedb

    - spring.datasource.username=Your_userName

    - spring.datasource.passwordYour_password

    - spring.jpa.hibernate.ddl-auto=update

    - server.port=1998

4. **Run the project**:
   Open the project in STS / IntelliJ / VSCode → Run ImageUploadDownloadApplication.java

🧪 API Endpoints

Method	Endpoint	Description
POST	/api/images/upload	Upload an image

GET	/api/images/view/{id}	View or download an image

📸 How to Test (Postman Example)
Upload:

Method: POST

URL: http://localhost:1998/api/images/upload

Body: form-data

Key: image

Value: Select a file (image file)

View/Download:

Method: GET

URL: http://localhost:1998/api/images/view/{id}

✨ Notes

  - Ensure MySQL service is running.

  - Application will automatically create images table.

  - Uploaded images are stored in binary format (byte[]).

  - Can be easily extended to support multiple images, delete image, etc.

👨‍💻 Author
  Developed by Poovarasan 
