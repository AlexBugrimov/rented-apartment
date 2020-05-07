import React from 'react';
import './App.css';
import {BrowserRouter as Router, Route, Switch,} from "react-router-dom";
import routers from "./routers";
import NavPanel from "./components/NavPanel";

function App() {
  return (
    <Router>
      <NavPanel/>
      <div className="MainContent">
        <div className="Header">Информация</div>
        <div className="Info">
            <Switch>
              {routers()
                .map(({item, exact, route, page}) => (<Route key={item} exact={exact} path={route} component={page}/>))}
            </Switch>
        </div>
      </div>
    </Router>
  );
}

export default App;
