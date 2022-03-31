const prompt = require("prompt-sync")({signint:true});

//EJERCICIOS EXTRAS 

/*Crear una función que recibe un string en minúscula, lo convierta a mayúsculas
y lo retorne.
Investigá qué hace el método de strings .toUpperCase()*/

function convertirMayusculas(string){
   console.log(string.toUpperCase());
}

convertirMayusculas("hola javier");

/*8. Crear una función que recibe un parámetro y devuelve qué tipo de dato es ese
parámetro.
Pista: te servirá revisar qué hace la palabra reservada typeof.*/

function tipoDato(dato){
    let tiopoDeDato = typeof(dato);
    console.log(tiopoDeDato);
}

let auto = {
    nombre : "ford",
    edad : 35
};

tipoDato(auto);

/*9. Crear una función que le pasamos el radio de un círculo y nos devuelve la
circunferencia.
Pista: Investigá si el objeto Math tiene entre sus propiedades el número Pi.*/

function calcularCircunferencia(){
    let resultado;
    let radio = parseFloat(prompt("Ingrese el radio de la circunferencia: "));
    resultado = 2 * Math.PI * radio;
    console.log(resultado);
}

calcularCircunferencia();
