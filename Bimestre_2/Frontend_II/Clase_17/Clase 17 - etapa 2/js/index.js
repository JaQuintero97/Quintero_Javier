const btn = document.querySelector("#random");
const fotoPerro =document.querySelector("#tarjeta");
const apiUrl = "https://pokeapi.co/api/v2/pokemon/";

btn.addEventListener("click", function() {
    peticion(apiUrl);
})


function peticion(url) {
    
    let random = Math.floor(Math.random() * 1153);
    let apiRandom = url+random;

    fetch(apiRandom)
    .then(respuesta => {
        return respuesta.json();
    })
    .then(datos => {
        console.log(datos);
        fotoPerro.innerHTML = `<img src="${datos.sprites.other.dream_world.front_default}" alt="Imagen de ${datos.name}"/>
        <h1>${datos.name}</h1>`;
    })
}



/*
function peticion(url) {

    fetch(url)

    .then(respuesta => {
        console.log("respuesta sin parsear")
        console.log(respuesta);
        return respuesta.json()
    })
    
    .then(datos => {
        console.log("respuesta parseada")
        console.log(datos);https://pokeapi.co/api/v2/pokemon/ditto
        console.log(datos.message);
        fotoPerro.innerHTML=`<img src="${datos.message}">`
    })

    .catch( error => {
        console.log(error);
    })

    

}
*/