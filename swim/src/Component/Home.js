import React, { Component } from "react";
import Header from './Header';
import Footer from './Footer';
 
class Home extends Component {
  render() {
  	
    return (
        <div className="home">
			<Header />

			<div className="middle">
				<div className="receive-btn">
					<button className="home-btn">Receiving</button> 
				</div>

				<div className="outbound-btn">
					<button className="home-btn">Outbound</button>
				</div>
			</div>

			<Footer />
         
          
        </div>
    );
  }
}

export default Home;