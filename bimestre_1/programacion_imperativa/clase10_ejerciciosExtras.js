/* Array inverso
En este ejercicio deberás crear una función que devuelva un array con sus elementos
invertidos, sin modificarlo. Luego, deberás hacer una función que lo modifique e
invierta el orden de sus elementos.
1. Creá la función imprimirInverso que tome un array como argumento y que
imprima en la consola cada elemento en orden inverso (no tenés que invertir el
array).
2. Creá la función inversor que tome un arreglo como argumento y devuelva uno
nuevo invertido.*/


function imprimirInverso(array){
    array.reverse();
    console.log(array)
}

function inversor(lista){
    let guardarLista = lista.length;
    let nuevoArray = [];
    let guardar = [];
    for(let i=0; i <= guardarLista -1; i++){
        guardar = lista.pop();
        nuevoArray.push(guardar);
    }
    console.log(nuevoArray);
}


/*sumaArray()
En este ejercicio, deberás crear una función sumaArray() que acepte un arreglo de
números (3 elementos) y devuelva la suma de todos ellos.
Ejemplo:
● sumArray([1,2,3]) // 6
● sumArray([10, 3, 10]) // 23
● sumArray([-5,100, 19]) // 114*/ 


function sumaArray(arreglo){
    let array = arreglo;
    let resultado = 0;
    for(let i = 0; i<3;i++){
        resultado += array[i];
    }
    console.log(resultado);
}


/*Simulación Array.join()
En este ejercicio deberás crear una función llamada join() que reciba un arreglo de
strings de 4 elementos y simule el comportamiento del método Array.join().
Importante: no podés usar el método Array.join() original.
Ejemplo:
● join(["h","o","l","a"]) debe retornar el string "hola".
● join(["c","h","a,"u"]) debe retornar el string "chau".*/

function join(arreglo){
    return arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3];
}

console.log(join(["h","o","l","a"]));
