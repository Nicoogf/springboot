import { useEffect, useState } from 'react';
import './App.css';
import ListUsers from './Components/List';


interface User{
  nick: string
  subMonts: number
  avatar: string
  desc?: string
}

interface AppState {
  subs: Array<User>
  newSubsNumber : number 
}

function App() {


  const initialState =[
    {
      nick:"dapelu",
      subMonts : 3,
      avatar : "https://i.pravatar.cc/150?u=dapelu",
      desc:"Hace de moderador aveces"
    },
    {
      nick:"sergio_serrano",
      subMonts : 5,
      avatar : "https://i.pravatar.cc/150?u=sergio_serrano",
     
    }
  ]

  
  const [subs , setSubs] = useState<AppState["subs"]>([]) ;
  const [ newSubsNumber, setNewSubsNumber ] = useState<AppState["newSubsNumber"]>();

  
  useEffect( () => {
    setSubs(initialState)
  } , [])

  return (
    <div className="App">
     <h1> MiduSubs </h1>
    <ListUsers subs={subs} />
    </div>
  );
}

export default App;
