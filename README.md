# Spring Boot DevOps Demo

## 🇪🇸 Descripción

Proyecto backend desarrollado con Spring Boot y Gradle, utilizado como aplicación principal para implementar un pipeline completo de CI/CD y despliegue automatizado.

Este proyecto forma parte de una arquitectura DevOps que incluye:

- Jenkins (Continuous Integration)
- Docker
- Private Docker Registry
- GitHub Actions
- Self-hosted Runners
- Terraform (Infrastructure as Code)
- Docker Compose
- PostgreSQL
- Adminer

---

## 🚀 Flujo CI/CD Implementado

### Continuous Integration (CI)

- Push hacia la rama `develop`
- Jenkins ejecuta:
  - pruebas unitarias
  - build del artefacto `.jar`
  - construcción de imagen Docker
  - push automático al Private Registry

### Continuous Delivery (CD)

- Pull Request `develop → main`
- Merge hacia `main`
- GitHub Actions ejecuta deploy automático
- Docker Compose actualiza contenedores en servidor remoto

---

## Tecnologías Utilizadas

- Java 21
- Spring Boot
- Gradle
- Docker
- GitHub Actions
- Jenkins
- PostgreSQL
- Adminer

---

##  Ejecutar Localmente

```bash
./gradlew bootRun
```

Aplicación disponible en:

```text
http://localhost:8080/hello
```

---

## Docker

Construir imagen:

```bash
docker build -t springboot-app .
```

Ejecutar contenedor:

```bash
docker run -p 8080:8080 springboot-app
```

---

# 🇺🇸 Description

Backend project developed with Spring Boot and Gradle, used as the main application for implementing a complete CI/CD and automated deployment pipeline.

This project is part of a DevOps architecture that includes:

- Jenkins
- Docker
- Private Docker Registry
- GitHub Actions
- Self-hosted Runners
- Terraform
- Docker Compose
- PostgreSQL
- Adminer

---

## 🚀 Implemented CI/CD Flow

### Continuous Integration (CI)

- Push to `develop` branch
- Jenkins automatically executes:
  - unit tests
  - `.jar` artifact build
  - Docker image build
  - automatic push to Private Registry

### Continuous Delivery (CD)

- Pull Request `develop → main`
- Merge into `main`
- GitHub Actions triggers automatic deployment
- Docker Compose updates containers on remote server

---

## Technologies Used

- Java 21
- Spring Boot
- Gradle
- Docker
- GitHub Actions
- Jenkins
- PostgreSQL
- Adminer

---

## Run Locally

```bash
./gradlew bootRun
```

Application available at:

```text
http://localhost:8080/hello
```

---

## Docker

Build image:

```bash
docker build -t springboot-app .
```

Run container:

```bash
docker run -p 8080:8080 springboot-app
```
---

## Autor | Author

Emanuel Gonzalez

Systems Engineering Student | Backend & DevOps Enthusiast