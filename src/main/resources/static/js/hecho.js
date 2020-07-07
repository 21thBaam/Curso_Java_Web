function hecho(){
	Swal.fire({
	  position: 'top-end',
	  icon: 'success',
	  title: 'Your work has been saved',
	  showConfirmButton: false,
	  timer: 1500
	}).then( (result)=>{
	    	document.getElementById("myForm").submit();
	    });
}