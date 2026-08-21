# gestor-gastos-java-pruebas

Rastreador de gastos personales en Java, construido con Gradle. Es un proyecto
de práctica pensado para escribir pruebas unitarias sobre una base de código
limpia y modular que aplica principios SOLID desde el diseño (inyección de
dependencias por constructor, separación de responsabilidades entre modelo,
repositorio, validación y servicios).

## Requisitos

- JDK 25 (o superior). El proyecto usa un toolchain de Gradle, por lo que
  puede descargar y usar automáticamente el JDK requerido si no está
  instalado localmente.
- No es necesario tener Gradle instalado: el proyecto incluye el Gradle
  Wrapper (`gradlew` / `gradlew.bat`).

## Compilar y ejecutar pruebas

```bash
./gradlew build
```

En Windows (PowerShell / cmd):

```bash
gradlew.bat build
```

## Estructura de carpetas

```
gestor-gastos-java-pruebas/
├── build.gradle
├── settings.gradle
├── gradlew, gradlew.bat
├── gradle/wrapper/
└── src/
    ├── main/java/com/practica/expensetracker/
    │   ├── model/          Categoria, Gasto
    │   ├── repository/     RepositorioGastos, RepositorioGastosEnMemoria
    │   ├── service/        ValidadorGasto, RastreadorGastos, ServicioReporte
    │   └── exception/      Excepciones de validación de Gasto
    └── test/java/com/practica/expensetracker/   (vacío, pruebas en una fase posterior)
```

## Dependencias de pruebas

Configuradas en `build.gradle` pero sin pruebas escritas todavía:

- JUnit Jupiter (JUnit 5) para pruebas unitarias
- Mockito para mocks
- AssertJ para aserciones fluidas
