//  ---------------------------- EJERCICIO 1 --------------------------------

function contarDespues(numero){
    for (let i = numero + 1; i <= numero + 10; i++){
        console.log(i);
    }
}

contarDespues(5);



//  ---------------------------- EJERCICIO 2 --------------------------------


function detres(){
    for(let i=5; i<=20; i+= 3){
       console.log(i)
}
}

detres()


//  ---------------------------- EJERCICIO 3 --------------------------------


function cien(){
    let suma = 0
for(let b=0; b<=100; b++){
    suma += b
}
console.log(suma)
}

cien()


//  ---------------------------- EJERCICIO 4 --------------------------------

function factorial(numero){
    let resultado = numero;
    for(let i = 1; i <= numero; i++){
        resultado *=  i ;    ;
    }
    console.log(resultado)
}

factorial(10);



//  ---------------------------- EJERCICIO 5 --------------------------------


function fibonacci (maximo){
    let n1 = 0;
    let n2 = 1;
    let n3 = n1 + n2;
    while(n3 <= maximo){
        console.log(n3);
        n1 = n2;
        n2 = n3;
        n3 = n1 + n2;
    }
}
fibonacci(40);