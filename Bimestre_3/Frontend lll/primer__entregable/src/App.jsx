import { useState } from 'react'
import './App.css'
import Form from './Form';
import Card from './Card';

function App() {

 const [summoners,setSummoner]=useState([]);

  const AddSummoner= (summoner) => {
    setSummoner([...summoners,summoner]);
    console.log(summoner)
  };
  
  return (
   <div className="App">
      <Form onAddSummoner={AddSummoner}/>
      <Card summoners={summoners}/>
   </div>
  );
}

export default App
