# 🐛 Reporte de Bugs Encontrados y Corregidos (Bloque D)
**Estudiante:** [Christian Tipantaxi]  
**Paralelo:** [ E2] | **Fecha:** [01/09/2026]  

---

## 1. 🔍 Bug de HTML Encontrado (D1)
- **¿Qué fallaba?:** <!-- TODO: Describe qué elemento HTML estaba roto o faltante --> el header no estaba cerrado bien y a la note le faltaba el id de la 2
- **Causa Raíz:** <!-- TODO: Explica por qué generaba el fallo --> que el html estaba incompleto y el js no podía identificar algunos elementos
- **Solución Aplicada:** <!-- TODO: Explica cómo lo corregiste --> le puse la etiqueta al haeder, puse el id para la nota 2 y  al segundo input y le puse el id btn-calcular al botón.

---

## 2. 🔍 Bug de CSS Encontrado (D2)
- **¿Qué fallaba?:** <!-- TODO: Describe qué propiedad o selector CSS fallaba --> que las propiedades del css estaban mal escritas
- **Causa Raíz:** <!-- TODO: Explica por qué fallaba el diseño --> que al estar mal escritas no se aplicaban al css
- **Solución Aplicada:** <!-- TODO: Explica qué regla CSS ajustaste -->le cambie  por display: flex, align-items: center y cursor: pointer

---

## 3. 🔍 Bug de JavaScript Encontrado (D3)
- **¿Qué fallaba?:** <!-- TODO: Describe qué comportamiento de JS no funcionaba --> que el calculo del promedio estama mal, el segundo input no era encontrado, los valores no se convertían a números y el textContent estaba mal escrito y que el botón no era seleccionado
- **Causa Raíz:** <!-- TODO: Explica por qué fallaba la lógica o el evento --> que la formula estaba mal y el escrito tambien estaba algunas mal
- **Solución Aplicada:** <!-- TODO: Explica qué líneas de código modificaste -->corregi  la fórmula del promedio, cambie el selector por #nota2 y converti los valores usando Number() y la escritura

---

## 4. ✅ Verificación en Consola del Navegador (D5)
- [ ] Presioné F12 en el navegador.
- [ ] Fui a la pestaña **Console**.
- [ ] Verifiqué que **NO aparezca ningún error en rojo**.
