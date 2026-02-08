\# URL Shortener Service 🚀



A scalable URL shortener service built using Spring Boot and MySQL that generates short URLs, handles redirection, supports user management, and tracks click analytics.



---



\## 🏗️ Tech Stack



\- Java 17

\- Spring Boot

\- Spring Security

\- JPA / Hibernate

\- MySQL

\- Maven

\- REST APIs



---



\## ✨ Features



\- 🔗 Generate short URLs

\- ↪ Redirect to original URLs

\- 👤 User registration \& authentication

\- 📊 Click tracking (analytics)

\- 🛡 Secure endpoints using Spring Security

\- 🗄 Persistent storage using MySQL

\- ⚡ Clean layered architecture



---



\## 📐 System Architecture



Client → Controller → Service → Repository → Database



\### Flow: URL Shortening



1\. Client sends long URL.

2\. Service generates unique short code.

3\. Mapping is stored in database.

4\. Short URL is returned.



\### Flow: Redirection



1\. User hits short URL.

2\. System fetches original URL.

3\. Click event is recorded.

4\. User is redirected.



---



\## 📬 API Endpoints



\### 🔹 Create Short URL - Developing

