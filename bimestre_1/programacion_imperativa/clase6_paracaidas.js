/*abrirParacaidas()
Crea una función llamada abrirParacaidas() que recibe dos parámetros: velocidad y
altura. La función deberá decirnos si el paracaídas debe abrirse teniendo en cuenta lo
siguiente:
● La velocidad debe ser menor a 1000 km/h.
● La altura debe ser mayor o igual a 2000 m y menor a 3000 m.*/

function abrirParacaidas(velocidad,altura){
    if(velocidad < 1000 && (altura >= 2000 && altura < 3000) && velocidad > 0){
        return console.log("Debes abrir el paracaídas");
    }
    console.log("No debes abrir el paracaídas");
}

abrirParacaidas(999,1500);