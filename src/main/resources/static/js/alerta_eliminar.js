function dtn(id,opc){
	var urls = ["/maestro/eliminar/","/alumno/eliminar/"];
	Swal.fire({
	  title: 'Are you sure?',
	  text: "You won't be able to revert this!",
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  confirmButtonText: 'Yes, delete it!'
	}).then((result) => {
	  if (result.value) {
	  	console.log(id);
	  	$.ajax({
	  		url:""+urls[opc]+id,
	  		success: function(res){
	  		}
	  	});
	    Swal.fire(
	      'Deleted!',
	      'Your file has been deleted.',
	      'success'
	    ).then( (result)=>{
	    	if(result.value){
	    		location.href="/admin";
	    	}
	    });
	  }
	})
}