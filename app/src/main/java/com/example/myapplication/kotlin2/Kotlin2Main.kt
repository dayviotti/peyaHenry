package com.example.myapplication.kotlin2

// 1. Declaración y uso de funciones básicas
fun suma(a: Int, b: Int): Int{
    return a + b
}

fun saludar(nombre: String = "Daiana"): Unit{
    println("Hola $nombre")
}

fun greet(name: String) {
    println("Hola, $name!")
}

// 2. Funciones inline y de una sola expresión
val square: (Int) -> Int = { it * it }
inline fun multiply(a: Int, b: Int, transform: (Int) -> Int): Int {
    val result = a * b
    return transform(result)
}

// 3. Introducción a lambdas y funciones de orden superior
fun lambdaExample() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val numbersDuplicate = numbers.map{ it * 2}
    println(numbersDuplicate)

    val numbersFilter = numbers.filter { it % 2 == 0 }
    println(numbersFilter)
}

// 4. Clases y objetos
class Person(protected val name: String, protected var age: Int) {

    fun imprimirInformacion(){
        println("Soy $name y tengo $age años")
    }
}

// 5. Constructores y datos encapsulados
class Auto(private val brand: String, private val model: String, private val year: Int) {

    private var puertas: Int = 5
    private var nombreCompleto: String = ""

    constructor(brand: String, model: String, year: Int, puertas: Int)
                : this(brand,model,year){
                    this.puertas = puertas
                }

    init {
        nombreCompleto = "$brand $model"
        println("Auto creado: $nombreCompleto del año $year con $puertas puertas.")
    }
}

fun main(){
    println(suma(2,1))
    saludar()
    greet("Lucas")
    println(multiply(2,3,square))
    lambdaExample()

    val persona = Person("Daiana",22)
    persona.imprimirInformacion()

    val auto = Auto(brand = "Toyota", model = "Corolla", year = 2022)

}
