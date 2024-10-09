import java.io.File

fun leerArchivo(ruta: String): String{
    val arvhivo = File(ruta)
    return arvhivo.readText()

}

fun escribirEnArchivos(ruta:  String, content: String){
    val archivo = File(ruta)
    archivo.appendText(content)
}

fun main(args: Array<String>) {
    val ruta = "C:/Users/Wilfredo Portillo/OneDrive - Universidad de Oriente/Escritorio/Ciclo IV/Estructura de datos/PracticaSeis/Documentos/archivo.txt"
    val contenido = leerArchivo(ruta)


    /*Ejemplo 1- Lectura de Archivos */
    println(contenido)
    println("\n")

 
    /*Ejemplo 2 - Escribir un archivo */
    val escritura = "\nEsta es una prueba de appendText."

    escribirEnArchivos(ruta, escritura)
    println("Creado Exitosamente")
}