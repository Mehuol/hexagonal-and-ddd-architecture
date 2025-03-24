🏗 Hexagonal Architecture (Ports & Adapters Pattern)
Hexagonal Architecture, also known as the Ports and Adapters Pattern, is a design approach that separates the core business logic from external dependencies. This ensures better maintainability, testability, and scalability of the application.

🔹 Key Concepts:
Domain (Core Business Logic)

Contains business rules and entities.
Should not depend on frameworks or external systems.
Application Layer (Use Cases)

Coordinates actions between the domain and external components.
Does not contain business logic.
Manages transactions and calls the domain layer.
Adapters (Bridges to External Systems)

Implements the ports (interfaces) to interact with external services (APIs, databases, messaging systems).
Examples: REST controllers, database repositories, message queues.
Infrastructure (Technical Details)

Provides implementations for adapters.
Deals with database connections, external APIs, and file systems.
⚡ Benefits of Hexagonal Architecture:
✅ Decouples business logic from external concerns.
✅ Makes it easy to switch databases, APIs, or frameworks.
✅ Enhances unit testing by allowing mocks and stubs.
✅ Supports multiple interfaces (e.g., REST, CLI, Messaging).
