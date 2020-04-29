import React from 'react';
import {render} from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import Layout from "./Layout";

render(
  <React.StrictMode>
    <Layout>
      <App/>
    </Layout>
  </React.StrictMode>,
  document.getElementById('root')
);

serviceWorker.unregister();
