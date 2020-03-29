import React from 'react';
import './App.css';
import {BrowserRouter as Router, Link, Route, Switch,} from "react-router-dom";
import Home from './pages/Home';
import Counts from './pages/Counts';
import Tariffs from './pages/Tariffs';
import Payments from './pages/Payments';
import NoMatch from './pages/NoMatch';

function App() {
  return (
    <Router>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/counts">Счетчики</Link>
        </li>
        <li>
          <Link to="/tariffs">Тарифы</Link>
        </li>
        <li>
          <Link to="/payments">Оплата</Link>
        </li>
      </ul>
      <Switch>
        <Route exact path="/" component={Home}/>
        <Route path="/counts" component={Counts}/>
        <Route path="/tariffs" component={Tariffs}/>
        <Route path="/payments" component={Payments}/>
        <Route component={NoMatch}/>
      </Switch>
    </Router>
  );
}

export default App;
