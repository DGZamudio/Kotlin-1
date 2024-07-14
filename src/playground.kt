fun main() {
    //Definicion de variables
    var text = "Esto es una cadena de texto"
    var number = 3
    var decimal = 3.0
    var boleano = true

    println(text)
    println("$number Esto es una variable de tipo entero")
    println("$decimal Esto es una variable de tipo decimal")
    println("$boleano Esto es una variable de tipo boleano")

    //Nulos y opcionales
    var nombre: String? = null
    if (nombre != null){
        println(nombre.length)
    }
    else{
        println("El nombre es nulo")
    }
}
