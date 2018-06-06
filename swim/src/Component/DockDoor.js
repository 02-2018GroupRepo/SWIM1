import React from 'react';
import ASNSearch from './ASNSearch'; 

class DockDoor extends React.Component {
	constructor(){
		super();
		this.state = {
			selectDoor: 0
		}
	}

   selected = (selection) => (event) => {
   	this.setState({[selection]: event.target.value })
   }

   render() {
   	   
	      return (
	      	<div className="dock-door">
	      		<select onChange={this.selected('selectDoor')}>
	      			<option value="0">Select</option>
	      			<option value="1">1</option>
				    <option value="2">2</option>
				    <option value="3">3</option>
				    <option value="4">4</option>
	      		</select>
	      		<ASNSearch doorNumber={this.state.selectDoor}/>
	      	</div>
       
      );
   }
}
export default DockDoor