# PHẦN 1 - PHÂN TÍCH

## 1. Vì sao `spring-boot-starter-web` được gọi là "Starter"?

`spring-boot-starter-web` được gọi là một **Starter Dependency** vì nó hoạt động như một "gói khởi động" dành cho việc phát triển ứng dụng Web bằng Spring Boot.

Thay vì phải tự tìm kiếm, khai báo và quản lý hàng loạt thư viện riêng lẻ, lập trình viên chỉ cần thêm một dependency duy nhất:

```gradle
implementation 'org.springframework.boot:spring-boot-starter-web'
```

Spring Boot sẽ tự động kéo về toàn bộ các thư viện cần thiết cho ứng dụng Web.

---

## 2. Starter này giúp tránh phải khai báo những thư viện nào?

Nếu không dùng Starter, lập trình viên phải tự khai báo rất nhiều dependency như:

| Nhóm | Thư viện |
|---|---|
| **Spring MVC** | `spring-web`, `spring-webmvc` |
| **Embedded Server** | `tomcat-embed-core`, `tomcat-embed-el`, `tomcat-embed-websocket` |
| **JSON Processing** | `jackson-databind`, `jackson-core`, `jackson-annotations` |
| **Validation** | `hibernate-validator` |
| **Logging** | `logback-classic`, `slf4j-api` |
| **Khác** | Servlet API, YAML parser, Spring Context, Spring Beans, Spring Core, HTTP support libs |

---

## 3. Lợi ích của Starter Dependency

### Giảm cấu hình thủ công
Không cần cấu hình XML phức tạp như Spring truyền thống.

### Tương thích phiên bản
Spring Boot tự quản lý version giữa các thư viện để tránh xung đột dependency.

### Tăng tốc khởi tạo dự án
Có thể tạo và chạy ứng dụng Web chỉ trong vài phút.

### Tích hợp Embedded Server
Ứng dụng có thể chạy trực tiếp bằng:

```bash
./gradlew bootRun
```

mà không cần cài Tomcat riêng.

---

## Kết luận

`spring-boot-starter-web` là một "Starter" vì nó đóng vai trò như một bộ dependency hoàn chỉnh dành cho phát triển Web Application. Nó giúp lập trình viên không cần tự cấu hình hàng loạt thư viện nhỏ lẻ, đồng thời tận dụng được **Auto Configuration** và **Embedded Tomcat** của Spring Boot để chạy ứng dụng nhanh chóng và đơn giản.