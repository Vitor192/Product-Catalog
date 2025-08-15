plugins {
	java
	id("org.springframework.boot") version "3.5.4"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
<<<<<<< HEAD
=======
description = "Shopping-cart"
>>>>>>> 23f7afd (Microsserviço criado, shopping-cart, pacotes criados como controller e classe CartController, com métodos addItem, buscar carrinho por ID e clear; pacotes model com classes Cart e Item; repository com CartRepository; e pacote config com RedisConfig)

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
<<<<<<< HEAD
=======
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
>>>>>>> 23f7afd (Microsserviço criado, shopping-cart, pacotes criados como controller e classe CartController, com métodos addItem, buscar carrinho por ID e clear; pacotes model com classes Cart e Item; repository com CartRepository; e pacote config com RedisConfig)
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
