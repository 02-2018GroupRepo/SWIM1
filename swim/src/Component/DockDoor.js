import React from 'react';
import ASNSearch from './ASNSearch';
import ASNDisplay from './ASNDisplay';

class DockDoor extends React.Component {
	
	
	//try this way of writing state to see if it works
	//showing other ways you will see state being written
	//updated react doesnt require constructor or super
	state = {
		
	selectDoor: 0
	
	}

	constructor(){
		super();
		this.state = {
			selectDoor: 0

		}
	}

	//clean and tight function #nice
   selected = (selection) => (event) => {
   	this.setState({[selection]: event.target.value })
   }

   render() {
   	   
	      return (
	      	<div className="dock-door">
	      	<form>
		      	<label>Select Dock Door</label>
		      		<select onChange={this.selected('selectDoor')}>
		      			<option value="0">Select</option>
		      			<option value="1">1</option>
					    <option value="2">2</option>
					    <option value="3">3</option>
					    <option value="4">4</option>
		      		</select>
		      		<ASNSearch doorNumber={this.state.selectDoor}/>
		      		
	      	</form>
	      	</div>
       
      );
   }
}
export default DockDoor
