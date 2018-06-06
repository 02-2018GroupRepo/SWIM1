import React from 'react';

class ASNSearch extends React.Component {
	  

   render() {
   	var styles = {
   		visibility: 'hidden'
   	}
   	let {doorNumber} = this.props;

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

	      	</div>
       
      );
   }
}
export default ASNSearch