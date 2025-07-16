# CalculadoraPropinas2

📱 Calculadora de Propinas
Una app básica en Android desarrollada con Kotlin que permite calcular el monto de propina a partir del total de una cuenta, con selección de porcentaje o ingreso personalizado.

✅ Características
Entrada de monto total

Selección de porcentaje (10%, 15%, 20%)

Ingreso de propina personalizada (%)

Cálculo de propina y total

Animaciones suaves en resultados

Botón para limpiar campos

Guarda la última selección con SharedPreferences

📂 Estructura de Archivos
css
Copiar
Editar
app/
└── src/
    └── main/
        ├── java/
        │   └── com/sakhura/calculadorapropinas/
        │       ├── MainActivity.kt
        │       └── utils/
        │           └── CalculadoraUtils.kt
        └── res/
            └── layout/
                └── activity_main.xml
🧰 Tecnologías utilizadas
  *Kotlin
  *Android SDK
  *View system (EditText, RadioGroup, Button, TextView)
  *SharedPreferences
  *Animaciones simples con View.animate()

🚀 Cómo ejecutar el proyecto
Clona o descarga el repositorio

bash
Copiar
Editar
git clone https://github.com/tu-usuario/calculadora-propinas.git
Ábrelo en Android Studio

Selecciona Open > build.gradle (nivel del proyecto)

Configura un emulador o conecta tu dispositivo Android

Ejecuta la app:

Haz clic en ▶️ "Run app"

🧪 Cómo usar la app
  *Ingresa el monto total de la cuenta.
  *Selecciona un porcentaje predefinido (10%, 15% o 20%) o escribe tu propio porcentaje en el campo personalizado.
  *Presiona "Calcular".
  *Verás el valor de la propina y el total final, con una animación suave ✨.
  *Presiona "Limpiar" para reiniciar todo.

💡 Ejemplo de UI
Pantalla Inicial	Resultado Calculado

<img width="371" height="548" alt="image" src="https://github.com/user-attachments/assets/58d913ef-ce89-4e09-92f3-9f55cfeab5ab" />

<img width="383" height="353" alt="image" src="https://github.com/user-attachments/assets/b5730292-b686-4079-bc26-42aafc3dd42e" />

<img width="372" height="346" alt="image" src="https://github.com/user-attachments/assets/83ae0a01-db97-4cba-9e0d-2473fbcae37d" />

<img width="366" height="352" alt="image" src="https://github.com/user-attachments/assets/f8f322cc-5433-416e-85bc-3392f1fb35ea" />




✨ Mejora continua
Este proyecto es ideal para quienes comienzan con Kotlin y Android. Algunas ideas de mejoras futuras:

Dark mode 🌙

Internacionalización 🌍

Test unitarios y de UI 🧪

Uso de Jetpack Compose

🧑‍💻 Autor
Desarrollado por [Sakhura] (https://github.com/Sakhura) 
