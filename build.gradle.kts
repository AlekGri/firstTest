plugins {
    // Поддержка запуска из командной строки
    application
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}
dependencies {
    testImplementation("junit:junit:4.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

// Для плагина application указываем главный класс приложения
application {
    // Входная точка
    mainClass.set("SomeClass")
}
