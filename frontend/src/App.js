import React, {useEffect, useState} from 'react';

const App = () => {

  const [users,setUsers]= useState([])
  useEffect(()=>{
    fetch('/api/users').then(value => value.json()).then(value => setUsers(value))
  },[])

  return (
      <div>
        <h1>Users:</h1>
        {users.map(user=><div key={user.id}>{JSON.stringify(user)}</div>)}
      </div>
  );
};

export {App};
