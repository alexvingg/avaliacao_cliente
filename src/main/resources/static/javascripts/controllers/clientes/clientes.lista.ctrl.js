(function () {
  'use strict';
  angular
    .module('app')
    .controller('ClientesListaCtrl', ClientesListaCtrl);

  ClientesListaCtrl.$inject = ['ClientesService','$state'];

  function ClientesListaCtrl(ClientesService, $state) {
    var vm = this;

    vm.clientes = [];

    vm.carregarClientes = function(){
        ClientesService.query(function(data) {
            vm.clientes = data;
        });
    };

    vm.adicionar = function(){
      $state.go('clientes.add');
    }

    vm.carregarClientes();

  }

})();