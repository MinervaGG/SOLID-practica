## ERRORES

### Principio abierto / cerrado
Se han modificado los if/else anidados en la clase "FileManager" de modo que ya no existen pero mantienen su función.

### Principio de responsabilidad única
Se han sacado los métodos de conversión de ficheros de la clase "File", y se han pasado a la clase "FileConvertion" de 
modo que cada clase tenga una funcionalidad única.

### Segregación de interfaces
Se ha dividido la interfaz "FileSystemItem" en dos nuevas interfaces más pequeñas y específicas relacionadas con
ficheros y directorios respectivamente.