# Java Full Stack Contact Management System

A full-stack Contact Management System built using Spring Boot, MySQL, HTML, CSS, and JavaScript. This project allows users to submit contact details and manage them through a dashboard with CRUD operations.

## Features

✅ Add new contact details  
✅ View all contacts in dashboard  
✅ Search contact by ID  
✅ Update contact details  
✅ Delete contact  
✅ Input validation  
✅ Global exception handling  
✅ REST API integration  
✅ Frontend and backend integration  
✅ MySQL database connectivity  
✅ Responsive UI using HTML/CSS  

---

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST API
- Maven

### Frontend
- HTML
- CSS
- JavaScript

### Database
- MySQL



## Project Structure

```text
src
├── controller
├── dto
├── entity
├── repository
├── service
├── Exception
├── resources
│   ├── templates
│   ├── static
│   └── application.yml
```

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|-------------|
| GET | /api/contacts | Get all contacts |
| GET | /api/contact/{id} | Get contact by ID |
| POST | /api/contact | Add contact |
| PUT | /api/contact/{id} | Update contact |
| DELETE | /api/contact/{id} | Delete contact |

---

## Screenshots

### Home Page
(Add screenshot here)

### Dashboard Page
(Add screenshot here)

---

## How to Run

1. Clone repository

```bash
git clone https://github.com/your-username/java-fullstack-contact-form.git
```

2. Open project in IntelliJ

3. Configure MySQL in:

```yaml
application.yml
```

4. Run Spring Boot application

5. Open browser:

```text
http://localhost:8080
```

---

## Future Improvements

- Dashboard analytics
- Authentication/Login system
- Responsive mobile design
- Deployment on AWS
- Email notifications

---

## Author

Mannat Sharma
