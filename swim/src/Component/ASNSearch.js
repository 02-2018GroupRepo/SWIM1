import React from 'react';
import ASNDisplay from './ASNDisplay';
class ASNSearch extends React.Component {
	displayASN(){

	}  

   render() {
   	var styles = {
   		visibility: 'hidden'
   	}
   	let {doorNumber} = this.props;
   	let {asnDisplay} = this.props;

   	if(doorNumber > 0){
   		styles = null;

   	}
   	
   
	      return (
	      	<div style={styles} className="asn-search">
	      	<form>
	      		<label>Enter an ASN: </label>
	      		<input type="text" placeholder="Search.." />
	      		<button className="search-btn">Search</button>
	      	</form>
	      	<ASNDisplay /> 
	      	</div>
       
      );
   }
}
export default ASNSearch