(function () {
  'use strict';
  angular
    .module('app')
    .controller('ClientesFormCtrl', ClientesFormCtrl);

  ClientesFormCtrl.$inject = ['ClientesService','$state', 'toaster'];

  function ClientesFormCtrl(ClientesService, $state, toaster) {
    var vm = this;

    vm.cliente = {};

    vm.salvar = function(){
        vm.loginLoading = true;
        ClientesService.save(vm.cliente).$promise.then(function (data) {
            vm.exibirToast("Salvo com sucesso.")
            vm.voltar();
        });
    };

    vm.voltar = function(){
        $state.go('clientes.list');
    };

    vm.exibirToast = function(mensagem){
            var type = "success" ;
            toaster.pop({
                type: type,
                title: 'Cliente',
                body: mensagem,
                showCloseButton: true
            });
        }

  }

})();