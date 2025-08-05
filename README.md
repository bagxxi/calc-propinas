# Calculadora de Propinas

Una aplicación Android desarrollada en Kotlin para calcular propinas de manera fácil y rápida.

## Descripción

Esta aplicación permite a los usuarios calcular propinas basándose en el monto de la cuenta y diferentes porcentajes predefinidos o personalizados. La aplicación guarda las preferencias del usuario para una mejor experiencia de uso.

## Características

- 🧮 Cálculo rápido de propinas
- 📊 Porcentajes predefinidos (10%, 15%, 20%)
- ✏️ Opción de porcentaje personalizado
- 💾 Guarda las preferencias del usuario
- 🎨 Interfaz intuitiva y fácil de usar
- 🌙 Soporte para tema oscuro

## Capturas de Pantalla

_Próximamente_

## Requisitos del Sistema

- Android 5.0 (API nivel 21) o superior
- ~5 MB de espacio libre

## Instalación y Ejecución

### Prerrequisitos

1. **Android Studio** (Arctic Fox o superior)
2. **JDK 8** o superior
3. **SDK de Android** (API 21+)

### Pasos para ejecutar el proyecto

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/bagxxi/calc-propinas.git
   cd CalculadoraPropinas2
   ```

2. **Abrir en Android Studio:**
   - Abre Android Studio
   - Selecciona "Open an existing Android Studio project"
   - Navega hasta la carpeta del proyecto y selecciónala

3. **Sincronizar dependencias:**
   - Android Studio automáticamente sincronizará las dependencias de Gradle
   - Si no se sincroniza automáticamente, haz clic en "Sync Now" cuando aparezca la notificación

4. **Ejecutar la aplicación:**
   - Conecta un dispositivo Android o configura un emulador
   - Haz clic en el botón "Run" (▶️) o presiona `Shift + F10`

### Compilación desde línea de comandos

```bash
# Para compilar el proyecto
./gradlew assembleDebug

# Para ejecutar tests
./gradlew test

# Para instalar en dispositivo conectado
./gradlew installDebug
```

## Estructura del Proyecto

```
app/
├── src/main/
│   ├── java/com/bagxxi/calculadorapropinas/
│   │   ├── MainActivity.kt          # Actividad principal
│   │   └── utils/
│   │       └── CalculadoraUtils.kt  # Utilidades de cálculo
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # Layout principal
│   │   ├── values/
│   │   │   ├── colors.xml           # Colores de la app
│   │   │   ├── strings.xml          # Strings de la app
│   │   │   └── themes.xml           # Temas de la app
│   │   └── ...
│   └── AndroidManifest.xml
└── build.gradle.kts
```

## Tecnologías Utilizadas

- **Kotlin** - Lenguaje de programación principal
- **Android SDK** - Framework de desarrollo
- **Gradle** - Sistema de construcción
- **Material Design** - Diseño de interfaz

## Uso de la Aplicación

1. **Ingresar monto:** Introduce el monto total de la cuenta
2. **Seleccionar porcentaje:** Elige entre las opciones predefinidas (10%, 15%, 20%) o ingresa un porcentaje personalizado
3. **Calcular:** Presiona el botón "Calcular" para obtener el monto de la propina y el total
4. **Limpiar:** Usa el botón "Limpiar" para resetear todos los campos

## Contribución

Las contribuciones son bienvenidas. Por favor:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/NuevaCaracteristica`)
3. Commit tus cambios (`git commit -m 'Agrega nueva característica'`)
4. Push a la rama (`git push origin feature/NuevaCaracteristica`)
5. Abre un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## Autor

**bagxxi** - [GitHub](https://github.com/bagxxi)
En base a desarrollo de Sakhura [GitHub](https://github.com/Sakhura)

## Agradecimientos

- Comunidad de desarrollo Android
- Documentación oficial de Kotlin
- Material Design Guidelines

---

⭐ Si este proyecto te fue útil, no olvides darle una estrella!
