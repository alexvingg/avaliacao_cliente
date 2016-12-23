(function () {
    'use strict';

    angular
        .module('app')
        .factory('ClientesService', ClientesService);

    ClientesService.$inject = ['$resource'];

    function ClientesService($resource) {
        return $resource('/clientes/:codigoCliente', { codigoCliente: '@_codigoCliente' }, {
            update: {
                method: 'PUT'
            }
        });
    }

} ());
