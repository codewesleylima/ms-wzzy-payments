<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PERSONAL PROJECT - MS-PAYMENTS 💳

### 📖 Description
Microservice responsible for **processing payments** in the library. MS-Payments is responsible for:
- 💳 **Process payments** via credit card and PIX
- 🔐 **Authorize and capture** transactions with external gateway
- 🛡️ **Validate fraud** through anti-fraud checks
- 🔄 **Process refunds** (full and partial)
- 🪝 **Receive webhooks** from payment gateway
- 📊 **Maintain transaction history** for audit
- 🔗 **Integrate with external** payment gateway
- 📈 **Record payment data** per customer

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Payment Flow

**Authorization and Capture Flow:**

1. **Client** → BFF: Confirms order and payment data
2. BFF → **ms-order**: Requests checkout
3. **ms-order** → **ms-payments**: Sends payment request
4. **ms-payments** → **Anti-Fraud**: Validates fraud score
5. **Anti-Fraud** → **ms-payments**: Returns risk analysis
6. **ms-payments** → **External Gateway**: Authorizes transaction
7. **External Gateway** → **ms-payments**: Returns authorization
8. **ms-payments** → **External Gateway**: Captures transaction
9. **External Gateway** → **ms-payments**: Confirms capture
10. **ms-payments** → Database: Persists transaction
11. **ms-payments** → **ms-order**: Confirms payment processed
12. **ms-order** → BFF: Confirms order complete
13. BFF → **Client**: Displays purchase success

**Webhook Flow:**

1. **External Gateway** → **ms-payments**: Sends webhook event
2. **ms-payments** → Validation: Verifies webhook signature
3. **ms-payments** → Database: Updates transaction status
4. **ms-payments** → **ms-order**: Notifies status change
5. **ms-order** → **ms-customers**: Updates history if needed

---

### ⚡ Features

1. 💳 Process credit card payments
2. 🏦 Process PIX payments
3. 🔐 Authorize and capture transactions with external gateway
4. 🛡️ Perform anti-fraud checks before processing
5. 💰 Validate amounts and currencies
6. 🔄 Process full and partial refunds
7. 🪝 Receive and process payment gateway webhooks
8. 🔍 Validate webhook signatures
9. 📊 Maintain transaction history for audit
10. 💾 Manage payment methods per customer

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and payment gateway credentials are configured in `application.properties`.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 🌐 Spring Cloud OpenFeign (integration with external gateway)
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 💳 Payment Gateway (Integration via HTTP/REST)
- 🛡️ Anti-Fraud Service
- 📨 Webhooks handling
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8pgDMsT7zMw/profile-displayphoto-crop_800_800/B4DZs03OodH8AM-/0/1766118457145?e=1781136000&v=beta&t=-N2WNA9CWJ7Io6nX33GPNvYtFl9ZQMAM-jALLlYNGc8" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
