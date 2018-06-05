import React, { Component } from 'react';
import Header from './Component/Header';
import Home from './Component/Home';
import Footer from './Component/Footer';
import { Route, Link } from 'react-router-dom';
import './index.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        {/*<Route exact path="/" component={Header} />*/}
        <Route exact path="/" component={Home} />
        {/*<Route exact path="/" component={Footer} />*/}
      </div>
    );
  }
}

export default App;
