app.factory('cadastroEmpresaServices', ['$http', function($http) {

       
        function cadastrar(empresa, callback) {
        	
        	console.log(JSON.stringify(empresa));
            $http({
                method:'POST',
                url:'http://smart-rh.herokuapp.com/api/empresas',
                data:JSON.stringify(empresa)
            }).then(function (data) {
                if (callback) callback(data)
            });
        }
        
        return {
            cadastrar:cadastrar
        };
    }])