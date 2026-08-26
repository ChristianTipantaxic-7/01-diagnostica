# 📋 Cheatsheet del Estudiante: Evaluación Diagnóstica
### Programación Móvil — 3° Bachillerato Técnico (UETS 2026-2027)

---

## 🛠️ 1. Comandos de Verificación Local

Ejecuta estos comandos en tu terminal de VS Code para verificar tus retos:

```bash
# Probar todos los retos juntos
pnpm run test:all

# Probar reto por reto individualmente
pnpm run start:01   # Bloque A: Lógica & Java
pnpm run start:02   # Bloque B: HTML5 & CSS3
pnpm run start:03   # Bloque C: JavaScript & DOM
pnpm run start:04   # Bloque D: Depuración Triada

# Verificar que no tengas errores de tipado
pnpm run check
```

---

## 🚀 2. Flujo Git y Conventional Commits

Utiliza prefijos semánticos en tus commits:

```bash
# Agregar cambios
git add .

# Ejemplos de commits válidos:
git commit -m "feat: implementar solucion de bloque a con java y scanner"
git commit -m "style: maquetar bloque b con header semantico y flexbox"
git commit -m "feat: agregar eventos addeventlistener en bloque c"
git commit -m "fix: corregir bugs de triada web y documentar en bloque d"

# Subir a tu repositorio
git push origin main
```

---

## 📹 3. Requisitos del Video Screencast (Bloque B · 5.0 pts)

1. **Duración:** Máximo 5 a 6 minutos.
2. **Cámara:** Rostro visible en la esquina (Loom, Clipchamp u OBS).
3. **Contenido a Demostrar:**
   - Explicar brevemente la estructura de los 4 bloques.
   - Ejecutar `pnpm run test:all` en vivo en la terminal mostrando los 4 retos aprobados.
   - Mostrar la página web en el navegador y la consola limpia (F12).
   - Pegar el enlace público del video en la descripción del **Pull Request**.
