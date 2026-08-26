# 🎓 Evaluación Diagnóstica: Programación Móvil
### 3° Bachillerato Técnico en Informática — UETS (2026–2027)

> [!IMPORTANT]
> **Modelo Evaluativo Dual MIT (10.0 Puntos Total):**
> - **Bloque A (50% · 5.0 pts):** Código en GitHub evaluado por Autograding Bot en Pull Request.
> - **Bloque B (50% · 5.0 pts):** Video Screencast demostrativo oral explicando el código y pruebas.

---

## 📺 Diapositivas Interactivas 16:9

Puedes acceder a la presentación oficial proyectable directamente desde tu navegador:

👉 **[Ver Diapositivas en Vivo en GitHub Pages](https://uets-programacion-movil.github.io/01-diagnostica/)** *(o abre `index.html` localmente).*

- **Navegación:** Teclas `[←]` `[→]` o `[Espacio]`.
- **Pantalla Completa:** Presiona `[F]`.
- **Quizzes Formativos:** Preguntas interactivas con retroalimentación inmediata.

---

## 📁 Estructura del Taller Diagnóstico

```text
01-diagnostica/
├── bloque_a/            # CE1: Lógica y Fundamentos de Java (Ejercicio1 a Ejercicio5)
├── bloque_b/            # CE2: Estructura y Maquetación Web (HTML5 + CSS3 Flexbox/Grid)
├── bloque_c/            # CE3: Interactividad con JavaScript y DOM (let/const, eventos)
├── bloque_d/            # CE4: Depuración Integradora y Triada Web (Corregir bugs y reporte)
├── tests/               # Suites de Autograding y verificación local
├── CHEATSHEET_ESTUDIANTE.md
└── package.json
```

---

## 🛠️ Guía Rápida de Trabajo

1. **Instalar Dependencias:**
   ```bash
   pnpm install
   ```

2. **Resolver los Retos:**
   - Completa las instrucciones marcadas con `// TODO:` en cada carpeta (`bloque_a`, `bloque_b`, `bloque_c`, `bloque_d`).

3. **Verificar tus Avances:**
   ```bash
   # Probar todos los retos juntos:
   pnpm run test:all

   # O probar bloque por bloque:
   pnpm run start:01   # Bloque A
   pnpm run start:02   # Bloque B
   pnpm run start:03   # Bloque C
   pnpm run start:04   # Bloque D
   pnpm run check      # Verificación de tipos
   ```

4. **Entregar tu Trabajo con Git Flow:**
   - Realiza tus commits con formato semántico (`feat: ...`, `fix: ...`, `style: ...`).
   - Sube tus cambios a tu fork (`git push origin main`).
   - Abre un **Pull Request (PR)** hacia el repositorio principal.
   - Pega el enlace de tu **Screencast (Loom/OBS)** en la descripción del PR.
