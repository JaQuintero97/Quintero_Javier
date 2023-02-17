const lista = [
  "Mean Girls",
  "Die Hard",
  "Hot Fuzz",
  "Kill Bill",
  "John Wick",
  "Shrek",
  "Ted",
  "The Godfather",
  "Avengers",
  "Amelie",
  "The Dark Knight",
  "Angry Men",
  "Flashback",
  "Luca",
  "Cruella",
  "Pulp Fiction",
  "The Good, the Bad and the Ugly",
  "Fight Club",
  "Forrest Gump",
  "Inception",
  "Goodfellas",
  "Life Is Beautiful",
  "Spirited Away",
  "Interstellar",
  "The Pianist",
  "etc"
];


function peliculas() {
  const pelicula = lista.map(peli =>
    React.createElement('li', {key: peli}, peli)
  )
  return React.createElement('ul', null, pelicula )
}

ReactDOM.render(
peliculas(),
document.getElementById("root")
)