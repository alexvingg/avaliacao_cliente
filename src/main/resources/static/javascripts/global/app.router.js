(function () {
  'use strict';
  angular
    .module('app')
    .config(RouteConfig);

  RouteConfig.$inject = ['$stateProvider', '$urlRouterProvider'];

  function RouteConfig($stateProvider, $urlRouterProvider) {



    $stateProvider.state('clientes', {
        abstract: true,
        url: '/clientes',
        templateUrl: '/templates/clientes/clientes.html',
      }).state('clientes.list', {
        url: '/lista',
        templateUrl: '/templates/clientes/clientes-lista.html',
        controller: 'ClientesListaCtrl as ctrl'
      }).state('clientes.add', {
        url: '/add',
        templateUrl: '/templates/clientes/clientes-form.html',
        controller: 'ClientesFormCtrl as ctrl'
      });;


    $urlRouterProvider.otherwise('clientes/lista');

  }
})();