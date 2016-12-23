(function () {
  'use strict';
  angular
    .module('app')
    .controller('ClientesFormCtrl', ClientesFormCtrl);

  ClientesFormCtrl.$inject = ['ClientesService','$state'];

  function ClientesFormCtrl(ClientesService, $state) {
    var vm = this;

    vm.cliente = {};

    vm.salvar = function(){
        vm.loginLoading = true;
        ClientesService.save(vm.cliente).$promise.then(function (data) {
            vm.voltar();
        });
    };

    vm.voltar = function(){
        $state.go('clientes.list');
    };

  }

})();