import React from 'react';
import './App.css';
import {BrowserRouter as Router, Link, Route, Switch,} from "react-router-dom";
import routers from "./routers";


function App() {
  return (
    <Router>

        {routers().map(({item, route, label}) => (route && <Link key={item} to={route}>{label}</Link>))}

      <Switch>{routers().map(
        ({item, exact, route, page}) => (<Route key={item} exact={exact} path={route} component={page}/>)
      )}
      </Switch>
    </Router>
  );
}

export default App;
