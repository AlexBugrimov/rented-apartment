import React from 'react';
import routers from "../routers";
import {Link} from "react-router-dom";
import "./NavPanel.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faCodeBranch} from "@fortawesome/free-solid-svg-icons";



export default () => (
  <div className="NavPanel">
    <h2 className="NavTitle">Аренда</h2>
    <ul>{routers()
      .map(({item, route, label, icon}) =>
        (route && <li className="NavItem" key={item}>
          <Link className="NavItemLink" to={route}><FontAwesomeIcon icon={icon} />{label}</Link>
        </li>))}
    </ul>
    <div className="RepoLink">
      <Link to="/"><FontAwesomeIcon icon={faCodeBranch}/></Link>
    </div>
  </div>
);