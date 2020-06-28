function deletePerson(id){
    swal({
        title: "Seguro que quieres eliminar este usuario?",
        text: "Una vez eliminado no se podrá restaurar",
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
        .then((OK) => {
            if (OK) {
                $.ajax({
                    url:"/person/eliminar/"+id,
                    success: function (res) {
                        console.log(res);
                    }
                });
                swal("Usuario eliminado correctamente!", {
                    icon: "success",
                }).then((ok)=>{
                    if(ok){
                        location.href="/person/listar";

                    }
                    }
                );
            } else {
                swal("No se borró al usuario");
            }
        });
}

