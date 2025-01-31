# Receipt Processing Challenge - Dockerized Spring Boot App

This is a **Spring Boot** application for processing receipts. The app is containerized using **Docker** to ensure easy deployment and execution.

---

### Instructions
```sh
1. Clone the repo:
git clone https://github.com/Stnaemx/receiptChallenge.git

2. Run with Docker:
docker build -t receipt-processor-app .

3. Start the container and expose port 8080:
docker run -p 8080:8080 receipt-processor-app

4. Access the Application:
Endpoint: http://localhost:8080
