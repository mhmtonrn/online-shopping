$(function(){
	//solving active menu problem
	
	switch(menu){
		
	case 'Home Page':
		$('#home').addClass('active')
		break;
		
	case 'About Us':
		$('#about').addClass('active')
		break;
		
	case 'All Products':
		$('#listProducts').addClass('active')
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active')
		break;
		
	default :
		$('#listProducts').addClass('active')
		$('#a_'+menu).addClass('active')
		break;
	}
	
});