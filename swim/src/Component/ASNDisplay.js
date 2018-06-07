import React from 'react';
import axios from 'axios';

class ASNDisplay extends React.Component {
	constructor(){
		super();
		this.state = {
			serialNumbers: []
		}
	}
	  

   render() {

   
   
   	   
	      return (
	      	<div className="received-table">
	      		<table>
	      			<tr>
	      				<th>Serial No.</th>
	      				<th>Received?</th>
	      			</tr>
	      		</table>
	      	</div>
   	
      );
   }
}
export default ASNDisplay